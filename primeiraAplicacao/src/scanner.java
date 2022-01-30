import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Digite seu nome");
        x = sc.next();

        int idade;
        System.out.println("Qual a sua idade ?");
        idade = sc.nextInt();

        System.out.printf("Ola %s%n ", x);
        System.out.println("Você tem " + idade + " de idade");

        double val;
        System.out.println("Quanto você recebe por mÊs?");
        val = sc.nextDouble();
        System.out.printf("Você recebe %.2f", val);

        sc.close();
    }
}
