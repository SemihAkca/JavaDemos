public class DataBaseHelper {
    public static class Crud {
        public static void add(){
            System.out.println("Statik sinifin add metodu calisti ");
        }
        public static void read(){

        }
        public static void update(){

        }
        public static void delete(){

        }
    }

    public static class Connection{
        public static void CreateConnection(){

        }
    }
}
// javada ana sınıfı c# taki gibi static olarak oluşturamıyoruz.
// javada static class kullanmak için ana clasımın içine static metod tanımlar gibi public static class Crud şeklinde
// static class oluşturabilirim ve sonra istersem bu static clas'a static ve normal metodlar tanımlayabilirim burada static olan
// crud sınıfına static metodlar tanımladım. Bu static olarak tanımladığımız sınıfı kulalnaırken sınıfın normal static oloan
// metodunu çağırıyormuşuz gibi bu sınııfı çağırarak kullanırız. DataBaseHelper.Crud burda stic olan Crud sınıfını çağırdık.
// herhangi bir statiç metodunu kullanmak için DataBaseHelper.Crud.delete bu şekişde çağırırız.
// bu class yapısı inner class olarak adlandırılır ama best practis' lere uymaz.
// SOLİD'in Single Responsibility' sine aykırı yapı. (Bir sınıf sadece bir işi yapmalıdır.)