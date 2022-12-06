package core.loging;

public class DataBaseILogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Logged to Database: "+ data);
    }
}
