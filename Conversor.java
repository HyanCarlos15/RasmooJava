import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
//        Conversor de moeda

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em Reais que quer converter");
        double reais = scanner.nextDouble();

        double dolar = 5.47;
        double resultado = (reais / dolar);

        System.out.println("O valor convertido para dolares é de US$"+resultado);

        System.out.println("Agora Digite um valor em Dolares para converter");

        double dolar1 = scanner.nextDouble();
        double resultado2 = (reais * dolar1);

        System.out.println("O valor convertido em reais é de R$"+resultado2);

}

}