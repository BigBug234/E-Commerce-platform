package demo;
import ecomm.Globals;
import ecomm.Globals.Category;
import ecomm.Platform;
import ecomm.Seller;
import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import ecomm.Product;


public class DemoPlatform extends Platform {
	ArrayList<Seller> sellers=new ArrayList<>();

	@Override
	public boolean addSeller(Seller aSeller) {
		// TODO Auto-generated method stub
		sellers.add(aSeller);
		return false;
	}

	@Override
	public void processRequests() {
		// TODO Auto-generated method stub

	
		try {
		BufferedReader br= new BufferedReader(new FileReader("C:/Users/CHARAN SRI SAI/Downloads/ecomm v1.1/demo/PortalToPlatform.txt"));
		BufferedWriter bw =new BufferedWriter(new FileWriter("C:/Users/CHARAN SRI SAI/Downloads/ecomm v1.1/demo/PlatformToPortal.txt"));
		PrintWriter writer = new PrintWriter("C:/Users/CHARAN SRI SAI/Downloads/ecomm v1.1/demo/PlatformToPortal.txt");
		writer.print("");
		
		String st;

		while((st = br.readLine())!=null)
		{

			String sea[]=st.split(" ");

			if(sea[2].equals("Start"))
			{
			
				int mq=0,bq=0;	
				ArrayList<Product> prod1 = new ArrayList<>();
				ArrayList<Product> prod2 = new ArrayList<>();
				for(Seller sel:sellers)
				{
					prod1=sel.findProducts(Globals.Category.values()[0]);
					prod2=sel.findProducts(Globals.Category.values()[1]);
					for(Product p:prod1)
					{
						if(p.getQuantity()>0)
						bq++;
					}
					for(Product p1:prod2)
					{
						if(p1.getQuantity()>0)
						mq++;
					}
					

				}
				if(bq>0&&mq>0)
					{
						bw.write(sea[0]+" "+sea[1]+" "+"Book"+" "+"Mobile"+"\n");
					}
					else if(bq>0)
					{
						bw.write(sea[0]+" "+sea[1]+" "+"Book"+" "+"\n");
					}
					else if(mq>0)
					{
						bw.write(sea[0]+" "+sea[1]+" "+"Mobile"+"\n");
					}
					else 
					{
						bw.write(sea[0]+" "+sea[1]+"No"+"\n");
					}
			//	bw.write(sea[0]+" "+sea[1]+" "+"Book"+" "+"Mobile"+"\n");
				

			}
			else if(sea[2].equals("List"))
			{
			
				
				ArrayList<Product> products = new ArrayList<>();
				
				for(Seller is: sellers)
				{
					if(sea[3].equals("Book"))
					products= is.findProducts(Globals.Category.values()[0]);
					else
					products= is.findProducts(Globals.Category.values()[1]);
					for(Product it: products)
					{
						
							bw.write(sea[0]+" "+sea[1]+" "+it.getName()+" "+it.getProductID()+" "+it.getPrice()+" "+it.getQuantity()+"\n");
					
					}
				}
				
			}
			else if(sea[2].equals("Buy"))
			{
				boolean var=true;
		
				for (Seller sel:sellers)
				{
		
					
							
							if(sel.buyProduct(sea[3],Integer.parseInt(sea[4])))
							{
								bw.write(sea[0]+" "+sea[1]+" "+"Success"+"\n");
								var=false;
							}
							

				}
				if(var==true)
				bw.write(sea[0]+" "+sea[1]+" "+"Failure"+"\n");
				

		}
		
		}
		bw.close();
		br.close();
		writer.close();
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	

	}

}
