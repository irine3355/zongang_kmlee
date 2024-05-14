package exam01;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03 {
    LocalTime now = LocalTime.now();
    LocalTime endTime = LocalTime.of(17, 50);

    Duration du =Duration.between(now, endTime);
    long seconds = du.getSeconds();

}
