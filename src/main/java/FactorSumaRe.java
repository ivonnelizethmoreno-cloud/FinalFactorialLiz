public class FactorSumaRe {
    // Método para multiplicar usando sumas recursivas
    public int multiplicarPorSuma(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicarPorSuma(a, b - 1);
    }

    // Método recursivo para calcular el factorial usando sumas
    public int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return multiplicarPorSuma(n, calcularFactorial(n - 1));
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        FactorSumaRe calculadora = new FactorSumaRe();
        int numero = 5;
        int resultado = calculadora.calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " usando sumas es: " + resultado);
    }
}
