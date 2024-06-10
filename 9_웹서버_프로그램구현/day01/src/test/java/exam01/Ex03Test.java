package exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ex03Test {

    //동작 방식
    //JUnit이 Ex03Test 클래스를 실행할 때, @TempDir 애노테이션이 있는 tempDir 필드를 위한 임시 디렉토리를 생성합니다.
    //test1 메서드가 실행되면, tempDir 필드는 생성된 임시 디렉토리를 가리킵니다.
    //tempDir의 절대 경로를 문자열로 변환하여 path 변수에 저장하고, 그 경로를 콘솔에 출력합니다.
    @TempDir
    private File tempDir;

    @Test
    void test1() {
        String path = tempDir.getAbsolutePath();
        System.out.println(path);
    }

    @Test
    //@Timeout(3) // 3초 내에 수행이 되면 테스트 통과
    @Timeout(value=2500, unit=TimeUnit.MILLISECONDS)
    void test2() throws Exception {
        Thread.sleep(2000);
    }
}