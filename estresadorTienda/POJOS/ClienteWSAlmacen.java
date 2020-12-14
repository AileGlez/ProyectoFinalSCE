/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//================================================================
// Código del Cliente:
//================================================================
package example.hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.lang.Math;
public class ClienteWSAlmacen 
{
    //private Cliente() {}
    public static void main(String[] args) 
    {
       long lngQuienSoy;
       long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
       long lngCuantosMilisFaltan;
       
       String host = (args.length < 1) ? null : args[0];
       //100 peticiones por default
       int n = (args.length< 2) ? 100: Integer.parseInt(args[1]);
       long i,t0,t1,dt;
       boolean response;
       
       
       try 
        {
             Registry registry = LocateRegistry.getRegistry(host);
             IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
             lngQuienSoy = servDisparo.quienSoy();
             lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
             System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
             sumDeltaT  = 0;
             sumDeltaT2 = 0;
             //Hello stub = (Hello) registry.lookup("Hello");
             
             //Creo el puerto necesario para hacer llamadas repetidas al WS
             wsalmacen.Almacen port = port();
             Thread.currentThread().sleep(lngCuantosMilisFaltan);
             
             for(i= 0; i < n; i++ )
             {
               t0 = System.currentTimeMillis();  
               //response = stub.sayHello();
               //para el número de libros en el pedido genero un número aleatorio entre 1 y 10
               response = port.comprobarStock("" + lngQuienSoy + "" +n, (int)Math.floor(Math.random()*10)+1);
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

    private static wsalmacen.Almacen port() {
        wsalmacen.AlmacenService service = new wsalmacen.AlmacenService();
        return service.getAlmacenPort();
    }
    
}
//================================================================

