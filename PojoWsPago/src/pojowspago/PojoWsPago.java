/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojowspago;

import java.math.BigDecimal;
import tstpojowspago.Factura;
import wsarticulo.Articulo;
import wscliente.Cliente;

/**
 *
 * @author susy_
 */
public class PojoWsPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1 SE CREA UN PEDIDO
        int idFacSI=nuevoPedido(1,"0000000000004",4);//ESTE SI TIENE FONDOS
        int idFacNO=nuevoPedido(2,"0000000000002",100);//ESTE NO TIENE FONDOS
        
        java.util.List<Factura> listaF=findByIdfactura(idFacSI);
        Factura f= new Factura();
        for(Factura fp:listaF)
        {
            f.setIdfactura(fp.getIdfactura());
            f.setClienteId(fp.getClienteId());
            f.setArticuloIsbn(fp.getArticuloIsbn());
            f.setMediopagoId(fp.getMediopagoId());
            f.setCantidad(fp.getCantidad());
            f.setTotalapagar(fp.getTotalapagar());
            System.out.println("Los fondos del cliente en el pedido 1 son: "+f.getClienteId().getMediopagoId().getFondos());
            System.out.println("El precio del articulo solicitado en el pedido 1 es: "+f.getArticuloIsbn().getPrecio());
            System.out.println("La cantidad solicitada del articulo en el pedido 1 es: "+f.getCantidad());
            System.out.println("El total a pagar en el pedido 1 es: "+f.getTotalapagar());
        }
        
        java.util.List<Factura> listaF1=findByIdfactura(idFacNO);
        Factura f1= new Factura();
        for(Factura fp:listaF1)
        {
            f1.setIdfactura(fp.getIdfactura());
            f1.setClienteId(fp.getClienteId());
            f1.setArticuloIsbn(fp.getArticuloIsbn());
            f1.setMediopagoId(fp.getMediopagoId());
            f1.setCantidad(fp.getCantidad());
            f1.setTotalapagar(fp.getTotalapagar());
            System.out.println("Los fondos del cliente en el pedido 2 son: "+f1.getClienteId().getMediopagoId().getFondos());
            System.out.println("El precio del articulo solicitado en el pedido 2 es: "+f1.getArticuloIsbn().getPrecio());
            System.out.println("La cantidad solicitada del articulo en el pedido 2 es: "+f1.getCantidad());
            System.out.println("El total a pagar en el pedido 2 es: "+f1.getTotalapagar());
        }
        //ASUMIMOS QUE SÍ HAY STOCK (SI NO HAY NO SE COMPLETA LA TRANSACCIÓN i.e. NO SE DECREMENTA STOCK NI FONDOS) 
        
        //2 PREGUNTAMOS SI HAY FONDOS SUFICIENTES
        String s=" NO ";
        String ss=" FALLIDA ";
        if(hayFondos(f.getIdfactura())){
            s=" SI ";
            ss=" EXITOSA ";
        }
        System.out.println("Los fondos del medio de pago para el pedido 1"+s+"fueron suficientes");
        System.out.println("La transacción 1 fue"+ss);
        
        s=" NO ";
        ss=" FALLIDA ";
        if(hayFondos(f1.getIdfactura())){
            s=" SI ";
            ss=" EXITOSA ";
        }
        System.out.println("Los fondos del medio de pago para el pedido 2"+s+"fueron suficientes");
        System.out.println("La transacción 2 fue"+ss);
        //ASUMIMOS QUE SÍ HAY FONDOS (SI NO HAY NO SE COMPLETA LA TRANSACCIÓN i.e. SE REGRESA EL STOCK QUE ESTABA ON HOLD Y NO SE DECREMENTAN FONDOS)
        
        //3 SE DECREMENTAN LOS FONDOS DEL MÉTODO DE PAGO
        System.out.println("Los fondos del medio de pago del cliente en el pedido 1 decrementaron y ahora el total de fondos es: "+updateFondosMedPag(f.getMediopagoId().getIdmedpago(),f.getTotalapagar(),true));
        System.out.println("RESET y ahora el total de fondos es: "+updateFondosMedPag(f.getMediopagoId().getIdmedpago(),f.getTotalapagar(),false));//este resetea los fondos para que las pruebas no se compliquen
        //SE VA EL PEDIDO A ENVÍOS
        
    }


    private static boolean hayFondos(int facturaId) {
        tstpojowspago.WsPago_Service service = new tstpojowspago.WsPago_Service();
        tstpojowspago.WsPago port = service.getWsPagoPort();
        return port.hayFondos(facturaId);
    }

    private static java.util.List<wsarticulo.Articulo> findByNombreArt(java.lang.String nom) {
        wsarticulo.WsArticulo_Service service = new wsarticulo.WsArticulo_Service();
        wsarticulo.WsArticulo port = service.getWsArticuloPort();
        return port.findByNombre(nom);
    }

    private static java.util.List<wscliente.Cliente> findByIdcliente(int id) {
        wscliente.WsCliente_Service service = new wscliente.WsCliente_Service();
        wscliente.WsCliente port = service.getWsClientePort();
        return port.findByIdcliente(id);
    }

    private static void createFac(tstpojowspago.Factura entity) {
        tstpojowspago.WsPago_Service service = new tstpojowspago.WsPago_Service();
        tstpojowspago.WsPago port = service.getWsPagoPort();
        port.create(entity);
    }

    private static java.util.List<tstpojowspago.Factura> findByIdfactura(int id) {
        tstpojowspago.WsPago_Service service = new tstpojowspago.WsPago_Service();
        tstpojowspago.WsPago port = service.getWsPagoPort();
        return port.findByIdfactura(id);
    }

    private static BigDecimal updateFondosMedPag(int idMedioPago, java.math.BigDecimal monto, boolean decrementa) {
        wsmediopago.WsMedioPago_Service service = new wsmediopago.WsMedioPago_Service();
        wsmediopago.WsMedioPago port = service.getWsMedioPagoPort();
        return port.updateFondosMedPag(idMedioPago, monto, decrementa);
    }

    private static int nuevoPedido(int idCliente, java.lang.String isbn, int cant) {
        tstpojowspago.WsPago_Service service = new tstpojowspago.WsPago_Service();
        tstpojowspago.WsPago port = service.getWsPagoPort();
        return port.nuevoPedido(idCliente, isbn, cant);
    }
    
    
    
}
