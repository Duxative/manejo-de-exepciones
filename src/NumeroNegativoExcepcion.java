public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion() {
        super("El número introducido es negativo");
    }

    public NumeroNegativoExcepcion(String message) {
        super(message);
    }

}
