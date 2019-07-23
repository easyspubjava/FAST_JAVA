package chapter5.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);

	}
}
