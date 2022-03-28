package metalogy.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Holla! -ES";
    }
}
