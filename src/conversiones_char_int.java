public class conversiones_char_int {
    public static void main(String[] args){
        char letra = 'A';
        char digito = '8';

        // hacer el codigo unicode
        int valorunicode = letra;
        System.out.println("unicode de 'a':" +valorunicode) ;

        // convertir char numerico a int
        int numero1 = digito -'0';
        System.out.println("numero a partir de '8' "+numero1);

        // usando character
        int numero2 = Character.getNumericValue(digito);
        System.out.println("numero con getnumericvalue " +numero2);

    }
}
