package JavaLab5.J041;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Lotto lt = new Lotto();

        lt.printNumbers();

        lt.remakeAuto();

        lt.printNumbers();
    }
}
