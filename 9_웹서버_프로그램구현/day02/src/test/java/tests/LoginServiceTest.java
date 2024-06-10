package tests;

import com.github.javafaker.Faker;
import global.exceptions.ValidationException;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.LoginService;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 서비스 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;
    private HttpServletRequest request;
    private Faker faker;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());
        // httpServletRequest 모의 객체 생성
        request = mock(HttpServletRequest.class);
        faker = new Faker(Locale.KOREAN);
//        given(request.getParameter("email")).willReturn("test01@test.org");
//        given(request.getParameter("password")).willReturn("12345678");
        //given(request.getParameter("123")).willThrow(IllegalArgumentException.class);

    }

    void setParamData(String name, String value) {
        //스텁(가짜 데이터)
        given(request.getParameter(name)).willReturn(value);
    }

    void setSuccessData() {
        String password = faker.regexify("[\\w{8}").toLowerCase();
        setParamData("email", faker.internet().emailAddress());
        //    setParamData("email", "test01@test.org");
        setParamData("password", password);
    }

    @Test
    @DisplayName("로그인 성공시 예외 발생 없음")
    void successTest() {

        assertDoesNotThrow(() -> {
            setSuccessData();
            loginService.process(request);
        });
    }

    @Test
    @DisplayName("필수 항목(아이디, 비밀번호)검증, 검증 실패시 validationException 발생")
    void requiredFieldTest() {
        assertAll(
                //이메일 검증
                () -> requiredFieldTest("email", "이메일"),
                () -> {
                    setParamData("email", faker.internet().emailAddress());
                    requiredFieldEachTest("password", "비밀번호");
                }

        );
    }

        //아이디 필 수 항복 검증
        ValidationException thrown = assertThrows(ValidationException.class, ()-> {
            setParamData("email", faker.internet().emailAddress());
            loginService.process(request);
        });
String message = thrown.getMessage();
assertTrue(message.contains("이메일"));
    }
    void requiredFieldEachTest(String name, String message){
        setParamData("email", null);
        setParamData("password", null);
       ValidationException thrown = assertThrows(ValidationException.class, ()-> {
           //null
           loginService.process(request);
           //
           setParamData(name, "       ");
           loginService.process(request);
       }, message + "테스트");

       String msg = thrown.getMessage();
       assertTrue(msg.contains(message), message)

        assertThrows(ValidationException.class, ()-> {

        });
    }

    @Test
@DisplayName("이메일로 회원이 조회되는지 검증, 검증 실패시 ValidationException 발생")
void memberExistsTest(){

}

@Test
@DisplayName("비밀번호가 일치하는지 검증, 검증 실패시 PasswordMismatchException 발생")
void memberAuthTest(){

}
