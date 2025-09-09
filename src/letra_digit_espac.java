import java.util.Scanner;

public class letra_digit_espac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter: ");
        char caracter = sc.next().charAt(0);
        if (Character.isLetter(caracter)) {
            System.out.println("el caracter es una letra");

        } else if (Character.isDigit(caracter)) {
            System.out.println("es un DIGITO");

        } else if (Character.isWhitespace(caracter)) {
            System.out.println("es un espacio");



        }else {
            System.out.println("es otro caracter ");
        }
    }
}

