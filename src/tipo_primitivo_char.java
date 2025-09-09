import java.util.Scanner;

public class tipo_primitivo_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter:");
        char c = sc.next().charAt(0); // se debe de poner un charAT(0) porque sc.next devuelve un string, pero c es de tipo char
        System.out.println("el codigo unicode de " + c + " es " +(int)c);
    }
}
