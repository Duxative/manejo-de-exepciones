import java.util.Scanner;

public class Main {

    static void CaracterEn(String cadena, int posicion){
        try {
            System.out.println(cadena.charAt(posicion));
        }catch (Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Escribe una palabra");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        CaracterEn(texto,7);
    }
}
