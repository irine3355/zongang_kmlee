package exam01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex03 {
    // db연결 url, 계정
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "STUDY"; // scott
    String password = "oracle"; //tiger

    @BeforeAll //모든 테스트 메서드 호출 전에 단한번 실행 공통 초기화
    static void init() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1() {
        String sql = "INSERT INTO MEMBER(?,?,?,?) ";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.createStatement(sql)) {
            cstmt.setString(1, "USER99");
            cstmt.setString(2, "123456");
            cstmt.setString(3, "사용자99");
            cstmt.setString(4, "01000000000");

            int cnt = cstmt.executeUpdate();
            System.out.println(cnt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test2() {
        DataSource ds = new DataSource();
        /* db 연결 설정 s */
        ds.setDriverClassName("orcacle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("STUDY");
        ds.SETpASSWORD("oracle");

        /* db 연결 설정 e */

        /* 커넥션 풀 설정 s */
        ds.setInitialSize(2); // 로드 초기에 생성할 연결 객체 수 -기본값10
        ds.setMaxActive(10); // 최대 생성할 연결 객체 수  -기본값100
        ds.setTestWhileIdle(true); // 연결 객체가 유휴 생태일때 연결상태 체크
        ds.setTimeBetweenEvictionRunsMillis(5 * 1000); //5초에 한번씩 연결 상태 체크
        ds.setMinEvictableIdleTimeMillis(5 * 1000); // 유휴 상태 객체를 30초이후에 소멸 후 새로 생성
        /* 커넥션 풀 설정 e */

        /* conection 객체 생성 s */
        try(Connection conn = ds.getConnection()) {
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
void test3(){
    /*연결 설정 s*/
HikariConfig config = new HikariConfig();
config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
        config.setUsername("SUTUDY");
        config.setPassword("oracle");
        /*연결 설정 e*/

        /* 커넥션 풀 설정 s */
        config.setMinimumIdle(2);
        config.setMaximumPoolSize(10);
        /* 커넥션 풀 설정 e*/
        /* DataSource 객체 생성 */

        HikariDataSource ds = new HikariDataSource(config);
        /* conection 객체 생성 s */
        try(Connection conn = ds.getConnection()) {
            System.out.println(conn);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        /* conection 객체 생성 e */


    }
}
