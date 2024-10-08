import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer tufan = new Customer(1, "Tufan", "Duzel");
        customers.add(tufan);

        customers.add(new Customer(2, "Cinar", "Duzel"));
        customers.add(new Customer(3, "Ozgur", "Celedir"));

        customers.remove(tufan);
        customers.remove(new Customer(2, "Cinar", "Duzel"));

        for(Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}