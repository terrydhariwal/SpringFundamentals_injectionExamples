import com.terrydhariwal.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        System.out.println("Spring enabled via XML");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
