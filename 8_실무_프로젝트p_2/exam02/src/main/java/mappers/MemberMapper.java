package mappers;

import member.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//MemberMapper 인터페이스는 MyBatis를 사용하여 데이터베이스의 MEMBER 테이블과 상호작용하는 여러 메서드를 정의합니다.
public interface MemberMapper {

    //데이터베이스의 MEMBER 테이블에서 모든 회원 정보를 가져옵니다.
    List<Member> getList();

    //어노테이션 기반으로 SQL 쿼리를 직접 정의합니다.
    @Select("SELECT USER_NO userNo, USER_ID userId, USER_PW userPw, USER_NM userNm, MOBILE, REG_DT regDt, MOD_DT modDt FROM MEMBER")
    List<Member> getList2();    //USER_NO와 USER_ID 열을 선택하여 MEMBER 테이블의 데이터를 가져옵니다.
    List<Member> getList3(Member member); //Member 객체를 파라미터로 받아 조건에 맞는 회원 리스트를 반환합니다.
    List<Member> getList4(List<String> userIds); //여러 userId를 파라미터로 받아 해당 회원 리스트를 반환합니다.
    List<Member> getList5(long userNo); //특정 userNo 값을 파라미터로 받아 해당 회원 리스트를 반환합니다.

    //새로운 회원 정보를 데이터베이스에 삽입합니다.
    int register(Member member);
    int register2(Member member);

    //기존 회원 정보를 수정합니다.
    int modify(Member member);

    //주어진 userId를 가진 회원을 삭제합니다.
    int delete(String userId);

    //어노테이션 기반으로 SQL 쿼리를 직접 정의합니다.
    @Delete("DELETE FROM MEMBER WHERE USER_ID = #{userId}")
    int delete2(String userId);
}