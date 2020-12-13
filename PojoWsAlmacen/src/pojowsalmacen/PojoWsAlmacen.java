/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojowsalmacen;

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
    
    
}
