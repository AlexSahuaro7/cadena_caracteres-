import java.util.Scanner;

public class contar_convertir_mostrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase, por favor");
        String frase = sc.nextLine();

        System.out.println("el numero de letras que tiene es " +frase.length());
        System.out.println("la frase convertida en mayuscula es " +frase.toUpperCase());
        System.out.println("la frase contiene la palabra java " +frase.contains("java"));
    }
}
