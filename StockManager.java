import java.util.ArrayList;

/**
 * Manage the stock in a business.                        //Administrar las acciones en una empresa.
 * The stock is described by zero or more Products.       //La acción es descrita por cero o más productos
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.             //Añadir un producto a la lista.
     * @param item The item to be added.      //El elemento que se añade
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.                  //Recibir una entrega de un producto particular.
     * Increase the quantity of the product by the given amount.    //Aumentar la cantidad de producto por la cantidad dada
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.       
     */
    public void delivery(int id, int amount)
    {
    }

    /**
     * Try to find a product in the stock with the given id.          //Trate de encontrar un producto en la acción con el id indicado.
     * @return The identified product, or null if there is none       //El producto identificado, o null si no hay ninguno
          * with a matching ID.                                                           // Con un ID coincidente.
     */
    public Product findProduct(int id)
    {
        Product buscado = null;

        for (Product producto : stock)
        {
            if (id == producto.getID())
            {
                buscado = producto;

            }

        }
        return buscado;
    }

    /**
     * Locate a product with the given ID, and return how     //Busque un producto con el ID dado, y devolver cuántos de este artículo están en stock
     * many of this item are in stock. If the ID does not     //Si la identificación no coincide con ningún producto, devolver cero.
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.    //La cantidad del producto dada en stock
     */
    public int numberInStock(int id)
    {
        int cantidad = 0;

        for (Product producto : stock)
        {
            if (id == producto.getID())
            {
                cantidad = producto.getQuantity();
            }            
        }
        return cantidad;
    }
    /**
     * Print details of all the products.       //Imprimir detalles de todos los productos.
     */
    public void printProductDetails()
    {
        for (Product producto : stock)
        {
            System.out.println("Detalles de los productos: " + producto.toString());
        }
    }
}
