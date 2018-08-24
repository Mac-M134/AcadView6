class mane{
	public static void main(String args[]){
		Animal a=new Animal();
		a.speak();
		Dog d=new Dog();
		d.speak();
		Cat c=new Cat();
		c.speak();
		
	}
}
class Animal{
	String breed,color;
	
	public void speak(){
		System.out.print("Animal Sound\n");

	}
}
class Dog extends Animal{
	String breed,color;
	public void speak(){
		System.out.print("Bow Bow\n");
	}
}
class Cat extends Animal{
	String sound;
	public void speak()
	{
		System.out.print("Meow Meow ");
	}
}

		

