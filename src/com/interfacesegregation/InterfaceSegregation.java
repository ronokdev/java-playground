package com.interfacesegregation;

public class InterfaceSegregation
{
    public static void main(String[] args)
    {
        TextBox textBox = new TextBox();
        textBox.drag();

        DropDownMenu dropDownMenu = new DropDownMenu();
        dropDownMenu.drag();
    }
}
