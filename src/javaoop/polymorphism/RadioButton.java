package javaoop.polymorphism;

public class RadioButton extends UiControl
{
    @Override
    /*
    * overriding the render method from the base class (UiControl)
    * */
    public void render()
    {
        System.out.println("Radio Button Rendering");
    }
}
