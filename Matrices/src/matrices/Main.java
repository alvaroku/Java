package matrices;
   
import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {
       
        scan = new Scanner(System.in);
        
       int matriz[][] = llenar(2,2);
    }
    
    //////////
    public static int [][] llenar(int m, int n){
        int[][] mat = new int[m][n];
        for ( int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un número impar para la posicion ["+i+"]["+j+"]");
                int num = scan.nextInt();
                mat[i][i] = verificarNumeroImpar(num);
            }
        }
        return mat;
    }
    ///////////////
    public static int verificarNumeroImpar(int n){
        while ((n%2)==0) {  
            System.out.println("Por favor ingrese un nùmero impar: ");
            n = scan.nextInt();
        }
        return n;
    }
}
