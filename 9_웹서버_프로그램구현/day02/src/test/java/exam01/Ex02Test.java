package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import services.LoginService;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;


//@ExtendWith(MockitoExtension.class)는 JUnit 5에서 Mockito 확장을 사용하도록 지정합니다. MockitoExtension.class는 MockitoExtension 클래스의 타입을 나타냅니다. JUnit이 테스트를 실행할 때 이 확장을 적용하도록 합니다.
@ExtendWith(MockitoExtension.class)
public class Ex02Test {
    private LoginService loginService;

    @Mock
    private Mailer mailer;
    private Faker faker;

    @Mock
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        // LoginService 인스턴스를 생성하고, LoginValidator를 주입합니다.
        loginService = new LoginService(new LoginValidator());

        // Mailer를 모킹합니다.
        mailer = mock(Mailer.class);

        // Faker 라이브러리를 사용하여 영어 로케일로 임의의 데이터를 생성합니다.
        faker = new Faker(Locale.ENGLISH);

        // HttpServletRequest를 모킹합니다.
        //HttpServletRequest 인터페이스는 클라이언트 요청에 대한 다양한 정보를 제공하는 메서드를 포함합니다.   String getParameter(String name)요청 파라미터 값을 반환합니다.
        //Java에서 .class를 사용하는 이유는 클래스의 타입을 나타내기 위해서입니다. 이를 통해 리플렉션(reflection)을 사용하거나 프레임워크에서 클래스 정보를 필요로 할 때 사용됩니다.
        request = mock(HttpServletRequest.class);

        // request 객체의 getParameter 메서드를 스텁합니다.
        // faker를 사용하여 임의의 이메일과 비밀번호를 반환하도록 설정합니다.
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}").toLowerCase());
    }


    @Test
    void test1() {
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email");
        then(mailer).should(only()).send(email);
        // send 함수가 loginSerivce.process 메서드에서 단 한번 호출되는지 테스트

    }

    @Test
    void test2() {
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        then(mailer).should().send(captor.capture());

        String usedEmail = captor.getValue(); // send 메서드에서 매개변수로 사용한 값
        assertEquals(email, usedEmail);

    }

}