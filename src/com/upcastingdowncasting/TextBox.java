package com.upcastingdowncasting;


public class TextBox extends UiControl
{
    @Override
    public String toString()
    {
        return "This is TextBox's To String";
    }

    @Override
   public void textField()
   {
       System.out.println("This is textField from TextBox");
   }



}
