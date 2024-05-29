package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex01 {

    //test1() 메서드: XML 매퍼를 사용하여 회원 정보를 조회하는 테스트입니다.
    //
    //DBConn.getSession()을 호출하여 SqlSession 객체를 가져옵니다.
    //session.selectList("mappers.MemberMapper.getList")를 호출하여 XML 매퍼에서 정의된 쿼리를 실행하여 회원 목록을 가져옵니다.
    //가져온 회원 목록을 출력합니다.
    @Test
    void test1() {
        SqlSession session = DBConn.getSession();
        List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }


    //est2() 메서드: Mapper 인터페이스를 사용하여 회원 정보를 조회하는 테스트입니다.
    //
    //DBConn.getSession()을 호출하여 SqlSession 객체를 가져옵니다.
    //session.getMapper(MemberMapper.class)를 호출하여 MemberMapper 인터페이스를 구현한 객체를 가져옵니다.
    //mapper.getList()를 호출하여 매퍼 인터페이스에서 정의된 메서드를 실행하여 회원 목록을 가져옵니다.
    //가져온 회원 목록을 출력합니다.
    @Test
    void test2() {
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList();
        members.forEach(System.out::println);

    }


    //test3() 메서드: Mapper 인터페이스와 어노테이션을 사용하여 회원 정보를 조회하는 테스트입니다.
    //
    //DBConn.getSession()을 호출하여 SqlSession 객체를 가져옵니다.
    //session.getMapper(MemberMapper.class)를 호출하여 MemberMapper 인터페이스를 구현한 객체를 가져옵니다.
    //mapper.getList2()를 호출하여 매퍼 인터페이스에서 정의된 어노테이션을 사용한 메서드를 실행하여 회원 목록을 가져옵니다.
    //가져온 회원 목록을 출력합니다.
    @Test
    void test3() {
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList2();
        members.forEach(System.out::println);
    }
}