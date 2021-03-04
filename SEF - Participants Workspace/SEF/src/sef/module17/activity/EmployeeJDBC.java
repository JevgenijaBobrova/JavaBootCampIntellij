package activity;
//Needs to be completed

import org.junit.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {
    Employee emp = new Employee();

    public static void main(String[] args) {
        Connection con = createConnection();
        Employee e1 = new Employee();
        e1 = findEmployeeById(1);
        System.out.println(e1.getFirstName());
        Employee e2 = new Employee();
        e2.setId(6);
        e2.setFirstName("Jane");
        e2.setLastName("Eyre");
        e2.setSalary(19);
        insertEmployee(e2);
    }

    public static Connection createConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost/activity";
        String user = "root";
        String pass = "Abstractday1!";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successfully established!");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;
    }

    public static Employee findEmployeeById(int id) {
        Connection con = createConnection();
        Employee emp = null;
        try {
            // 1 - Create a PreparedStatement with a query
            PreparedStatement pStmt = con.prepareStatement("SELECT * FROM employee WHERE id = ?");


            // 2 - Search for the given id
            pStmt.setInt(1, id);

            // 3 - Execute this query
            ResultSet rs = pStmt.executeQuery();

            // 4 - If resultset is not null, then initialize emp object with data
            if (rs.next()) {
                emp = new Employee();
                //emp.setId(Integer.parseInt(rs.getString(1)));
                emp.setId(rs.getInt(1));
                emp.setFirstName(rs.getString(2));
                emp.setLastName(rs.getString(3));
                emp.setSalary(rs.getInt(4));
            }

            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return emp;
    }

    public ArrayList<Employee> findEmployeesByName(String name) {
        Connection con = createConnection();
        ArrayList<Employee> list = new ArrayList<Employee>();

        try {
            // 1 - Create a PreparedStatement with a query


            // 2 - Search for the given id

            // 3 - Execute this query


            // 4 - While there are some records, continue

            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }

    /*public static ArrayList<Employee> findEmployeesBySalary(int salary)//error
    {
        Connection con = createConnection();
        ArrayList<Employee> list = new ArrayList<Employee>();

        try {
            // 1 - Create a PreparedStatement with a query
            PreparedStatement pStmt2 = con.prepareStatement("select * from employee where salary = ?");

            // 2 - Search for the given salary
            pStmt2.setInt(4, salary);

            // 3 - Execute this query
            ResultSet rs2 = pStmt2.executeQuery();

            // 4 - While there are records, continue


            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }*/

    public static void insertEmployee(Employee emp) {
        Connection con = createConnection();

        //1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)"
        try {
            con.setAutoCommit(false);
            PreparedStatement pStmt3 = con.prepareStatement("INSERT INTO employee (id, firstname, lastname, salary) VALUES (?,?,?,?)");
            pStmt3.setInt(1, emp.getId());
            pStmt3.setString(2, emp.getFirstName());
            pStmt3.setString(3, emp.getLastName());
            pStmt3.setInt(4, emp.getSalary());
            int rs = pStmt3.executeUpdate();


            //	Substitute the ? now.

            //2 - Execute this query using executeUpdate()
            if (rs == 1) {
                System.out.println("You have successfully inserted values");
            } else {
                System.out.println("There has been an error, try again");
            }

            con.commit();
            con.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }


    }
}


