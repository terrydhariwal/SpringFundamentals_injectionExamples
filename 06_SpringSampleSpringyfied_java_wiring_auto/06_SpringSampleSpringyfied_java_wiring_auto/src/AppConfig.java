import com.terrydhariwal.repository.CustomerRepository;
import com.terrydhariwal.repository.HibernateCustomerRepositoryImpl;
import com.terrydhariwal.service.CustomerService;
import com.terrydhariwal.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.terrydhariwal"})
public class AppConfig {

    @Bean(name = "customerService")
    @Scope("singleton")
    //@Scope("prototype")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        return customerService;
    }

}
