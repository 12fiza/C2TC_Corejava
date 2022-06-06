package Projects;

class Animal {
}

// subclass
class Dog extends Animal {
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog d1 = new Dog();

    // checks if d1 is an instance of the subclass
    System.out.println(d1 instanceof Dog);        // prints true

    // checks if d1 is an instance of the superclass
    System.out.println(d1 instanceof Animal);     // prints true
  }
}
/*class Dog implements Animal {
}

class Main {
  public static void main(String[] args) {

    // create an object of the Dog class
    Dog d1 = new Dog();

    // checks if the object of Dog
    // is also an instance of Animal
    System.out.println(d1 instanceof Animal);  // returns true
  }
}*/


