package javaoop.polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        /*
        * we are inserting different types of object in the uiControls Array
        * And when iterating in the for loop, the 'control' object is dealing with different types of UiControl Object
        * and each of object has their OWN 'render' method. like RadioButton has it's own render method.
        *
        * As, we have Created a base class UiControl with an abstract method render
        * And we overridden the render method in the RadioButton subclass and TickBox subclass
        * so we are using the 'method override' to achieve polymorphism in this case
        * */

        UiControl[] uiControls = {new TickBox(), new RadioButton(), new TickBox()};
        for(UiControl control : uiControls)
            control.render();
    }
}
