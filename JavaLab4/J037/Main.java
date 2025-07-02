package JavaLab4.J037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        Anagram ag = new Anagram();

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        ag.setS1(s1);
        ag.setS2(s2);

        boolean isAnagram = ag.checkAnagram();

        if(isAnagram){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
