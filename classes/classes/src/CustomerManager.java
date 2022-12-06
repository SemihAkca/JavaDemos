import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    List<Customer> customers = new ArrayList<>();
    public void Add(Customer customer) {
        customers.add(customer);
    }
    public List<Customer> GetAllCustomers() {
        return customers;
    }

    public void Update(int id,String firstName,String lastName){
        boolean status = false;
        for (Customer customer1:customers){
            if (customer1.id== id){
                customer1.firstName= firstName;
                customer1.lastName = lastName;
                status = true;
                break;
            }
        }
        if (status==false){
            System.out.println("Bu id'ye ait kişi bulunamadı");
        }
    }

    public void Delete(Customer customer){
        customers.remove(customer);
    }
}
