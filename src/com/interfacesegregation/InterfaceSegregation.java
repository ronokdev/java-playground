package com.interfacesegregation;

public class InterfaceSegregation
{
    public static void main(String[] args)
    {
        dragSomething(new TextBox());
        dragSomething(new DropDownMenu());
    }

    public static void dragSomething(UiWidget uiWidget){
       uiWidget.drag();
    }

}
