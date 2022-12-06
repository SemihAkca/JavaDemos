public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Buz Dolabı");
        product1.setUnitPrice(5000);
        product1.setUnitInStock(20);
        product1.setDiscount(10);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Bulaşık Makinası");
        product2.setUnitPrice(2000);
        product2.setUnitInStock(15);
        product2.setDiscount(20);
        product2.setImageUrl("image2.jpb");

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Ocak");
        product3.setUnitPrice(1000);
        product3.setUnitInStock(10);
        product3.setDiscount(8);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        for (Product product:products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05863624579");
        individualCustomer.setFirstName("Hasan");
        individualCustomer.setLastName("Tepe");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setPhone("05444444");
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setTaxNumber("1111111111");

        Customer[] customers = {individualCustomer,corporateCustomer};
        System.out.println(individualCustomer.getFirstName());
        System.out.println(corporateCustomer.getCompanyName());
    }
}