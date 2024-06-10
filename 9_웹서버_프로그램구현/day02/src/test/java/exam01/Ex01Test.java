package exam01;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Ex01Test {

    @Test
    void test1(){
        // Faker 객체를 생성할 때 한국어 로케일을 사용하여 생성합니다.
        Faker faker = new Faker(new Locale("ko_kr"));

        // 전체 이름을 생성합니다.
        String name = faker.name().fullName();

        // 생성된 이름을 출력합니다.
        System.out.println(name);
    }

    @Test
    void test2(){
        // Faker 객체를 생성할 때 Locale.KOREAN 상수를 사용하여 생성합니다.
        Faker faker = new Faker(Locale.KOREAN);

        // 우편번호, 도시 이름 및 도로 주소를 생성하고 이를 결합합니다.
        String address = faker.address().zipCode() + " " + faker.address().cityName() + faker.address().streetAddress();

        // 보조 주소(예: 아파트 번호)를 생성합니다.
        String addressSub = faker.address().secondaryAddress();

        // 전체 주소를 출력합니다.
        System.out.println(address + " " + addressSub);


    }
}
