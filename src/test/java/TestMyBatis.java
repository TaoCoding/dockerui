import com.alibaba.fastjson.JSON;
import com.taocoding.dockerui.dto.UserTable;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.taocoding.dockerui.service.UserService;


/**
 * Created by taocoding on 17-7-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Autowired
    private UserService userService;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        UserTable userTable = userService.getUserById(1);
        System.out.println(userTable.getUserName());
        logger.info("用户名："+userTable.getUserName());
        logger.info(JSON.toJSONString(userTable));
    }
}
