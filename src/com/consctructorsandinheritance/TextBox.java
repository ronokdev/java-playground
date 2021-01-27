package com.consctructorsandinheritance;

public class TextBox extends  UiControl
{
    public TextBox()
    {
        super(true); // the constructor of the base class (UiControl) is called by using super
        System.out.println("TextBox's constructor called");
    }

    @Override
    public void boxArea()
    {
        System.out.println("Box area Of TextBox");
    }
}
