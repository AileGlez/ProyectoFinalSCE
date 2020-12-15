/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstpojomitienda;

/**
 *
 * @author Victor
 */
public class TstPojoMiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta = ventaLibrosWSDLOperation("0000000000001",1,1);
        System.out.println(respuesta);
    }

    private static String ventaLibrosWSDLOperation(java.lang.String isbn, int idUsuario, int unidades) {
        wsmitienda.VentaLibrosWSDLService service = new wsmitienda.VentaLibrosWSDLService();
        wsmitienda.VentaLibrosWSDLPortType port = service.getVentaLibrosWSDLPort();
        return port.ventaLibrosWSDLOperation(isbn, idUsuario, unidades);
    }

   
    
}
