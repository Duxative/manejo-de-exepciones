import java.util.Scanner;

public class NumeroNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        try {
            System.out.println("Escfibe un numero");
            valor = sc.nextInt();

            if(valor < 0){
                throw new NumeroNegativoExcepcion("El numero es negativo");
            }else {
                System.out.println(Math.sqrt(valor));
            }
        }catch (NumeroNegativoExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
