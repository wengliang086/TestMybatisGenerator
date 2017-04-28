
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mybatistest.mapper.UserBeanMapper;
import com.my.mybatistest.vo.UserBean;

public class Test {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = sqlSessionFactory.openSession();

		// UserBean user =
		// session.selectOne("com.my.mybatistest.mapper.UserBeanMapper", 1);
		// System.out.println(user.getUseraddress());
		// System.out.println(user.getUsername());

		UserBeanMapper mapper = session.getMapper(UserBeanMapper.class);
		UserBean user1 = mapper.selectByPrimaryKey(1);
		System.out.println(user1.getUseraddress());
		System.out.println(user1.getUsername());
	}
}
