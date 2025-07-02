import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CheckCorrect cc = new CheckCorrect();

        String name = sc.nextLine();
        String password = sc.nextLine();

        int result = cc.CheckCorrect(name, password);

        switch (result) {
            case 1:
                System.out.println("Login OK!");
                break;
            case 2:
                System.out.println("No user");
                break;
            case 3:
                System.err.println("Incorrect password!");
                break;
            default:
                System.out.println("Erorr!");
        }

    }
}
