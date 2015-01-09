import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.terrydhariwal"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

}
