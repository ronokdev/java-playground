package com.interfacing;

public class Interface
{
    public static void main(String[] args)
    {

        TaxCalculator2020 taxCalculator = new TaxCalculator2020(10_000);
        TaxReport taxReport = new TaxReport(taxCalculator); // Injecting dependency Via constructor , also known as poor mens dependency Injection.

        taxReport.showReport();
    }
}
