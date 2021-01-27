package com.interfacing;

public class TaxCalculator implements Calculatable
{
    private double taxableIncome;

    public TaxCalculator(double taxableIncome)
    {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax()
    {
        return taxableIncome * 0.3; //30% Tax
    }
}
