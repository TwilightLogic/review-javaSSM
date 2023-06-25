import com.example.demo03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void testAOP() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Student bean = applicationContext.getBean(Student.class);
        bean.study();
    }

    @Test
    public void testAnnoAOP() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        Student bean = applicationContext.getBean("student", Student.class);
        bean.studyAnno();
    }
}
