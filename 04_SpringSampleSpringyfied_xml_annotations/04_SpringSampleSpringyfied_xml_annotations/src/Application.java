import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        System.out.println("04_xml_with_annotations");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

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
