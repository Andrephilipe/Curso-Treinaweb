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

        System.out.printf("Ola %s%n sua idade é",x, + idade);
        
        sc.close();
    }
}
