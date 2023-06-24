import com.example.HelloSpring;
import com.example.User1;
import com.example.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void testSpring() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.show();
    }

    @Test
    public void testDIByConstructor() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-User.xml");
        User1 user1 = applicationContext.getBean("user1", User1.class);
        System.out.println(user1);
    }

    @Test
    public void testDIBySetter() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-User2.xml");
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);
    }
}
