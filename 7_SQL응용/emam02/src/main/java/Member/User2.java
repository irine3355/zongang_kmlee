package Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Builder @ToString
@NoArgsConstructor @AllArgsConstructor
//기본 생성자를 꼭 써야 되는 경우 @NoArgsConstructor @AllArgsConstructor 이 두개 추가
public class User2 {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;

    User2 user2 = new User2();
    
}
