public class FactorialMulti {
    // Método recursivo para calcular el factorial
    public int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        FactorialMulti fc = new FactorialMulti();
        int numero = 5; // Puedes cambiar este valor para probar otros casos
        int resultado = fc.calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
