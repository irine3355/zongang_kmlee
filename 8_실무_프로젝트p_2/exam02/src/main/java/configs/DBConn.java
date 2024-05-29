package configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

//DBConn 클래스는 데이터베이스 연결을 관리하는 역할을 합니다.
public class DBConn {

    //SqlSessionFactory 객체를 factory라는 정적 필드로 선언합니다. 이 객체는 MyBatis의 세션을 생성하는 데 사용됩니다.
    private static SqlSessionFactory factory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml");

            //SqlSessionFactoryBuilder().build(reader)를 호출하여 SqlSessionFactory 객체를 생성하고, 이를 factory 필드에 할당합니다.
            factory = new SqlSessionFactoryBuilder().build(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //이 메서드는 autoCommit 매개변수를 받아, 해당 값에 따라 새로운 SqlSession 객체를 생성합니다.
    //autoCommit이 true이면, SQL 세션은 자동으로 커밋됩니다. false이면, 명시적으로 커밋을 호출해야 합니다.
    public static SqlSession getSession(boolean autoCommit) {
        return factory.openSession(autoCommit);
    }

    //이 메서드는 기본적으로 autoCommit을 true로 설정하여 getSession 메서드를 호출합니다.
    //주로 간편하게 자동 커밋 모드로 세션을 얻기 위해 사용됩니다.
    public static SqlSession getSession() {
        return getSession(true);
    }
}