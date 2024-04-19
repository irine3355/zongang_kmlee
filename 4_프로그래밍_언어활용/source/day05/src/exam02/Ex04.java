package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();
        A ac = new C();
        System.out.println("ad " + ad);
        System.out.println("ac " + ac);
        System.out.println("ad.numA " + ad.numA);
        System.out.println("ac.numA " + ac.numA);
        System.out.println("ad " + System.identityHashCode(ad));
        System.out.println("ac " + System.identityHashCode(ac));
        System.out.println("ad.numA " + System.identityHashCode(ad.numA));
        System.out.println("ac.numA " + System.identityHashCode(ac.numA));

        if (ad instanceof D) {
            D d = (D) ad;
            System.out.println("ad " + ad);
            System.out.println("d " + d);
            System.out.println("ad.numA " + ad.numA);
            System.out.println("d.numA " + d.numA);
            System.out.println("ad.numD " + ((D) ad).numD);
            System.out.println("d.numD " + d.numD);

            System.out.println("ad " + System.identityHashCode(ad));
            System.out.println("d " + System.identityHashCode(d));
            System.out.println("ad.numA " + System.identityHashCode(ad.numA));
            System.out.println("d.numA " + System.identityHashCode(d.numA));
            System.out.println("ad.numA " + System.identityHashCode(((D) ad).numD));
            System.out.println("d.numA " + System.identityHashCode(d.numD));

        }


//        if (ac instanceof C) {
//            C cc = (C) ac;
//            System.out.println(cc.numC);
//            System.out.println( cc.numA);
//            System.out.println( cc.numB);
//        }
    }
}

//