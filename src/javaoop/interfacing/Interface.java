package javaoop.interfacing;

public class Interface
{
    public static void main(String[] args)
    {
        TaxCalculator2020 taxCalculator = new TaxCalculator2020(10_000);

        TaxReport taxReport = new TaxReport();

        taxReport.showReport(taxCalculator); // injecting dependency via Method Injection
        taxReport.showReport(new TaxCalculator2021(10_000)); // // injecting dependency via Method Injection


    }
}
