package chapter12;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("ÀÌ¼ø½Å", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("±èÀ¯½Å", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("È«±æµ¿", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
