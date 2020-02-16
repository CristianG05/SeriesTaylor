package Vista;
import java.util.Scanner;
import Modelo.Funciones;

public class Menú {
    
    public static void main(String[] args){
        Funciones fun=new Funciones();
        Scanner sc=new Scanner(System.in);
        System.out.println(" --------------------------------------------------------");
        System.out.println("|                    SERIES DE TAYLOR                    |");
        System.out.println(" --------------------------------------------------------");
        System.out.print(" POR FAVOR, INGRESE LA CANTIDAD DE ITERACIONES: ");
        int limite=sc.nextInt();
        System.out.println("");
        System.out.print(" POR FAVOR INGRESE LOS GRADOS: ");
        double grados=sc.nextDouble();
        System.out.println(" -------------------------------------------------------- \n");
        
        System.out.println(" --------------------------------------------------------");
        System.out.println("|                      RESPUESTAS                        |");
        System.out.println(" --------------------------------------------------------");
        fun.Exponencial(limite, grados);
        System.out.println("");
        fun.Seno(limite, grados);
        System.out.println("");
        fun.Coseno(limite, grados);
        System.out.println(" -------------------------------------------------------- \n");
        
    }
}
