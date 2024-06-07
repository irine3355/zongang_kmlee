package member.services;

import global.validators.Validator;
import member.controllers.RequestJoin;


public class JoinService {
// 생성자의 매개변수 예시 /
    private Validator<RequestJoin> validator;
///JoinService
//// ㄴ클래스의 생성자는 Validator<RequestJoin> 타입의 매개변수를 받습니다.
    public JoinService(Validator<RequestJoin> validator){
        //앞의 validator는 클래스의 인스턴스 필드(JoinService 클래스의 인스턴스 필드인 validator)
        // 를 가리키며, 뒤의 validator(생성자의 매개변수로써, JoinService 객체를 생성할 때
        // 외부에서 전달되는 유효성 검사기를 가리킵니다. )는 생성자의
        // 매개변수를 가리킵니다.
        this.validator = validator;
    }

    //매개변수 사용 예시
    public void process(RequestJoin form) {

    validator.check(form);
    }
}
