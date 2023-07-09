public class CarSupply {
	Car [] cars;
	public CarSupply() {
		cars=new Car[]{
			new Car("Polo Trendline",870000),
			new Car("Polo Highline",1009000),
			new Car("Virtus Trendline",1105000),
			new Car("Virtus Highline",1308000),
			new Car("Taigun Trendline",1489000),
			new Car("Taigun Highline",1542000),
			new Car("Taigun Topline",1771000)

		};
	}
	public void displayCarModels() {
		System.out.println("Select car model:");
		System.out.println("Available Car Models are :");
		for(int i=0;i<cars.length;i++) {
			System.out.println((i+1)+"."+cars[i].name);
		}
	}
	public double getCarByPrice(String carName) {
		for (Car car : cars) {
		    if (car.getCarName().equals(carName)) {
		        double price = car.getPrice();
		        return price;
		    }
		}
		System.out.println("Invalid Car");
		System.exit(0);
		return 0;
	}
}
