public class Fatorial {

    public static void main(String[] args) {

        Fatorial input = new Fatorial();
        int total = input.fatorial(5);
        System.out.println(total);

    }

    public int fatorial(int value) {
        if (value == 0)
            return 1;

        return value * fatorial(value - 1);
    }
}