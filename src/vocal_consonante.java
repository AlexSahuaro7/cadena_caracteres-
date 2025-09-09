import java.util.Scanner;

public class vocal_consonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter: ");
        char caracter = sc.next().charAt(0);

        caracter = Character.toLowerCase(caracter);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("el caracter es una vocal");
        } else{
            System.out.println("el caracter es consonante");
        }

    }
}
