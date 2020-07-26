package com.epam.interest;
import java.lang.Math;
class Interest {
    /**
     *
	 * @param principal_amount
	 * @param rate_of_interest
	 * @param time_period
	 * @return simpleInterest
	 *
	 */
	 public double calculateSimpleInterest(double principal_amount,double rate_of_interest,double time_period)
	{
		return (principal_amount*rate_of_interest*time_period)/100;
	}

   /**
     *
	 * @param principal_amount
	 * @param rate_of_intrest
	 * @param time_period
	 * @return compoundInterset
	 *
	 */
	  public double calculateCompoundInterest(double principal_amount,double rate_of_interest,double time_period)
 {
	 return (principal_amount * Math.pow(1.0+rate_of_interest/100.0,time_period) - principal_amount);
 }
}