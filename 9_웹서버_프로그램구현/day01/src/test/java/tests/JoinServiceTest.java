package tests;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    private JoinService joinService;

    @BeforeEach
    void init(){
        joinService = new JoinService(new JoinValidator());

    }
    RequestJoin getData(){
        return RequestJoin.builder()
                .email("test"+ System.currentTimeMillis()+"@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자")
                .termsAgree(true)
                .build();
                
    }
    
    @Test
    @DisplayName("회원가입 성공시 예외가 발생 없음")
    void successTest() {
        assertDoesNotThrow(() -> {

            joinService.process(getData());
        });
    }


//    void successTest() {
//        assertDoesNotThrow(() -> {
//            JoinService service = new JoinService();
//            RequestJoin form = RequestJoin.builder().build();
//            service.process(form);
//        });
//    }
//

    @Test
    @DisplayName("필수항목(이메일, 비밀번호, 비밀번호확인, 회원명) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldTest() {
        /* 이메일 필수 검증 S */

assertThrows(ValidationException.class, ()->{
    RequestJoin = RequestJoin.builder().build();
    JoinService service = new JoinService(form);

});
        /* 이메일 필수 검증 E */
    }
    /* 비밀번호 필수 검증 S */
    assertThrows(ValidationException.class, ()-> {
       RequestJoin form = getData();
       form.setPassword(null);
       joinService.process(form);
       form.setPassword("        ");
        joinService.process(form);
    });
    /* 비밀번호 필수 검증 E */


//    void requiredFieldTest() {
//        /* 이메일 필수 검증 S */
//        assertThrows(ValidationException.class, ()->{
//            RequestJoin form = RequestJoin.builder().build();
//            JoinService service = new JoinService(form);
//
//        });
//        /* 이메일 필수 검증 E */
//    }
}



