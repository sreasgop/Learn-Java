// Question: Define an interface Animal with methods eat() and sleep(). Implement this interface in classes Dog and Cat, providing specific implementations for each method. Create objects of Dog and Cat and call their methods.
// Focus: Interface creation and implementation, achieving polymorphism through interfaces.

interface Animal{
    void eat();
    void sleep();
}

class Dog implements Animal{
    
    @Override
    public void eat(){
        System.out.println("Dog eats!");
    }
    
    @Override
    public void sleep(){
        System.out.println("Dot Sleeps!");
    }
}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat eats!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleeps!");
    }

}

public class Q07_Interface {
    public static void main(String[] args) {

        Animal aniObj1 = new Dog();
        aniObj1.eat();
        aniObj1.sleep();

        System.out.println();

        Animal aniObj2 = new Cat();
        aniObj2.eat();
        aniObj2.sleep();
    }
}