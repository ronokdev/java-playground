package com.interfacing;

public class TaxReport
{
    public TaxCalculator taxCalculator;

    public TaxReport()
    {
        taxCalculator = new TaxCalculator(10_000);
    }

    public void showReport()
    {
        System.out.println(taxCalculator.calculateTax());
    }
}
