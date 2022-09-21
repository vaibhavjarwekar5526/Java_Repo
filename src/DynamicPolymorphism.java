class Vegetable {

    void eat()
    {
        System.out.println("Eating Vegetables are good for our health");
    }
}

class LadyFinger extends Vegetable
{
    void eat(){
        System.out.println("But I don't like to eat Ladyfinger");
    }
}


public class DynamicPolymorphism {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        vegetable.eat();
    }
}
