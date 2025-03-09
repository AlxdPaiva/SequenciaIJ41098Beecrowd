/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenciaij41098beecrowd;

/**
 *
 * @author alxdr
 */
public class SequenciaIJ41098Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (float i = 0; i<=2.01; i+=0.2) {
            for(float j = 1; j <=3; j++){
                if (Math.abs(i - Math.round(i)) < 0.00001 && Math.abs((j + i) - Math.round(j + i)) < 0.00001) {
                    System.out.printf("I=%.0f J=%.0f%n", i, j + i);
                } else if (Math.abs(i - Math.round(i)) < 0.00001) {
                    System.out.printf("I=%.0f J=%.1f%n", i, j + i);
                } else if (Math.abs((j + i) - Math.round(j + i)) < 0.00001) {
                    System.out.printf("I=%.1f J=%.0f%n", i, j + i);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", i, j + i);
                }
            }            
        }      
    }    
}
