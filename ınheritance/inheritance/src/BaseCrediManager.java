public class BaseCrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}
// burada metod ismini public final douple hesapla(double turar) ... şeklinde yazarak bu metodu oluşturursam final bu metodun
// override edilmesini engeller bu sınftan inherit alan başka sınıf bu metodu kullanacaksa bu şekilde kullanabilir.
// c# ta bu public sealed  ile yapılır.