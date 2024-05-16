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
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;

}


