public class ProductValidate {
    public static boolean isValid(Product product){
        if (product.price>0 && product.name.isEmpty()==false){ //product.name.isEmpty()==false bunun yerine !product.name.isEmpty() kullanılabilir.
            return true;
        }
        else {
            return false;
        }
    }
}
