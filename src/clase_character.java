import java.util.Scanner;

public class clase_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter");
        char c = sc.next().charAt(0);
        System.out.println("el caracter es letra " +Character.isLetter(c));
        System.out.println("el caracter es numero " +Character.isDigit(c));
        System.out.println("el caracter es mayus " +Character.isUpperCase(c));
        System.out.println("el caracter es minus " +Character.isLowerCase(c));
        System.out.println("el caracter es equivalente en mayus " +Character.toUpperCase(c));
    }
}
