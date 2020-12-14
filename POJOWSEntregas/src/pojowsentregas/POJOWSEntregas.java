/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojowsentregas;

import static java.lang.System.currentTimeMillis;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import wsEntregas.Empresa;
import wsEntregas.Envio;
import wsEntregas.Factura;
import wsEntregas.ParseException_Exception;

/**
 *
 * @author avion
 */
public class POJOWSEntregas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DatatypeConfigurationException {
        // TODO code application logic here

                
        ///////////IMPORTANTE
        ////////// DARSE CUENTA AL INTEGRAR, QUE HAY CONSTRAINTS EN LA BASE
        
  /*//////////////////////////////////////////////////////////////////////////////
            AQUÍ HAY QUE TRAER LAS FACTURAS REALES, Y SUSTITUIR el TOTAL ENVÍOS
        AL INTEGRAR ESTE POJO CON EL DE WSPAGO
//////////////////////////////////////////////////////////////////////////////*/         
   
        int totalEnvios = 9; // Sustituir aquí cuántos envíos hay que hacer en total
        Random rnd = new Random();
        Envio envioPrueba = new Envio();
        
        
        // FECHA DE ENTREGA
        GregorianCalendar gc = new GregorianCalendar();
        int low = 0;
        int high = 2;
        int month = rnd.nextInt(high-low) + low;
        low = 1;
        high = 29; 
        int day = rnd.nextInt(high-low)+low;
        gc.set (2021, month, day); // Y/M-1/D (es decir, mes 0 es enero)       
        XMLGregorianCalendar fechaAprox = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        
        
        ///////////////////////////////////////////////////////////////////
        //////////////// SUSTITUIR AQUÍ LAS FACTURAS AL PONER TODO ///////
        /////////////// EN UN ÚNICO POJO, USANDO EL WSPago/////////////////
        ///////////////////////////////////////////////////////////////////
        Factura factura = new Factura();
        factura.setIdfactura(2);       

        //////////////////////////////////////////////////////////////////
        //////////////// HACER LO MISMO CON LAS EMPRESAS ///////
        //////////////////////////////////////////////////////////////

        Empresa empresa = new Empresa();
        empresa.setIdempresa(1);
        empresa.setNombre("Empresa patito");
        
        envioPrueba.setFechaentrega(fechaAprox);
        envioPrueba.setFacturaId(factura);
        envioPrueba.setEmpresaId(empresa);       
        create(envioPrueba);
        
        
  
        /* QUITAR COMENTARIOS PARA HABILITAR "FOR" CUANDO SE TENGA EL TOTAL DE ENVÍOS A HACER
        
        for (int i = 1; i < totalEnvios ;i++){
            // FECHA DE ENTREGA
            GregorianCalendar gc = new GregorianCalendar();
            int low = 0;
            int high = 2;
            int month = rnd.nextInt(high-low) + low;
            low = 1;
            high = 29; 
            int day = rnd.nextInt(high-low)+low;
            gc.set (2021, month, day); // Y/M-1/D (es decir, mes 0 es enero)       
            fechaAprox = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
            
            wsEntregas.Envio envio = new Envio();
            envio.setFechaentrega(fechaAprox);
            envio.setIdenvio(i);
            
            
///////////////////////////////////////////////////////////////////////////////
            AQUÍ HAY QUE TRAER LAS FACTURAS REALES Y EMPRESAS REALES
//////////////////////////////////////////////////////////////////////////////          
            factura = new Factura();
            factura.setIdfactura(rnd.nextInt());
            empresa.setIdempresa(1);
            empresa.setNombre("Empresa patito"); 
        
            // SET variables al envío
            envio.setFacturaId(factura);
            envio.setEmpresaId(empresa);
            envio.setFechaEntrega(date2);
            create(envio);
        }*/
        
        // Prueba count
        System.out.println("Número de envíos: " + count());
        
        // Prueba findAll
        java.util.List<wsEntregas.Envio> listaEnvios = findAll();
        System.out.println("Lista de Envíos:" + (listaEnvios.isEmpty() ? " Lista sin elementos":"" ));
        for(wsEntregas.Envio env:listaEnvios)
            System.out.println("Envío: " + env.getIdenvio() + " para empresa: " 
                    + env.getEmpresaId().getNombre() 
                    + " con factura número: " + env.getFacturaId().getIdfactura()
                    + " con total a pagar por: " + env.getFacturaId().getTotalapagar()
                    + " se entrega en fecha aproximada: " + env.getFechaentrega()); 
        
        // Prueba find
        Envio envioFind = find(listaEnvios.get(1).getIdenvio()); // Sustituir el "1" por el que se desee
        System.out.println("Pedido: " + envioFind.getIdenvio() + " de la empresa: " + envioFind.getEmpresaId().getNombre());
        
        
        
        //Prueba remove
        System.out.println("Remueve pedido: " + listaEnvios.get(1).getIdenvio()); 
        remove(listaEnvios.get(1));
        listaEnvios = findAll();
        System.out.println("Lista de Envíos:" + ( listaEnvios.isEmpty() ? " Lista sin elementos":"" ));
        for(wsEntregas.Envio env:listaEnvios){           
            System.out.println("Envío: " + env.getIdenvio() + " para empresa: " 
                    + env.getEmpresaId().getNombre() 
                    + " con factura número: " + env.getFacturaId().getIdfactura()
                    + " con total a pagar por: " + env.getFacturaId().getTotalapagar());
        }
        
        //VER ENVÍOS ENTREGADOS
        System.out.println("Envíos entregados");
        java.util.List<wsEntregas.Envio> listaEntregados;
        XMLGregorianCalendar fechaActual = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        try {
            listaEntregados = findByFechaEntrega(fechaActual);
            for(wsEntregas.Envio env:listaEntregados){           
            System.out.println("Envío: " + env.getIdenvio() + " para empresa: " 
                    + env.getEmpresaId().getNombre() 
                    + " con factura número: " + env.getFacturaId().getIdfactura()
                    + " se entregó el: " + env.getFechaentrega());
            }
        } catch (ParseException_Exception ex) {
            Logger.getLogger(POJOWSEntregas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    private static int count() {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.count();
    }


    /*private static int fechaEnvio(int fechaEnvio) {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.fechaEnvio(fechaEnvio);
    }*/

    private static Envio find(java.lang.Object id) {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.find(id);
    }

    private static java.util.List<wsEntregas.Envio> findAll() {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.findAll();
    }

    /*private static java.util.List<wsEntregas.Envio> findRange(java.util.List<java.lang.Integer> range) {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.findRange(range);
    }*/

    private static void remove(wsEntregas.Envio entity) {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        port.remove(entity);
    }

    private static int create(wsEntregas.Envio entity) {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.create(entity);
    }

    private static java.util.List<wsEntregas.Envio> findByFechaEntrega(javax.xml.datatype.XMLGregorianCalendar deliveryDate) throws ParseException_Exception {
        wsEntregas.WsEnvios_Service service = new wsEntregas.WsEnvios_Service();
        wsEntregas.WsEnvios port = service.getWsEnviosPort();
        return port.findByFechaEntrega(deliveryDate);
    }

    

   

 }
