package com.interfacing;

public class TaxReport
{
    public void showReport(Calculatable taxCalculator)
    {
        System.out.println(taxCalculator.calculateTax());
    }
}
