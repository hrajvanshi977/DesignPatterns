package DecoratorDesignPattern;

import DecoratorDesignPattern.BaseObj.BasePizza;
import DecoratorDesignPattern.BaseObj.Margherita;
import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new Mushroom(new ExtraCheese(new Margherita())));
        System.out.println(basePizza.cost());
    }
}
