import com.example.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController)
                applicationContext.getBean("userController");
        userController.save();
    }
}
