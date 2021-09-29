import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){


        //This is loading spring, it's loading configuration files from AppConfig
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


        //SpeakerService service = new SpeakerServiceImpl();

        //now nothing is hardcoded, it's running through the config instances
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());


        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
        //prints out two different address instances for us

    }
}

//TODO:Read more about Constructor injection

//Constructor based injection ensures that dependency is present(will fail without)
//Can create immutable classes

//TODO:Setter Injection
//Does not insure that dependency is present

//Constructor injection is used when the class cannot function without the dependant of the class.
//Property injectino is used when the class can function without the dependent class.


//Setter injection is as simple as a method call
//Setter injection is simply calling a setter injection on a bean
//call and get an instance of the bean from the spring config file
//spring is doing magic, beans are singleton by default and will only execute method first time it's called
//if this wasn't set-up this way, it would call a bean every time this was called


//Scope's inside the application are associated with patterns, spring implements patterns

//When the Spring Framework creates a bean, it associates a scope with the bean.
// A scope defines the runtime context within which the bean instance is available.
// In Spring, a bean can be associated with the following scopes: Singleton.
