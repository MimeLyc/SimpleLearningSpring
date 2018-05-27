package test;

import com.mapper.UserMapper;
import com.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by QQQ on 2018/5/27.
 */
public class springMybatisTest {
	private ApplicationContext applicationContext;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("WEB-INF/BlogWeb-servlet.xml");
	}



	@Test
	public void testFindUserById() throws Exception {


		UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");

		//调用userMapper的方法

		User user = userMapper.comfirmLogin("lyc");

		System.out.println(user);

	}
}
