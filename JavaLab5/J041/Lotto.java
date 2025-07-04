package JavaLab5.J041;

import java.util.Random;

public class Lotto {

    Random rand = new Random();

    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }


    public Lotto(){
        generateUniqueNumbers();
    }

    public void printNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(numbers[i]);
        }
        System.out.println();
    }

    public void remakeAuto() {
        generateUniqueNumbers();
    }

    private void generateUniqueNumbers() {
        boolean[] used = new boolean[46]; // 1~45
        int count = 0;
        numbers = new int[6];

        while (count < 6) {
            int num = rand.nextInt(45) + 1; // 1~45
            if (!used[num]) {
                numbers[count++] = num;
                used[num] = true;
            }
        }
    }
}
