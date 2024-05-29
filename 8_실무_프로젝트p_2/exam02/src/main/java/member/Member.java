package member;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Member { //Member 클래스는 데이터베이스 테이블의 각 열을 Java 객체의 필드로 매핑합니다.
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String mobile;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
