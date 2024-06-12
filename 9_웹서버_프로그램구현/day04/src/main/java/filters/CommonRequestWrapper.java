package filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request){
        super((HttpServletRequest) request);

        //요청 전 공통 처리 부분
        System.out.println("요청 전 공통 처리 코드...");
    }

    @Override
    public String getParameter(String name) {
        // 1. 부모 클래스의 getParameter 메서드를 호출하여 파라미터 값을 가져옵니다.
        String value = super.getParameter(name);
        // 2. 파라미터 값이 null이 아닌 경우, 해당 값을 수정합니다.
        //    null인 경우에는 그대로 null을 유지합니다.
       // value가 null인지 확인합니다.
        // null인 경우, value는 그대로 null로 유지됩니다. ?? 이해안됨
        //null이 아닌 경우, value 앞에 "★"를 붙이고, 뒤에 "♥"를 붙여 수정된 문자열을 value에 저장합니다.
        value = value == null ? value : "★" + value + "♥";

        return value;
    }
}
