package services;

import global.Mailer;
import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;
import tests.LoginServiceTest;

public class LoginService {
    private Validator validator;
    private Mailer mailer;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }

    public void process(HttpServletRequest request) {
        //아이디: email

        validator.check(request);

        //로그인 성공 가정
        //성공시 메일 전송

if(mailer !=null){
    String email = request.getParameter("email");
    mailer.send(email);
}
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        System.out.printf("email= %s, password= %s%n", email, password);
//
//        if(email == null || email.isBlank()){
//            throw new ValidationException("이메일을 입력하세요.");
        }
    }

