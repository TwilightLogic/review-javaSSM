import com.example.dao.WorkerMapper;
import com.example.pojo.Worker;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMain {
    @Test
    public void findWorkerByIdTest() {
        SqlSession session = MybatisUtils.getSession(true);
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);

        Worker worker = mapper.selectWorker(1);

        System.out.println(worker);

        session.close();
    }
}
