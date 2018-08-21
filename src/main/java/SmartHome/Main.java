package SmartHome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

    public static void main(String[] args) {

        ApplicationContext contex = new AnnotationConfigApplicationContext(Main.class);
        SmartHome smartHome = contex.getBean(SmartHome.class);
        smartHome.run();

    }
}
