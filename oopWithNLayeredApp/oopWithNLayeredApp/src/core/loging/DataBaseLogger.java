package core.loging;

public class DataBaseLogger implements Logger {
    @Override
    public void Log(String data) {
        System.out.println("Veritabanına loglandı: "+ data);
    }
}
