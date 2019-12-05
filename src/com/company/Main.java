package com.company;

public class Main {

    public static void main(String[] args) {
        Baked bread = new Bread();
        Drawn Circle = new Circle();
        System.out.println(bread);
            }
        }
    }
}
public interface Baked{
    public void bake(){}
}
public interface Drawn {
    void draw (){ }
}
class Bread implements Baked{
    @Override
    public void bake() {
        System.out.println("bake");
    }
}
class Circle implements Drawn{
    @Override
    public void draw() {
        System.out.println("draw");
    }
}
