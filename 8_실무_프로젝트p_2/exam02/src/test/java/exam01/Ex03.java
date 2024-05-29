package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Ex03 {

    //SqlSession 객체 session은 데이터베이스와의 연결을 관리합니다. DBConn.getSession() 메서드를 통해 session을 초기화합니다.
    private SqlSession session = DBConn.getSession();

    //test1 메서드는 데이터베이스의 Member 레코드를 수정하는 작업을 테스트합니다.
    //Member 객체를 생성할 때 builder() 패턴을 사용하여 userId와 userNm을 설정합니다.
    //MemberMapper 인터페이스의 modify 메서드를 호출하여 member 객체를 수정합니다.
    //수정된 레코드의 개수를 cnt에 저장하고, 이를 콘솔에 출력합니다.
    @Test
    void test1(){
        Member member = Member.builder()
                .userId("USER04")
                .userNm("(수정)사용자01")
                .build();

        MemberMapper mapper = session.getMapper(MemberMapper.class);
        int cnt = mapper.modify(member);
        System.out.println(cnt);
    }

//Member member = Member.builder() //.userId("USER99") .userNm("사용") .mobile("010") .build();
//
//Member 객체를 빌더 패턴을 사용하여 생성합니다.
//userNm 필드를 "사용"으로, mobile 필드를 "010"으로 설정합니다.
//userId 필드는 주석 처리되어 사용되지 않습니다.
//List<Member> members = mapper.getList3(member);
//
//mapper.getList3(member)를 호출하여 member 객체의 조건에 맞는 회원 리스트를 가져옵니다.
//이 메서드는 userNm이 "사용"이고 mobile이 "010"인 회원들을 조회할 것으로 예상됩니다.
    @Test
    void test2() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = Member.builder()
                //.userId("USER99")
                .userNm("사용")
                .mobile("010")
                .build();
        //mapper.getList3(member)를 호출하여 member 객체의 조건에 맞는 회원 리스트를 가져옵니다.
        List<Member> members = mapper.getList3(member);
        members.forEach(System.out::println);
    }

    //test3 메서드는 여러 userId를 사용하여 해당 사용자들의 Member 객체 리스트를 가져오는 작업을 테스트합니다.
    //Arrays.asList를 사용하여 userIds 리스트를 생성합니다.
    //MemberMapper 인터페이스의 getList4 메서드를 호출하여 userIds에 해당하는 Member 객체 리스트를 가져옵니다.
    //가져온 members 리스트를 순회하면서 각 Member 객체를 콘솔에 출력합니다.
    @Test
    void test3() {
    MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<String> userIds = Arrays.asList("USER04", "USER05", "USER06");
        List<Member> members = mapper.getList4(userIds);
        members.forEach(System.out::println);
    }

    //test4 메서드는 특정 조건(여기서는 10이라는 값)을 사용하여 Member 객체 리스트를 가져오는 작업을 테스트합니다.
    //MemberMapper 인터페이스의 getList5 메서드를 호출하여 10에 해당하는 조건으로 Member 객체 리스트를 가져옵니다.
    //가져온 members 리스트를 순회하면서 각 Member 객체를 콘솔에 출력합니다.
    @Test
    void test4() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList5(10);
        members.forEach(System.out::println);
    }
}
