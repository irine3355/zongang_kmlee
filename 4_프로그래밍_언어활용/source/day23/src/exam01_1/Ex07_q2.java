package exam01_1;

public class Ex07_q2 {
    public static void main(String[] args) {
        char[] alpahabets = new char[26];
        char ch = 'A';

        for(int i=0; i<alpahabets.length; i++, ch++){
            alpahabets[i]= ch;
        }
        for(int i=0; i<alpahabets.length; i++){
            alpahabets[i]= (char)(alpahabets[i]+32);
        }
        for(int i=0; i<alpahabets.length; i++, ch++){
            System.out.println(alpahabets[i]);
        }

    }
}
