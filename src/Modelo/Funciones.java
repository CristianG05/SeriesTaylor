package Modelo;

public class Funciones {

    public void Exponencial(int limite, double grados) {
        double x = grados * Math.PI / 180.0;
        double num, sum = 0;
        for (int n = 0; n < limite; n++) {
            num = Math.pow(x, n) / factorial(n);
            sum = sum + num;
        }
        System.out.println(" RESPUESTA EXPONENCIAL: " + sum);
    }

    public void Seno(int limite, double grados) {
        double x = grados * Math.PI / 180.0;
        double num, num2, sum = 0;
        int aux;
        for (int n = 0; n < limite; n++) {
            aux = 2 * n + 1;
            num = Math.pow(-1, n) / factorial(aux);
            num2 = num * Math.pow(x, aux);
            sum = sum + num2;
        }
        System.out.println(" RESPUESTA SENO: " + sum);
    }
    
    public void Coseno(int limite, double grados){
        double x = grados * Math.PI / 180.0;
        double num, num2, sum = 0;
        int aux;
        for (int n = 0; n < limite; n++) {
            aux = 2 * n;
            num = Math.pow(-1, n) / factorial(aux);
            num2 = num * Math.pow(x, aux);
            sum = sum + num2;
        }
        System.out.println(" RESPUESTA COSENO: " + sum);
    }

    public int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
