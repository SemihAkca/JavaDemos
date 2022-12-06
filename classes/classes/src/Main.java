public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Halil","Can");
        Customer customer2 = new Customer(2,"Faysal","Tepe");

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add(customer1);
        customerManager.Add(customer2);

        for (Customer customer:customerManager.GetAllCustomers()){
            System.out.println(customer.firstName);
        }

        customerManager.Update(1,"Murat","Tepe");
        System.out.println("---------");
        for (Customer customer:customerManager.GetAllCustomers()){
            System.out.println(customer.firstName);
        }

        customerManager.Delete(customer2);
        System.out.println("---------");
        for (Customer customer:customerManager.GetAllCustomers()){
            System.out.println(customer.firstName);
        }
    }
}