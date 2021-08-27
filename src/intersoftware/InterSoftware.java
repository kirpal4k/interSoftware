/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersoftware;
import owners.Empleador;


/**
 *
 * @author 503
 */
public class InterSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Empleador empleador=new Empleador("Banco de Bogota");
      
      System.out.println("El nombre del empleador es: "+empleador.nombre);
      /*empleador.nombre="bancolombia";
      System.out.println("El nombre del empleador es: "+ empleador.nombre);
      
      empleador.nit=300;
      System.out.println("El nit es: "+empleador.nit);*/
    }
    
}
