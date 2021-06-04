public class ProyectoFinal {
    
    public static void main(String[] args){

        System.out.println("Bienvenidos a CornerStore" +
        "1.Usted prodrá consultar nuestro catálogo de productos" +
        "2.Añadir productos al carrito" +
        "3.Gestionar su compra" +
        "---Para continuar presione enter---");

        boolean siguiente = true;
        int selecProduc, selecCant, selecCosto;

        Item1 = new LibrosInfantiles("Fábulas", 5.99,10, true, "Fantásticos" );
        Item2 = new LibrosRomanticos("Crepúsculo" + 6.99,10, true, "Orgullo y Perjuicio");
        Item3 = new LibrosEducativos("Matemáticas Iniciales" + 12.99,10, true, "Escritura Inicial");
        Item4 = new LibrosInfantiles(5,99);
        Item5 = new LibrosRomanticos($6,99);
        Item6 = new LibrosEducativos($12,99);

      Producto catalogo[] = new Producto[Producto.dimensionArray];
      Gestion gestion = new Gestion();

      catalogo[0] = Item1;
      catalogo[1] = Item2;
      catalogo[2] = Item3;
      catalogo[3] = Item4;
      catalogo[4] = Item5;
      catalogo[5] = Item6;
        
    do {
      System.out.println("Seleccione la opción a realizar" 
      + "Opcion 1 - Mostrar catalogo"
      + "Opcion 2 - Seleccionar productos del catalogo"
      + "Opcion 3 - Mostrar carrito de compras"
      + "Opcion 4 - Modificar carrito de compras"
      + "Opcion 5 - Salir");

      switch (leer.datoInt()){
        case 1:
          gestion.mostrarCatalogo(catalogo);
          break;

        case 2:
          System.out.println("Que producto desea comprar?");
          gestion.mostrarProductos(catalogo);
          selecProduc = leer.datoInt();
          System.out.println("Cantidad de articulos a comprar?"); 
          selecCant = leer.datoInt();
          gestion.comprarProducto(catalogo, selecProduc, selecCant);
          break;
        
        case 3:
          System.out.println(gestion.mostrarCarrito() + "$");
          break;
        
        default:

        continuar = false;
          
      }
    }while(continuar);

    System.out.println("---- Gracias por comprar en CornerStore ----");  



    }
}
public class Gestion{
  public Producto productos[] = null;
  public double carrito;

  public Gestion(){}
  public Gestion(Producto[] productos){
    this.productos = productos;
  }
  public Producto[] cargarProducto(){
    return productos;    
  }
  public void mostrarCatalogo(Producto[] producto){
    for(int i = o;i<productos.length;i++){
      System.out.print(Producto[i]);

    }
  
  }
  public void mostrarProductos(Producto[] producto){
    for(int i = 0; i<productos.length; i++){
      System.out.print(i+1 + " " + Producto[i].getNombre());
    }
    System.out.println("--")
  }
  public double comprarProducto(Producto[] productos, int num, int cantidadUnidades) {
    if (productos[num-1].isDisponible()) {
      if (productos[num-1].getCantStock() >= cantidadUnidades){
        System.out.println("La compra se ha realizado con éxito!!n");
        productos[num -1].setCantStock(productos[num -1].getCantStock()-cantidadUnidades);
        return caja+=cantidadUnidades*productos[num-1].getPrecioUnit();
      } else {System.out.println("No hay cantidad suficiente de producto");}
    } else {System.out.println("No hay cantidad suficiente de producto");}
    return caja;
      



    }
}
