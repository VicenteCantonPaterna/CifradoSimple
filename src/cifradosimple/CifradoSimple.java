/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradosimple;

/**
 *
 * @author Vicente
 */
public class CifradoSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "Siempre es bueno prevenir la musica antes de que empiece el baile";
        byte[] mensajeCifrado;
        String mensajeDescifrado;
        
        ejemploCifrado ejemplo = new ejemploCifrado();
        
        mensajeCifrado = ejemplo.cifrarMensaje(mensaje);
        mensajeDescifrado = ejemplo.descifrarMensaje(mensajeCifrado);
        
        System.out.println(mensaje);
        System.out.println(mensajeCifrado);
        System.out.println(mensajeDescifrado);
         
    }
}
