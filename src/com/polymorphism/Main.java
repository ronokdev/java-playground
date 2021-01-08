package com.polymorphism;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        UiControl[] uiControls = {new TickBox(), new RadioButton()};


        for(UiControl control : uiControls)
        {
            control.render();
        }

        UiControl con = new TickBox();
        con.render();




    }
}
