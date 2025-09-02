import java.util.Scanner;

public class contar_vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {  // frase.length() devuelve el número total de caracteres.
            char c = frase.charAt(i);  // Extrae el carácter en la posición i (las posiciones empiezan en 0).
            c = Character.toLowerCase(c);
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // Comprueba si c es alguna de las vocales (a, e, i, o, u)
                contador ++;
            }

        }
        System.out.println(" numero tiene " +contador + " vocales");
    }
}