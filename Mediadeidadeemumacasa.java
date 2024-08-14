public class Mediadeidadeemumacasa {
    public static void main (String[] args){

        int Pai = 53;
        int Mae = 52;
        int Filha1 = 32;
        int Filha2 = 30;
        int Filha3 = 20;

        int soma = (Pai + Mae + Filha1 + Filha2 + Filha3);

        int media = (soma/5);

        System.out.println("A soma das idades dentro da casa é de: " + soma);

        boolean usuarioativo1 = true;


        System.out.println(usuarioativo1);
        System.out.println(Filha1 == 30);
        System.out.println(Filha3 <= 25);
        System.out.println(Mae == Filha1);
        System.out.println(Filha1 <= Filha3);

        System.out.println(usuarioativo1 = true && Filha3 == 35);
        System.out.println(usuarioativo1 = false || Mae > 52);

        System.out.println("A media das idades na casa é de: " + media);



    }
}
