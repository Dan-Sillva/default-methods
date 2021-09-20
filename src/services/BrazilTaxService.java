package services;

public class BrazilTaxService implements InterestService{

    // interestRate : 0% - 100%
    private double interestRate = 2;

    public BrazilTaxService() {}

    @Override
    public double getInterestRate() {
        return this.interestRate;
    }

}
