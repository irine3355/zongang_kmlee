package exam02.models.member;
//Duplicate 중복의
public class DuplicateMemberException extends RuntimeException {
    public DuplicateMemberException() {
        super("이미 가입된 회원 입니다.");
    }
}
