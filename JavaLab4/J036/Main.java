package JavaLab4.J036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        CheckReverse cr = new CheckReverse();

        String input = sc.nextLine();
        cr.setInput(input);

        boolean isSame = cr.isSameRv();

        if(isSame == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
