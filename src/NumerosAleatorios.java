import java.util.Arrays;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[10];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println( "Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println( "Sucessores dos numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");


    }
}
}
