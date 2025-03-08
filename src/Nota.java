import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = sc.nextInt();


        // a nota deve ser entre 0 e 10
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! digite novamente: ");
            nota = sc.nextInt();
        }
    }
}
