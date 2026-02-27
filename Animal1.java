package oop;

public interface Animal1 {
	void sound();
	void run();
}
class Cat implements Animal1{
	@Override
	public void sound(){
		System.out.println("Dogs Bark");
	}
	@Override
	public void run() {
		System.out.println("Dogs runs fast");
	}

}
class Demo {
	public static void main (String[]args) {
	Cat cat = new Cat();
	Dog dog = new Dog();
	cat.run();
	cat.sound();
	dog.run();
	dog.sound();
}
}
