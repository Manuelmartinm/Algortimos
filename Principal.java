package entornos;

import java.util.Random;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Random rand = new Random();

        while (true) {
            for (int i = 0; i < 3; i++) {
                numeros[i] = rand.nextInt(9) + 1;
            }
            if (numeros[0] != numeros[1] && numeros[0] != numeros[2] && numeros[1] != numeros[2]) {
                break;
            }
        }
        int[] resultadoFibonacci = new int[3];
        for (int i = 0; i < 3; i++) {
            resultadoFibonacci[i] = fibonacci(numeros[i]);
        }

        int[] resultadoFactorial = new int[3];
        for (int i = 0; i < 3; i++) {
            resultadoFactorial[i] = factorial(numeros[i]);
        }

        boolean[] resultadoPrimos = new boolean[3];
        for (int i = 0; i < 3; i++) {
            resultadoPrimos[i] = esPrimo(numeros[i]);
        }

        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("Fibonacci: " + Arrays.toString(resultadoFibonacci));
        System.out.println("Factorial: " + Arrays.toString(resultadoFactorial));
        System.out.println("Primos: " + Arrays.toString(resultadoPrimos));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
