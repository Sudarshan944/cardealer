//CarBilling.java -- main method to be executed
import java.util.*;
public class CarBilling {
	public static void main(String[] args) {
		int c=0;
		Scanner sc =new Scanner(System.in);
		CarSupply supply =new CarSupply();
		supply.displayCarModels();
        System.out.print("Enter the car name: ");
        String carName = sc.nextLine();
        double chosencarPrice=supply.getCarByPrice(carName);
        double temp=chosencarPrice;
		System.out.print("Do you need Insurance:");
		char[] in = sc.next().toCharArray();
		System.out.print("Do you need Additional Accessories:");
		char[] add = sc.next().toCharArray();
		chosencarPrice+=11000;
		if(in[0]=='Y' || in[0]=='y') {
			chosencarPrice+=47300;
			c++;
		}
		if(add[0]=='Y' || add[0]=='y') {
			chosencarPrice+=15000;
			c++;
		}
		float dis;
		if(c>0) {
			System.out.print("Dealer discount:");
			String dd = sc.next();
			if (dd.contains("%")) {
			    String aprStr = dd.substring(0, dd.indexOf("%"));
			    dis=Float.parseFloat(aprStr);
			    dis=dis/100;
			    if ((dis*temp) >30000){
			    	System.out.println("Cannot apply more than 30000");
			    	chosencarPrice -=30000;
			    }else {
			    chosencarPrice-=(dis*temp);
			    }
			}else{ 
			    dis=Float.parseFloat(dd);
				if (dis >30000){
			    	System.out.println("Cannot apply more than 30000");
			    	chosencarPrice -=30000;
			    }else {
			    chosencarPrice-=dis;
			    }
			}
		}else{
			System.out.println("any one of the additional features has to be added");
			System.out.println("Dealer discount: 0");
		}chosencarPrice+=113990;
		System.out.println("Total Cost: "+(int)chosencarPrice);
	}
}
