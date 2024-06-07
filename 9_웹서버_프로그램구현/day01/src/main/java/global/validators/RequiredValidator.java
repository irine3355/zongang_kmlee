package global.validators;
//주요 목적은 필드의 유효성을 검사하기 위한 인터페이스를 정의하는 것입니다.
public interface RequiredValidator {

    // 문자열 필드의 유효성을 검사합니다. 필드가 null이거나 빈 문자열(isBlank()는 공백
    // 문자열도 포함)을 확인하여, 그렇다면 주어진 예외 e를 던집니다. 이는 필수 입력 필드를
    // 검사할 때 유용합니다.
    default void checkRequired(String field, RuntimeException e){
        if (field == null || field.isBlank()){
            throw e;
        }
    }

    //부울 값을 검사합니다. result가 true가 아니면 주어진 예외 e를 던집니다.
    // 이는 특정 조건이 참인지 확인할 때 유용합니다.
    default void checkTrue(boolean result, RuntimeException e){
        if(!result){
            throw e;
        }
    }
}
