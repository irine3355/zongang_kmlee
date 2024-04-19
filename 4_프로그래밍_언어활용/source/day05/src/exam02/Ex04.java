package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D(); //( D클라스 내에서 ad를 꺼냄, ad의 내용물이 D와 같음을 암)
        A ac = new C(); //( C클라스 내에서 ac를 꺼냄, ad의 내용물이 C와 같음을 암)
       //  D d = new D(); // d를 선언하고 ad를 대입시킬 수 없음?

        System.out.println("ad " + ad); // ad ac 주소 다름
        System.out.println("ac " + ac); // ad ac 주소 다름
        System.out.println("ad.numA " + ad.numA);
        System.out.println("ac.numA " + ac.numA); // 값은 동일하게 10;
        System.out.println("ad " + System.identityHashCode(ad));
        System.out.println("ac " + System.identityHashCode(ac)); // ad ac 해시코드주소 다름
        System.out.println("ad.numA " + System.identityHashCode(ad.numA));
        System.out.println("ac.numA " + System.identityHashCode(ac.numA)); // ad.numA ac.numA 해시코드주소 같음!
        //  

//        if (ad instanceof D) {
//            D d = (D) ad; // ad가 A 클래스의 인스턴스인지 확인 후에, D 클래스의 인스턴스인지도 확인합니다. 상위클 객체가 하위클 객체의 변수 접근 가능하게 함
//            System.out.println(d == ad); // 참
//            //ad 와 d 주소, 해시코드, 접근가능 내부의 변수와 그 값, 주소, 해시코드 모두 같음!
//            System.out.println("ad " + ad); // ad 주소 그대로
//            System.out.println("d " + d); // ad 와 d 주소 같음
//            System.out.println("ad.numA " + ad.numA);
//            System.out.println("d.numA " + d.numA); // 값은 동일하게 10;
//            System.out.println("(D) ad.numD " + ((D) ad).numD); // 상위클이 하위클의 변수 접근 가능해짐! 40
//            System.out.println("d.numD " + d.numD); // 40
//
//            System.out.println("ad " + System.identityHashCode(ad)); //위와 동일
//            System.out.println("d " + System.identityHashCode(d)); // 해시코드 주소 같음
//            System.out.println("ad.numA " + System.identityHashCode(ad.numA)); //위와 동일
//            System.out.println("d.numA " + System.identityHashCode(d.numA)); // 해시코드 주소 같음
//            System.out.println("(D) ad.numD " + System.identityHashCode(((D) ad).numD));
//            System.out.println("d.numD " + System.identityHashCode(d.numD));
//
//        }


        if (ac instanceof C) { //  ( ac의 내용물이 C클라스의 내용물과 같으면 아래 진행시켜!)
            C cc = (C) ac; // ( C클라스 내에서 ac를 꺼냄, ad의 내용물이 C와 같음을 암)
            System.out.println(cc == ac); // 참

            //ad 와 d 주소, 해시코드, 접근가능 내부의 변수와 그 값, 주소, 해시코드 모두 같음!
            System.out.println("ac " + ac); // ad 주소 그대로
            System.out.println("cc " + cc); // ad 와 d 주소 같음
            System.out.println("ac.numA " + ac.numA);
            System.out.println("cc.numA " + cc.numA); // 값은 동일하게 10;
            System.out.println("(C) ac.numB " + ((C) ac).numB); // 상위클이 하위클의 변수 접근 가능해짐! 40
            System.out.println("cc.numB " + cc.numB); // 40

            System.out.println("ac " + System.identityHashCode(ac)); //위와 동일
            System.out.println("cc " + System.identityHashCode(cc)); // 해시코드 주소 같음
            System.out.println("ac.numA " + System.identityHashCode(ac.numA)); //위와 동일
            System.out.println("cc.numA " + System.identityHashCode(cc.numA)); // 해시코드 주소 같음
            System.out.println("(C) ac.numB " + System.identityHashCode(((C) ac).numB));
            System.out.println("cc.numB " + System.identityHashCode(cc.numB));

            System.out.println("(C) ac.numC " + ((C) ac).numC); // 상위클이 하위클의 변수 접근 가능해짐! 40
            System.out.println("cc.numC " + cc.numC);
            System.out.println("(C) ac.numC " + System.identityHashCode(((C) ac).numC));
            System.out.println("cc.numC " + System.identityHashCode(cc.numC));
        }
    }
}

//