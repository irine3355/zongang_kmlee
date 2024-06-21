package org.choongang.configs;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class DBConnTest {
    
    @Test
    @DisplayName("DB 연결 테스트")
    void dbConnectionTest() {
        assertDoesNotThrow(() -> {
            // MyBatis 프레임워크를 사용하여 데이터베이스와 상호작용하기 위해 SqlSession 객체를 생성하는 코드
            SqlSession session = DBConn.getSession();
            System.out.println(session);
        });
    }
}
