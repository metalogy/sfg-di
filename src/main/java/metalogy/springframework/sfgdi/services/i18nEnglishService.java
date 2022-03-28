package metalogy.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class i18nEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi! -EN";
    }
}
