import java.util.Scanner;

public class convertir_array_caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();

        char [] letras = palabra.toCharArray(); // convierte la palabra array de caracteres
        // char [] declara una array de caracteres
        // letras nombre de la variable que contendra el array
        // palabra.tocharArray() metodo que convierte el String en una array de caracteres
        System.out.println("letras una por linea"); // mostrar cada letra en una linea
        for (char c : letras) { //for (tipo_elemento variable : array_o_coleccion) {
            System.out.println(c);
        }
        // char tipo de dato de cada elemento del array
        // c variable temporal que representa cada elemento en cada iteracion
        // letras el arrray que se va a recorrer
        // char[] letras = {'H', 'O', 'L', 'A'};
        //
        //for (char c : letras) {
        //    System.out.println(c);
        //}
        //
        //// Es equivalente a:
        //for (int i = 0; i < letras.length; i++) {
        //    char c = letras[i];
        //    System.out.println(c);
        //}
        System.out.println("palabras al reves");
        for (int i= letras.length -1; i >= 0; i--){
            System.out.println(letras[i]);
        }
    }


}
