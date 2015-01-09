import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
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

        // Setter Injection example:
        //CustomerServiceImpl customerService = new CustomerServiceImpl();
        //customerService.setCustomerRepository(getCustomerRepository());
        //return customerService;

        // Constructor Injection example:
        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
        return customerService;

    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

}
