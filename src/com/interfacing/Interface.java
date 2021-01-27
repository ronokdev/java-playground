package com.interfacing;

public class Interface
{
    public static void main(String[] args)
    {

        TaxCalculator taxCalculator = new TaxCalculator(10_000);
        TaxReport taxReport = new TaxReport(taxCalculator); // Injecting dependency Via constructor , also known as poor mens dependency Injection.

        taxReport.showReport();
    }
}
