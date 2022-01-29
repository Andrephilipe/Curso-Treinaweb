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
    }
}
