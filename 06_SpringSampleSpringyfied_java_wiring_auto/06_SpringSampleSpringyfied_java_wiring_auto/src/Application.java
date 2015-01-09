import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        System.out.println("06_Java_wiring_autowired (only annotations and java)");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());

        //for testing singleton/prototype scope
        CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println("service =  " + service + "\nservice2 = " + service2);
        if(service.equals(service2)) {
            System.out.println("you're using singleton scope");
        }
        else {
            System.out.println("you're using prototype scope");
        }
    }
}
