/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojowsalmacen;

import wsalmacen.Articulo;

/**
 *
 * @author tabat
 */
public class PojoWsAlmacen {

    public static void main(String[] args) {
        
        //Imprimir los elementos con el metodo fidn all
         java.util.List<wsalmacen.Articulo> listart = findAll(); 
          for(wsalmacen.Articulo a:listart) {
              System.out.println("ISBN: " + a.getIsbn()+
                      "\n Nombre: " + a.getNombre()+
                      "\n Precio: " + a.getPrecio()+
                      "\n Stock: "+ a.getStock());
              if(!comprobarStock(a.getIsbn(), 5)){
                  System.out.println("No es posible realizar la orden ");
              }else{
                  System.out.println("Es posible realizar la orden");
              }  
          }
          
          
          System.out.println("\n \n ---------------- unidades que se piden son 5 -------Stock actualizado al comprobar stock---------------------");
          wsalmacen.Articulo articulo = find("0000000000001"); 
          System.out.println("ISBN: " + articulo.getIsbn()+
                      "\n Nombre: " + articulo.getNombre()+
                      "\n Precio: " + articulo.getPrecio()+
                      "\n Stock: "+ articulo.getStock());
              
          System.out.println("\n \n ----------------incrementa stock  en 5---------------------");
         updateStock("0000000000001",5,1);
           
          System.out.println("\n \n----------------Stock actualizado incrementar stock---------------------");
          wsalmacen.Articulo articulo1 = find("0000000000001"); 
          System.out.println("ISBN: " + articulo1.getIsbn()+
                      "\n Nombre: " + articulo1.getNombre()+
                      "\n Precio: " + articulo1.getPrecio()+
                      "\n Stock: "+ articulo1.getStock());
    }

    private static void create(wsalmacen.Articulo entity) {
        wsalmacen.WsAlmacen_Service service = new wsalmacen.WsAlmacen_Service();
        wsalmacen.WsAlmacen port = service.getWsAlmacenPort();
        port.create(entity);
    }

    private static java.util.List<wsalmacen.Articulo> findAll() {
        wsalmacen.WsAlmacen_Service service = new wsalmacen.WsAlmacen_Service();
        wsalmacen.WsAlmacen port = service.getWsAlmacenPort();
        return port.findAll();
    }

    private static Boolean comprobarStock(java.lang.String isbn, int unidades) {
        wsalmacen.WsAlmacen_Service service = new wsalmacen.WsAlmacen_Service();
        wsalmacen.WsAlmacen port = service.getWsAlmacenPort();
        return port.comprobarStock(isbn, unidades);
    }

    private static boolean updateStock(java.lang.String isbn, int unidades, int arg2) {
        wsalmacen.WsAlmacen_Service service = new wsalmacen.WsAlmacen_Service();
        wsalmacen.WsAlmacen port = service.getWsAlmacenPort();
        return port.updateStock(isbn, unidades, arg2);
    }

    private static Articulo find(java.lang.String id) {
        wsalmacen.WsAlmacen_Service service = new wsalmacen.WsAlmacen_Service();
        wsalmacen.WsAlmacen port = service.getWsAlmacenPort();
        return port.find(id);
    }


    
    
}
