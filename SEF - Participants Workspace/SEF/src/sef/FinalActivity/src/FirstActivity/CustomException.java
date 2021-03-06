package FirstActivity;

public class CustomException extends Exception{

    public String getMessage(){
        return "Custom exception - no numbers allowed in name";
    }
}
