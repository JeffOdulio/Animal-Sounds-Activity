import java.util.Scanner;

public class RunAnimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert B for Bird");
		System.out.println("Insert C for Cat");
		System.out.println("Insert D for Dog");
		System.out.print("Pick an animal: ");
		String chc = sc.nextLine();
		
		if (chc.equalsIgnoreCase("B")){
			Bird birb = new Bird();
			
			birb.eat();
			birb.sleep();
			birb.makeSound();

		}
		
		else if(chc.equalsIgnoreCase("C")){
			Cat catto = new Cat();

			catto.eat();
			catto.sleep();
			catto.makeSound();
		}
		else if(chc.equalsIgnoreCase("D")){
			Dog doggo = new Dog();
			
			doggo.eat();
			doggo.sleep();
			doggo.makeSound();
		}
		else{
			System.out.println("No such animal from the options.");
		}
		sc.close();
	}
}