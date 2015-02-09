/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael KÃ¶lling.
 * @version 2011.07.31
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +
               name +
               " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.              //Reabastecer con la cantidad dada de este producto.
     * The current quantity is incremented by the given amount.    //La cantidad  se incrementa en la cantidad dada.
     * @param amount The number of new items added to the stock.   //cantidad  de nuevos elementos añadidos al stock.
     *               This must be greater than zero.               //Esto debe ser mayor que cero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) {
            quantity += amount;
        }
        else {
            System.out.println("Attempt to restock " +
                               name +
                               " with a non-positive amount: " +
                               amount);
        }
    }

    /**
     * Sell one of these products.                                 //Vender uno de estos productos.
     * An error is reported if there appears to be no stock.      //Se ha informado de un error si no parece haber ninguna acción
     */
    public void sellOne()
    {
        if(quantity > 0) {
            quantity--;
        }
        else {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
}
