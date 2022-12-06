package core.loging;

public class EmailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("sent to Email: "+ data);
    }
}
