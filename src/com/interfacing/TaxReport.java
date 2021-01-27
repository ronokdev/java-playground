package com.interfacing;

public class TaxReport
{

    public Calculatable taxCalculator;

    public TaxReport(Calculatable taxCalculator)
    {
        this.taxCalculator = taxCalculator;
    }

    public void showReport()
    {
        System.out.println(taxCalculator.calculateTax());
    }

    public void setTaxCalculator(Calculatable taxCalculator)
    {
        this.taxCalculator = taxCalculator;
    }
}
