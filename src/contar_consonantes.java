import java.util.Scanner;

public class contar_consonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("introduce una frase");
        frase = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));

            if (Character.isLetter(c) && !(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                contador ++;
            }

        }
        System.out.println("el numero de consonantes es : " +contador);
    }
}
