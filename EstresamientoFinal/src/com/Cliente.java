/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//================================================================
// Código del Cliente:
//================================================================
package com;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Cliente 
{
    //private Cliente() {}
    public static void main(String[] args) 
    {
       long lngQuienSoy;
       long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
       long lngCuantosMilisFaltan;
       
       String host = (args.length < 1) ? null : args[0];
       long n,t0,t1,dt;
       int i;
       String response;
       
       n = 250;
       
       try
        {
             Registry registry = LocateRegistry.getRegistry(host);
             IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
             lngQuienSoy = servDisparo.quienSoy();
             lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
             System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
             sumDeltaT  = 0;
             sumDeltaT2 = 0;
             Thread.currentThread().sleep(lngCuantosMilisFaltan);
             
             for(i= 0; i < n; i++ )
             {
               t0 = System.currentTimeMillis();  
               response = ventaLibrosWSDLOperation(getPaddedISBN(1), (int)lngQuienSoy, 1);
               t1 = System.currentTimeMillis();
               dt = t1 - t0;
               sumDeltaT  += dt;
               sumDeltaT2 += dt * dt;
               if( i == 0 )
               {
                   dtMin = dt;
                   dtMax = dt;
               }
               else
               {
                   if( dt < dtMin ) dtMin = dt;
                   if( dt > dtMax ) dtMax = dt;
               }
               System.out.println("Clte " + lngQuienSoy + ": " + response);
             }
             servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }
    
    /**
     * Regresa el id con ceros hasta tener 13 digitos.
     * @param id
     * @return 
     */
    private static String getPaddedISBN(int id) {
        String full = "0000000000000";
        int padding = 13;
        int aux = id;
        do {
            aux /= 10;
            padding--;
        }
        while(aux > 0);
        
        return full.substring(0, padding) + id;
    }
    

    private static String ventaLibrosWSDLOperation(java.lang.String isbn, int idUsuario, int unidades) {
        org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLService service = new org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLService();
        org.netbeans.j2ee.wsdl.mitienda.descriptorbpel.ventalibroswsdl.VentaLibrosWSDLPortType port = service.getVentaLibrosWSDLPort();
        return port.ventaLibrosWSDLOperation(isbn, idUsuario, unidades);
    }
}
//================================================================

