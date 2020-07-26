import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestClientApplication {
    public static void main(String args[]){
        final Logger logger = LogManager.getLogger(ClientApplication.class);
        Scanner sc=new Scanner(System.in);
        Interest i=new Interest();
        logger.info("Enter S for simple interest or C for compound interest");
        switch (sc.next()){
            case "S":
		//calculate simple interest
                logger.info("Enter PrincipalAmount,Duration in Years,Rate of Interest");
                logger.info(i.calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;

            case "C":
		//calculate compound interest
                logger.info("Enter PrincipalAmount,Duration in Years,Rate of Interest");
                logger.info(i.calculateCompoundInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;

            default:
                System.err.println("Wrong Choice");

            


        }
    }
}