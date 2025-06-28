package JavaLab4.J032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseString rs = new ReverseString();

        String sentence = sc.nextLine();
        rs.setSentence(sentence);
        char[] result = rs.reverseString();

        System.out.println(result);
    }
}
