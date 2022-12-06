package core.loging;

public class FileILogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Loged to file: "+ data);
    }
}
