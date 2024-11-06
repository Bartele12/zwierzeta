interface animal{
    public void sound();
    public void sleep();
}
class Dog implements animal{

    public void sound() {
        System.out.println("Woof Woof!");
    }

    public void sleep() {
        System.out.println("Sleeps");
    }
}
class Cat implements animal{

    public void sound() {
        System.out.println("Meow Mewo!");
    }

    public void sleep() {
        System.out.println("Sleeps");
    }
}
class application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();


    }
}