package javaoop.interfacesegregation;

public class TextBox implements UiWidget
{
    @Override
    public void reSize()
    {
        System.out.println("TextBox Resizing");
    }

    @Override
    public void drag()
    {
        System.out.println("TextBox Draggingg");
    }
}
