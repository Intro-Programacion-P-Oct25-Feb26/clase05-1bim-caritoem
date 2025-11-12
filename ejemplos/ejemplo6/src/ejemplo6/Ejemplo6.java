/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double membresia = 25;
        String nombre;
        String apellido;
        String usuario;
        int dia_pago;
        double total_cancelar;
        double descuento = 0.25;
        double totaldesc;
        int edad;
        String parroquia = "El Valle"
         String parroquia = "El Sagrario"
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese la parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese dia de pago");
        dia_pago = entrada.nextInt();
        
         if ((dia_pago <10) && 
                 (parroquia.equals ("El Valle") ||parroquia.equals("El Sagrario"))) 
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }
        
        String parroquia; 
        S
        
    }
    
}
