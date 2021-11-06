package NewHomeWork;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Google Pixel, Nokia
	 * with specific attributes and behaviors.
	 */
	String name, color, model, operatingSystem;
	int storage;
	double price;

	void makeCall() {
		System.out.println(name + " " + model + " can make outgoing and receive incomeing call. ");
	}

	void takesPic() {
		System.out.println(name + " " + model + " can take selfies and can also take regular pictures. ");
	}

	void playGame() {
		System.out.println(name + " " + model + " has diffirent types of game to choose from.");
	}

	void fingerPrint() {
		System.out.println(name + " " + model + " has finger print lock.");
	}

	public static void main(String[] args) {
		Phone iphone = new Phone();
		iphone.name = "Apple";
		iphone.model = "iphone 13 pro max";
		iphone.color = "Sierra Blue";
		iphone.operatingSystem = "iOS 15";
		iphone.storage = 128;
		iphone.price = 1099.99;

		System.out.println("You have an " + iphone.name + " " + iphone.model);
		System.out.println("The color of your " + iphone.name + " " + iphone.model + " is " + iphone.color);
		System.out.println(
				"The operating System of your " + iphone.name + " " + iphone.model + " is " + iphone.operatingSystem);
		System.out.println("The storage and price of your " + iphone.name + " " + iphone.model + ": storage "
				+ iphone.storage + " Price is $" + iphone.price);
		iphone.makeCall();
		iphone.takesPic();
		iphone.playGame();

		System.out.println("**********************************************************************");

		Phone googlePixel = new Phone();
		googlePixel.name = "Google pixel";
		googlePixel.model = "6 pro";
		googlePixel.color = "Stormy Black";
		googlePixel.operatingSystem = "Android 12";
		googlePixel.storage = 128;
		googlePixel.price = 899.99;

		System.out.println("You have a " + googlePixel.name + " " + googlePixel.model);
		System.out.println(
				"The color of your " + googlePixel.name + " " + googlePixel.model + " is " + googlePixel.color);
		System.out.println("The operating System of your " + googlePixel.name + " " + googlePixel.model + " is "
				+ googlePixel.operatingSystem);
		System.out.println("The storage and price of your " + googlePixel.name + " " + googlePixel.model + ": storage "
				+ googlePixel.storage + " Price is $" + googlePixel.price);
		googlePixel.makeCall();
		googlePixel.takesPic();
		googlePixel.playGame();
		googlePixel.fingerPrint();

		System.out.println("**********************************************************************");

		Phone nokia = new Phone();
		nokia.name = " Nokia";
		nokia.model = "G300";
		nokia.color = "Meteor Grey";
		nokia.operatingSystem = "Android 11";
		nokia.storage = 64;
		nokia.price = 199;
		System.out.println("You have a " + nokia.name + " " + nokia.model);
		System.out.println("The color of your " + nokia.name + " " + nokia.model + " is " + nokia.color);
		System.out.println(
				"The operating System of your " + nokia.name + " " + nokia.model + " is " + nokia.operatingSystem);
		System.out.println("The storage and price of your " + nokia.name + " " + nokia.model + ": storage "
				+ nokia.storage + " Price is $" + nokia.price);
		googlePixel.makeCall();
		googlePixel.takesPic();
		googlePixel.playGame();
		googlePixel.fingerPrint();

	}
}
