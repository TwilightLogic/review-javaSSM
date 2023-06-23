import com.example.pojo.Users;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class findUserTest {
    @Test
    public void findUserTest() {
        SqlSession session = MybatisUtils.getSession(true);
        Users users = session.selectOne("com.example.mapper." +
                "UsersMapper.findUserWithOrders", 1);
        System.out.println(users);
        session.close();
    }
}
