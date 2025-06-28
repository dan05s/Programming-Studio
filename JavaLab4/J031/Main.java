package JavaLab4.J031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CheckString cs = new CheckString();
        cs.setUserid(sc.nextLine());;

        String password;
        boolean isThree = true;
        while(isThree){
            password = sc.nextLine();
            if(password.length()<3){
                System.out.println("Error! password is too short. Enter password again.");
            }else{
                isThree = false;
                cs.setPassword(password);
            }
        }
        

        cs.setName(sc.nextLine());

        cs.printResult();

        sc.close();
    }
}
