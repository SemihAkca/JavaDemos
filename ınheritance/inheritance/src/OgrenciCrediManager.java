public class OgrenciCrediManager extends BaseCrediManager {
    public double hesapla(double tutar) {  // BaseCrediManager den aldığı metodu ovverride ederek ÖğrenciCrediManager için tutarı güncelledik.
        return tutar * 1.10;
    }
}
