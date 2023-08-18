public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan = new Sedan(120, 20000, "Red", 25);
		Ford ford1 = new Ford(140, 25000, "Blue", 2021, 2000);
		Ford ford2 = new Ford(160, 30000, "Green", 2020, 1500);
		Car car = new Car(100, 15000, "White");

		System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
		System.out.println("Ford1 Sale Price: $" + ford1.getSalePrice());
		System.out.println("Ford2 Sale Price: $" + ford2.getSalePrice());
		System.out.println("Car Sale Price: $" + car.getSalePrice());
	}
}
