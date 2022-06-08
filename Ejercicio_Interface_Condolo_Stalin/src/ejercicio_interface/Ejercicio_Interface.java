/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_interface;

/**
 *
 * @author sscon
 */
public class Ejercicio_Interface  {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImpresoraCanon canon = new ImpresoraCanon(19,10);
        ImpresoraCanon canon2 = new ImpresoraCanon(2);
        IImpresora canon3 = new ImpresoraCanon(); //llamada al metodo default mediante un objeto canon3
        
        ImpresoraHP hp = new ImpresoraHP(7,10);
        ImpresoraHP hp2 = new ImpresoraHP();
        IImpresora hp3 = new ImpresoraHP(); 
        
        ImpresoraEpson epson = new ImpresoraEpson(4,6);
        ImpresoraEpson epson2 = new ImpresoraEpson();
        IImpresora epson3 = new ImpresoraEpson();
        
        canon3.Imprimir(" CANON "); //llamada al metodo default
        canon2.ObtenerVelocidad(); //llamada al metodo sobrecargado
        canon.ObtenerVelocidad(); //llamada al metodo implementado con interface 
        
        System.out.println("--------------------------------");
        
        hp3.Imprimir(" HP ");
        hp2.ObtenerVelocidad(100);
        hp.ObtenerVelocidad();
        
        System.out.println("--------------------------------");
        
        epson3.Imprimir(" EPSON ");
        epson2.ObtenerVelocidad(6);
        epson.ObtenerVelocidad();
        
        //ImpresoraCanon canon3 = new ImpresoraCanon(6);
        //IImpresora canon2 = new ImpresoraCanon();
        //IImpresora hp4 = new ImpresoraHP();
        //ImpresoraHP hp = new ImpresoraHP(6,14);
        
        /*canon2.Imprimir("IMPRESORA CANON");
        hp4.Imprimir("IMPRESORA HP");
        canon.Velocidad();
        canon3.Velocidad();
*/
    }
}
