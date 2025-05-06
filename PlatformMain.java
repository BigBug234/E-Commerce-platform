import demo.DemoPlatform;
import ecomm.Platform;
import ecomm.Seller;
import ecomm.sellerCharan;
import ecomm.sellerJack;
import ecomm.sellerPrachoday;

import java.util.*;
public class PlatformMain {

	public static void main(String[] args) {

		Platform pf = new DemoPlatform();  // replace with appropriate derived class
		
		// create a number of sellers (of different sub-types of Seller)
		// Assign a name (sellerID) to each of them.
		
		// replace each of the XYZ below with the derived class name of one of the
		// team members.
		
		
		Seller s1 = new sellerCharan("SellerCh"); 
		s1.addPlatform(pf);
		pf.addSeller(s1);
		Seller s2=new sellerJack("SellerJ");
		s2.addPlatform(pf);
		pf.addSeller(s2);
		Seller s3= new sellerPrachoday("SellerP");
		s3.addPlatform(pf);
		pf.addSeller(s3);
		/* 		

		Seller s2 = new SellerXYZ("Seller2");
		s1.addPlatform(pf);
		
		Seller s3 = new SellerXYZ2("Seller3");
		s1.addPlatform(pf);
 		*/
		
		
		// keep reading from System.in
		// If "Check" typed in
		// invoke
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String stc=sc.nextLine();
			if(stc.equals("Check"))
			pf.processRequests();
			if(stc.equals("End"))
			break;

		}
				
			
	}

}
