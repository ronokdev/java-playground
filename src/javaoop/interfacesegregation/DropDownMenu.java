package javaoop.interfacesegregation;

public class DropDownMenu implements UiWidget
{

    @Override
    public void drag()
    {
        System.out.println("DropDown Menu Dragging");
    }

    @Override
    public void reSize()
    {
    }
}
