import com.example.pojo.Orders;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMain {
    @Test
    public void findOrdersTest() {
        SqlSession session = MybatisUtils.getSession(true);
        Orders orders = session.selectOne("com.example.mapper." +
                "OrdersMapper.findOrdersWithProduct", 3);
        System.out.println(orders);
        session.close();
    }
}
