package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex02 {

    private SqlSession session = DBConn.getSession();

    //회원을 등록하는 테스트입니다
    //새로운 회원 객체를 생성하고, register2() 메서드를 사용하여 회원을 등록합니다. 이때, 회원의 아이디는 현재 시간을 이용하여 동적으로 생성됩니다.
    //등록된 회원의 수를 반환받아 출력합니다.
    @Test
    void test1() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);

        Member member = Member.builder()
                .userId("USER" + System.currentTimeMillis())
                .userPw("123456")
                .userNm("사용자..")
                .mobile("01000000000")
                .build();
        //int cnt = mapper.register(member);
        int cnt = mapper.register2(member);
        //int cnt = session.insert("mappers.MemberMapper.register", member);
        System.out.println(cnt);
        System.out.println(member);
    }

    //회원 정보를 수정하는 테스트입니다.
        //기존 회원의 아이디와 수정할 정보를 포함한 회원 객체를 생성하고, modify() 메서드를 사용하여 회원 정보를 수정합니다.
        //수정된 회원의 수를 반환받아 출력합니다.
    @Test
    void test2() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);

        Member member = Member.builder()
                .userId("USER01")
                .userPw("123456")
                .userNm("(수정)사용자01")
                .mobile("01000000000")
                .build();

        //int cnt = session.update("mappers.MemberMapper.modify", member);
        int cnt = mapper.modify(member);
        System.out.println(cnt);
    }

    //회원을 삭제하는 테스트입니다.
    //삭제할 회원의 아이디를 포함한 회원 객체를 생성하고, delete() 메서드를 사용하여 회원을 삭제합니다.
    //삭제된 회원의 수를 반환받아 출력합니다.
    @Test
    void test3() {
        Member member = Member.builder()
                .userId("USER01")
                .build();

        int cnt = session.delete("mappers.MemberMapper.delete", member);
        System.out.println(cnt);
    }


    //delete()와 delete2() 메서드를 사용하여 여러 회원을 삭제합니다.
    //각 회원의 삭제 결과(삭제된 회원의 수)를 반환받아 출력합니다.
    @Test
    void test4() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        int cnt = mapper.delete("USER02");
        int cnt2 = mapper.delete2("USER03");

        System.out.println(cnt);
        System.out.println(cnt2);
    }
}