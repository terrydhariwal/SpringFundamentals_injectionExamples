import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll());
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
