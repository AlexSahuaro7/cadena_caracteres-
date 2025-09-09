import java.util.Scanner;

public class dos_frases_corta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase = sc.nextLine();
        System.out.println("introduce una segunda frase");
        String frase2 = sc.nextLine();
        if (frase.length()>frase2.length()){
            System.out.println("la frase: " +frase + " es mayor que la frase " +frase2);

        }else if (frase.length()<frase2.length()) {
            System.out.println("la frase: " +frase+ "es menor que la frase "+frase2);
        }else {
            System.out.println("las frases son iguales");
        }
        int numerofrase = frase.length();
        System.out.println("la cantidad de caracteres son: " +numerofrase);
        int numerofrase2 = frase2.length();
        System.out.println("la cantidad de caracteres son: " +numerofrase2);
        System.out.println(" la diferencia entre frases es de: " + Math.abs(numerofrase2 - numerofrase));
    }
}
