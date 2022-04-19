package metalogy.springframework.sfgdi.config;

import metalogy.springframework.sfgdi.services.ConstructorGreetingService;
import metalogy.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }
}
