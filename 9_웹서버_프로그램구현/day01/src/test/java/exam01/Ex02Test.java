package exam01;

import org.junit.jupiter.api.*;

public class Ex02Test {

    @BeforeEach
    void beforeEach(){
        System.out.println("BEFORE EACH");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after EACH");
    }

    @BeforeAll
   static void beforeAll(){
        System.out.println("BEFORE all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }





    @Test
    void test1(){
        System.out.println("테스트1번 진행");
    }


    @Test
    void test2(){
        System.out.println("테스트2번 진행");
    }
}
