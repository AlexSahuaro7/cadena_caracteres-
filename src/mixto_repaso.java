import java.util.Scanner;

public class mixto_repaso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase: ");
        String frase = sc.nextLine();
        int vocales = 0;
        int consonanates =0;

        for (int i =0; i < frase.length(); i++) {
            char c = frase.charAt(i);  // obtiene el carácter en la posición i (tipo primitivo char, 16 bits en Java).
            c = Character.toUpperCase(c);
            if (Character.isLetter(c)) {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vocales ++;
                } else {
                    consonanates ++;
                }
            }

        }
        System.out.println("numero de vocales:" +vocales);
        System.out.println("numero de consonantes" +consonanates);
    }
}
