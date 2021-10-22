package javaoop.consctructorsandinheritance;

public class UiControl
{
    private boolean isEnable;

    public UiControl(boolean isEnable)
    {
        this.isEnable = isEnable;
        System.out.println("UiControl's constructor called");
    }

    public void boxArea()
    {
        System.out.println("Box area Of UiControl");
    }
}
