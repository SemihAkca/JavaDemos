public class Main {
    public static void main(String[] args) {
        int number = 95;
        String Description = "Grade is: ";
        System.out.println(Description + ":" + number);
        // ctrl+shift+Alt+L Kodu düzenler
        char grade = 'A';
        switch (grade){
            case 'A' :
                System.out.println("Mükemmel, gectiniz");
                break;
            case 'B':
                System.out.println("Çok güzel, geçtiniz");
                break;
            case 'C':
                System.out.println("İyi, geçtiniz");
                break;
            case 'D':
                System.out.println("Şartlı geçtiniz");
                break;

            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}