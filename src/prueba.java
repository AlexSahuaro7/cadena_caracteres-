public class prueba {
    public static void main(String[] args) {
        // Declaramos un char
        char c = 'a';

        // Usamos métodos de la clase Character
        System.out.println("El carácter es: " + c);

        // ¿Es una letra?
        System.out.println("¿Es letra? " + Character.isLetter(c));

        // ¿Es un dígito?
        System.out.println("¿Es número? " + Character.isDigit(c));

        // ¿Está en mayúscula?
        System.out.println("¿Es mayúscula? " + Character.isUpperCase(c));

        // Convertir a mayúscula
        System.out.println("En mayúscula sería: " + Character.toUpperCase(c));
    }
}
