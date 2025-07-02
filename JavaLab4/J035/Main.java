package JavaLab4.J035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        SeparateB sb = new SeparateB();

        String birth = sc.nextLine();
        sb.setBirth(birth);
        int result = sb.result();

        System.out.println(result);

        sc.close();
    }
}
