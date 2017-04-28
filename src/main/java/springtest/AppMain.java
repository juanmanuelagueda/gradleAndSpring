package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain {
    
    public String getGreeting() {
        return "Hello world.";
    }
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");        
 
        App app = (App)context.getBean("AppBean");

        System.out.println(app);
    }
}
