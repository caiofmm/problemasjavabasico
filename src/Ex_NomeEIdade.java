import java.util.Scanner;

public class Ex_NomeEIdade{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            if(nome.equals("0")) break;

            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continue aqui... ");




    }
}