public class ProductManager {
    public void add(Product product){
        if (ProductValidate.isValid(product)){
            System.out.println("Ürün Eklendi");
        }
        else{
            System.out.println("Ürün bilgileri geçersiz!!");
        }
    }
}
