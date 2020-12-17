/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franciscojavierlf
 */
public class Test {
    
    public static void main(String args[]) {
        String res = ventaLibrosWSDLOperation("0000000000001", 1, 1);
        System.out.println(res);
    }

    private static String ventaLibrosWSDLOperation(java.lang.String isbn, int idUsuario, int unidades) {
        org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLService service = new org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLService();
        org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLPortType port = service.getVentaLibrosWSDLPort();
        return port.ventaLibrosWSDLOperation(isbn, idUsuario, unidades);
    }
    
    
}
