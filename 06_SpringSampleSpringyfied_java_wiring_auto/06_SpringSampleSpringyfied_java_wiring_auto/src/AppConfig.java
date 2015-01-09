import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.terrydhariwal"})
@PropertySource("app.properties")  //This defines the location of our property file. Will work as long as app.properties is in any directory under src
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer(); //this loads in our property file
    }

    @Bean(name = "customerService")
    @Scope("singleton")
    //@Scope("prototype")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        return customerService;
    }

}
