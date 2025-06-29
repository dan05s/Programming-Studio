package JavaLab4.J033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckStringLength csl = new CheckStringLength();

        int num = sc.nextInt();
        sc.nextLine();
        csl.setNamesNum(num);

        String[] names = new String[num];
        for(int i=0; i<num; i++){
            names[i] = sc.nextLine();
        }
        csl.setNames(names);

        String[][] result = csl.checkStringLength();
        
        System.out.print("Longest: ");
        System.out.println(String.join(", ", result[0]));

        System.out.print("Shortest: ");
        System.out.println(String.join(", ", result[1]));

        sc.close();
    }
}
