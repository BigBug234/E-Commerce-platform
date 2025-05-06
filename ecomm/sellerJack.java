package ecomm;
import java.util.*;
import ecomm.Platform;

import ecomm.Mobile;
import ecomm.Book;


public class sellerJack extends Seller 
{
    private ArrayList <Product> products = new ArrayList<>();
    private ArrayList<Platform> platforms = new ArrayList<>();
    public sellerJack(String id)
    {
        super(id);
        Mobile m1 = new Mobile();   //creating product objects
        m1.setVals("Iphone14", "sellerJ-Mobile1", 80000, 5);
        products.add(m1);
        Book b1 = new Book();
        b1.setVals("Balayya-theLEGEND", "sellerJ-Book1", 600, 5);
        products.add(b1);
        Mobile m2 = new Mobile();
        m2.setVals("Iphone14plus", "sellerJ-Mobile2", 100000, 5);
        products.add(m2);
        Book b2 = new Book();
        b2.setVals("Wingsoffire", "sellerJ-Book2", 350, 5);
        products.add(b2);
        Mobile m3 = new Mobile();
        m3.setVals("Iphone14pro", "sellerJ-Mobile3", 150000, 5);
        products.add(m3);
        Book b3 = new Book();
        b3.setVals("MeinKampf", "sellerJ-Book3", 750, 5);
        products.add(b3);
        Mobile m4 = new Mobile();
        m4.setVals("Iphone14promax", "sellerJ-Mobile4", 180000, 5);
        products.add(m4);
        Book b4 = new Book();
        b4.setVals("Psychologyofmoney", "sellerJ-Book4", 450, 5);
        products.add(b4);
    }
    public void addPlatform(Platform thePlatform)
    {
        platforms.add(thePlatform);
    }
    public ArrayList<Product> findProducts(Globals.Category whichOne)
    {
        ArrayList<Product> foundproducts=new ArrayList<Product>();
        for(int i=0;i<products.size();i++)
        {
           
            if(products.get(i).getCategory().equals(whichOne))
            foundproducts.add(products.get(i));
        }
        return foundproducts;
    }
    public boolean buyProduct(String productID, int quantity)
    {

        for (int i=0; i<products.size();i++)
        {
            if(products.get(i).getProductID().equals(productID))
            {
                
                if( quantity <= products.get(i).getQuantity()) 
                {
                    products.get(i).decQuantity(quantity);
                    return true;
                }
            }

        }
        return false;
    }    
}