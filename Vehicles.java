// car class
class Car {
	int speed;
	double regularPrice;
	String color;

	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	double getSalePrice() {
		return regularPrice;
	}
}

// truck subclass
class Truck extends Car {
	int weight;

	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	double getSalePrice() {
		return weight > 2000 ? regularPrice * 0.9 : regularPrice * 0.8;
	}
}

// ford subclass
class Ford extends Car {
	int year;
	int manufacturerDiscount;

	Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}
}

// sedan subclass
class Sedan extends Car {
	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	double getSalePrice() {
		return length > 20 ? regularPrice * 0.95 : regularPrice * 0.9;
	}
}
