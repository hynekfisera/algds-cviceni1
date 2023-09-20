import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jak se jmenujes?");
        String jmeno = input.nextLine();
        System.out.println("Hello, " + jmeno + "!");

        System.out.println("Zadej cislo 1:");
        float c1 = input.nextFloat();
        System.out.println("Zadej cislo 2:");
        float c2 = input.nextFloat();
        float vysledek = c1 / c2;
        System.out.println(vysledek);
    }
}
