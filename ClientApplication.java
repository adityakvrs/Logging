import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientApplication {
    
	public static void main(String[] args) {
	    	final Logger logger = LogManager.getLogger(ClientApplication.class);
	    	String material;
	    	double square_feet;
	    	boolean automate;
	    	Construction c = new Construction();
		Scanner input=new Scanner(System.in);
		logger.info("Enter material type required");
		material=input.next();
		logger.info("Enter the square-feet");
		square_feet=input.nextDouble();
		logger.info("Enter you want automated or not");
		automate=input.nextBoolean();
		if(automate==false) {
	
		double total_cost = c.constructionCost(material,square_feet,automate);
		logger.info(total_cost);
		
		}
		
		else {
		    //Calculate cost using high standard material and fully automated
			double total_cost= c.constructionCost(material, square_feet,automate);
			logger.info(total_cost);
		}
		
		
	}

}
        
         
     
