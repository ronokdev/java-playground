package com.upcastingdowncasting;

public class UpcastingDownCasting
{
    public static void main(String[] args)
    {
        UiControl uiControl = new UiControl();
        downCasting((TextBox) uiControl); //This type of downcasting does not make sense to java. So java Throws an Error

        TextBox textBox = new TextBox();
        upCasting(textBox);
    }

    public static void upCasting(UiControl uiControl)
    {
        System.out.println(uiControl);
    }

    public static void downCasting(TextBox textBox)
    {
        System.out.println(textBox);
    }
}
