package core.loging;

public class EmailILogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("sent to Email: "+ data);
    }
}
