import com.demos.mapper.UserMapper;
import com.demos.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testInsert() {
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder SqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取sqlsessionfactory
            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryBuilder.build(resourceAsStream);
            //获取session
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //获取mapper接口对象
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            //int result = mapper.insertUser();
            User user = mapper.searchByid(2);
            System.out.println(user);

            //System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
