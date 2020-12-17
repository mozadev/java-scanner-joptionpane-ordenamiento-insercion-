
package ordenamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInsercion {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int arreglo[], nelemnentos,pos,aux;
         
         nelemnentos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
         
         arreglo = new int[nelemnentos];//asignamos el numero de elemntos al arreglo

        for (int i = 0; i < nelemnentos; i++) {
            System.out.println((i + 1) + " digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
         
        //ordenando por insercion
         for (int i = 0; i < nelemnentos; i++) {
             pos=i;
             aux=arreglo[i];
             
             while(pos>0&& arreglo[pos-1]>aux) {
                 arreglo[pos]=arreglo[pos-1];
                 pos--;
             }
             arreglo[pos]=aux;
           
        }
         System.out.println("orden ascendente");
         
        for (int i = 0; i < nelemnentos; i++) {
            System.out.print(arreglo[i] + "-");

        }
        System.out.println("");
         
    }
    
}
