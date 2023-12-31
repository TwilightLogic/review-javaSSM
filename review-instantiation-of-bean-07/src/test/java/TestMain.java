import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void bean2Test() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationBean2.xml");
        System.out.println(applicationContext.getBean("bean2"));
    }

    @Test
    public void bean3Test() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationBean3.xml");
        System.out.println(applicationContext.getBean("bean3"));
    }
}
