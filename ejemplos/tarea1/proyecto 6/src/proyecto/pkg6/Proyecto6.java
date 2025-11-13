/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg6;
    import java.util.Locale;
    import java.util.Scanner;



/**
 *
 * @author Carolina Mazón
 */
public class Proyecto6 {

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
        int edad;
        String parroquia;
        int dia;
        double desc = 0.05;
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
                
        System.out.println("Ingrese día de pago");
        dia = entrada.nextInt();    
                double valorDesc = (membresia * desc);
        double descFin = (membresia - valorDesc);
        
        if ((dia >= 0 && dia < 10) || ((parroquia.equals("El Valle") || 
                (parroquia.equals("El Sagrario"))))){
            System.out.printf("FUERZA TOTAL\n\nNombre: %s\nApellido: "
                    + "%s\nUsuario: %s\nEdad: %s\nDia de pago: %s\nParroquia: "
                    + "%s\nUSTED HA APLICADO AL DESCUENTO: $%.2f\n\n", 
                    nombre, 
                    apellido, 
                    usuario, 
                    edad, 
                    dia, 
                    parroquia, 
                    descFin);
        }else{
            System.out.printf("FUERZA TOTAL\n\nNombre: %s\nApellido: "
                    + "%s\nUsuario: %s\nEdad: %s\nDia de pago: %s\nParroquia: "
                    + "%s\nMEMBRESIA MENSUAL SIN DESCUENTO: $%.2f\n\n", 
                    nombre, 
                    apellido, 
                    usuario, 
                    edad, 
                    dia, 
                    parroquia, 
                    membresia);
        }
           
    }
    
}


        // TODO code application logic here
    
    

