import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        int y = 34;
        double x = 45.0000;

        String nome = "Andre";
        int idade = 28;
        double renda = 1.679;

        System.out.println("Olá Mundo "+ y);

        System.out.print("Resultado do calculo é " + x );
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.4f reais%n", nome, idade, renda);
        teste(args);
    }

    public static void teste(String[]args){
        String prod1 = "Computer";
        String prod2 = "DeskTop";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.00;
        double measure = 53.2345;

        System.out.println("Product:");
        System.out.println(prod1 + ",which price is $R" + prince1 );
        System.out.println(prod2 + ",which price is $R" + prince2);

        System.out.println("Record: " + age + "year old, code" + code + "and gender" + gender);
        
        System.out.printf("Measue with eight decimal places: %.4f", measure);
        System.out.printf("(tree decimal places): %.3f", measure);
        System.out.printf("%.2f", measure);
    }
}
