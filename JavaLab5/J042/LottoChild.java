package JavaLab5.J042;

import JavaLab5.J041.Lotto;
import java.util.Random;
import java.util.Scanner;

public class LottoChild extends Lotto {

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public void remake() {
        boolean[] used = new boolean[46];
        int count = 0;
        int[] nums = new int[6];

        System.out.println("1~45 사이의 숫자 6개를 중복 없이 입력하세요:");

        while (count < 6) {
            System.out.print((count + 1) + "번째 숫자: ");
            try {
                int num = sc.nextInt();

                if (num < 1 || num > 45) {
                    System.out.println("⚠️ 1부터 45 사이 숫자만 입력하세요.");
                    continue;
                }

                if (used[num]) {
                    System.out.println("⚠️ 이미 입력한 숫자입니다. 다시 입력하세요.");
                    continue;
                }

                nums[count++] = num;
                used[num] = true;

            } catch (Exception e) {
                System.out.println("⚠️ 숫자만 입력하세요.");
                sc.nextLine(); // 버퍼 비우기
            }
        }

        setNumbers(nums);  // ✅ 정상 동작
        System.out.print("입력한 번호: ");
        printNumbers();
    }
}