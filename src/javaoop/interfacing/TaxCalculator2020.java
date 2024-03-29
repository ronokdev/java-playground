package javaoop.interfacing;

public class TaxCalculator2020 implements Calculatable

{
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome)
    {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax()
    {
        return taxableIncome * 0.3; //30% Tax
    }
}
