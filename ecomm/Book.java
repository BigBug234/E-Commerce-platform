package ecomm;

public class Book extends Product {

    public void setVals (String nm,String id,int p,int q)
    {
        book_name=nm;
        bookID=id;
        bprice=p;
        bquantity=q;
    }

    public Globals.Category getCategory()
    {
        return Globals.Category.values()[0];
    }
	public  String getName()
    {
        return book_name;
    }
	public String getProductID()
    {
        return bookID;
    }
	public float getPrice()
    {
        return bprice;
    }
	public int getQuantity()
    {
        return bquantity;
    }
    public void decQuantity(int x)
    {
        bquantity-=x;
    }

    private String book_name,bookID;
    private int bprice,bquantity; 
}
