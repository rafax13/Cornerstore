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

      



    }
}