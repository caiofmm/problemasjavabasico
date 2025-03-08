import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior)  {
                maior = numero;
            }
            // mostrar numero maior
            count++;
        }while( count < 5); //informe 5 numeros
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/count));
        //media

    }
}
