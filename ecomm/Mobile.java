package ecomm;

public class Mobile extends Product {

    public void setVals (String nm,String id,int p,int q)
    {
        mob_name=nm;
        mobID=id;
        mprice=p;
        mquantity=q;
    }

    public Globals.Category getCategory()
    {
        return Globals.Category.values()[1];
    }
	public  String getName()
    {
        return mob_name;
    }
	public String getProductID()
    {
        return mobID;
    }
	public float getPrice()
    {
        return mprice;
    }
	public int getQuantity()
    {
        return mquantity;
    }
    public void decQuantity(int x)
    {
        mquantity-=x;
    }

    private String mob_name,mobID;
    private int mprice,mquantity; 
}
