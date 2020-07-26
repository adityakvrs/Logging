package com.epam.houseconstruction;
public class Construction {
	
	/**
         *
	 * @param material_type
	 * @param area
	 * @param automated
	 * @return estimated cost to build the house
	 *
	 */
	public double constructionCost(String material_type,double area,boolean automated) {
		if(material_type.equals("standard") && automated==false) {
			return 1200*area;
		}
		else if(material_type.equals("above standard") && automated==false) {
			return 1500*area;
		}
		else if(material_type.equals("high standard") && automated==false) {
			return 1800*area;
		}
		else {
			return 2500*area;
		}
	}
}