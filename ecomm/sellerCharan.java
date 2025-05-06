package ecomm;
import java.util.*;
import ecomm.Platform;

//import ecomm.Mobile;
//import ecomm.Book;


public class sellerCharan extends Seller  {

    private ArrayList <Product> products = new ArrayList<>();
    private ArrayList<Platform> platforms = new ArrayList<>();
    public sellerCharan(String id)
    {
        super(id);
        Mobile m1 = new Mobile();
        m1.setVals("miNote10s","sellerCh-Mobile1",100000,5);
        products.add(m1);
        Book b1 = new Book();
        b1.setVals("Book1","sellerCh-Book1",200,5);
        products.add(b1);
        Mobile m2 = new Mobile();
        m1.setVals("Samsung", "sellerCh-Mobile2", 70000, 6);
        products.add(m1);
        Book b2 = new Book();
        b1.setVals("Veerasimhareddy", "sellerCh-Book2", 650, 5);
        products.add(b1);
        Mobile m3 = new Mobile();
        m2.setVals("Nokia", "sellerCh-Mobile3", 10000, 3);
        products.add(m2);
        Book b3 = new Book();
        b2.setVals("HarryPorter", "sellerCh-Book3", 450, 6);
        products.add(b2);
        Mobile m4 = new Mobile();
        m3.setVals("Realme", "sellerCh-Mobile4", 15000, 7);
        products.add(m3);
        Book b4 = new Book();
        b3.setVals("RichDadPoorDad", "sellerCh-Book4", 850, 9);
        products.add(b3);
        Mobile m5 = new Mobile();
        m4.setVals("PocoM3", "sellerCh-Mobile5", 18000, 5);
        products.add(m4);
        Book b5 = new Book();
        b4.setVals("Encyclopedia", "sellerCh-Book5", 350, 5);
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
