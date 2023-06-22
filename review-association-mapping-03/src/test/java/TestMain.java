import com.example.pojo.Person;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMain {
    @Test
    public void findPersonByIdTest() {
        SqlSession session = MybatisUtils.getSession(true);
        Person person = session.selectOne("com.example.mapper." +
                "PersonMapper.findPersonById", 1);
        System.out.println(person);
        session.close();
    }
}
