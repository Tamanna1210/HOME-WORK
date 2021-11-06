package NewHomeWork;

public class Dog {
	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  
	 * with specific  attributes and behaviors.
	 */

		String lifeSpan,colors,breed,origin,temperament,hight,weight;
		
		void pullSled(){
			System.out.println(breed+"s are bred to pull sleds.");
		}
		void active() {
			System.out.println(breed+"s are very active.");

		}
		void playFull(){
			System.out.println(breed+ "s are very play full they like to play fetch.");
			
		}
		
		public static void main(String[] args) {
			Dog husky= new Dog();
			husky.lifeSpan="12 – 15 years";
			husky.colors="White, Black, Gray & White, Sable & White, Black & Tan,"
					+ "Silver-gray, Black & White, Grey, Red & White";
			husky.breed="Siberian Husky";
			husky.origin="Siberia";
			husky.temperament="Intelligent, Outgoing, Friendly, Alert and Gentle";
			husky.hight=" Female: 20–22 inches (50–56 cm), Male: 21–24 inches (54–60 cm)";
			husky.weight="Female: 35–51 lbs (16–23 kg), Male: 44–60 lbs (20–27 kg)";
			
			System.out.println("Infomation about "+ husky.breed);
			System.out.println("The life span of a "+ husky.breed+ " is " +husky.lifeSpan+".");
			System.out.println("The origin is "+husky.origin+".");
			System.out.println(husky.breed+ " comes in variety of colors"+":" +husky.colors+".");

			System.out.println(husky.breed+"s"+ " are " +husky.temperament+".");
			System.out.println("The hight of a "+ husky.breed+ ":" +husky.hight+".");
			System.out.println("The weight of a "+ husky.breed+ ":" +husky.weight+".");
			 husky.pullSled();
			 husky.active();
			 husky.playFull();
			 System.out.println("****************************************************");




			
		}
		
}
