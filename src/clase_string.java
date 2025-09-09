import java.util.Scanner;

public class clase_string {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("introduce una frase");
     String frase = sc.nextLine();

     System.out.println("la longitud de la frasae es:" +frase.length());
     System.out.println("el primer carcter:" +frase.charAt(0) );
     System.out.println("el ultimo carcter:" +frase.charAt(frase.length()-1)); //da la posición del último carácter (porque las posiciones empiezan desde 0, no desde 1)
     System.out.println("en mayuscula: "+frase.toUpperCase());

     String invertida = " ";
     for (int i = frase.length() -1; i >= 0; i--){
         invertida += frase.charAt(i);

     }
     System.out.println("al reves: " +invertida);
 }

}
