package metalogy.springframework.sfgdi;

import metalogy.springframework.sfgdi.controllers.ConstructorInjectedController;
import metalogy.springframework.sfgdi.controllers.MyController;
import metalogy.springframework.sfgdi.controllers.PropertyInjectedController;
import metalogy.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("________ Primary bean");
        System.out.println(myController.sayHello());

        System.out.println("________ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("________ Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("________ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}
