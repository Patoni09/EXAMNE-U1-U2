/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.u1.u2;


public class ExamenU1U2 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Dime el pirmer nombre del istrumento");
        String I1 = scanner.nextLine();
        System.out.println("ingresa el precio de primer isntrumento");
        double P1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Dime el segundo nombre del instrumento");
        String I2 = scanner.nextLine();
        System.out.println("ingresa el precio del segundo isntrumento");
         double P2 = scanner.nextDouble();
        
        scanner.nextLine();
       
        System.out.println("Dime el tercer nombre del instrumento");
        String I3 = scanner.nextLine();
        System.out.println("ingresa el precio del tercer  isntrumento");
         double P3 = scanner.nextDouble();
        
        scanner.nextLine();
     
        scanner.close();
        
        double produco1G = (1250.45-P1);
        double produco2G = (3743-P2);
        double produco3G = (2683.78-P3);
        
        double Producto1G = (Producto1G/P1)*100 ;
        double Producto2G = (Producto2G/P2)*100 ;
        double Producto3G = (Producto3G/P3)*100 ;
       
        System.out.println("El procentaje de ganancia de "+I1+"es de"+Producto1GP);
        System.out.println("El procentaje de ganancia de "+I2+"es de"+Producto2GP);
        System.out.println("El procentaje de ganancia de "+I3+"es de"+Producto3GP);
        

    }
}