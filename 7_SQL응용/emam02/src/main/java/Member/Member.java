package Member;


import lombok.*;

import java.time.LocalDateTime;
/**
@EqualsAndHashCode
@Getter
@Setter
@ToString
 */
@Data
// @AllArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor //필수 멤버 변수를 생성자 배개변수로 추가
public class Member {
    @NonNull
    private String userId;
    @NonNull
    private String userNm;

    private String email;

    @ToString.Exclude
    private LocalDateTime regDt;

}


