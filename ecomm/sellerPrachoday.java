package ecomm;
import java.util.*;
import ecomm.Platform;

//import ecomm.Mobile;
//import ecomm.Book;


public class sellerPrachoday extends Seller 
{
    private ArrayList <Product> products = new ArrayList<>();  
    private ArrayList<Platform> platforms = new ArrayList<>();
    public sellerPrachoday(String id)
    {
        super(id);
        Mobile mob1 = new Mobile();
        mob1.setVals("VivoV28", "sellerP-Mobile1", 35000, 5);
        products.add(mob1);
        Book bo1 = new Book();
        bo1.setVals("Prabhas-theREBEL", "sellerP-Book1", 500, 5);
        products.add(bo1);
        Mobile mob2 = new Mobile();
        mob2.setVals("OppoReno", "sellerP-Mobile2", 25000, 5);
        products.add(mob2);
        Book bo2 = new Book();
        bo2.setVals("TheFrenchRevolution", "sellerP-Book2", 400, 5);
        products.add(bo2);
        Mobile mob3 = new Mobile();
        mob3.setVals("OneplusNord", "sellerP-Mobile3", 60000, 5);
        products.add(mob3);
        Book bo3 = new Book();
        bo3.setVals("WorldWar2", "sellerP-Book3", 650, 5);
        products.add(bo3);
        Mobile mob4 = new Mobile();
        mob4.setVals("SamsungS1FE", "sellerP-Mobile4", 75000, 5);
        products.add(mob4);
        Book bo4 = new Book();
        bo4.setVals("TheRenaissance", "sellerP-Book4", 700, 5);
        products.add(bo4);
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