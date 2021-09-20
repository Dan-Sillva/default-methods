package services;

public class USATaxService implements InterestService {

    // interestRate : 0% - 100%
    private double interestRate = 1;

    public USATaxService() {}

    @Override
    public double getInterestRate() {
        return this.interestRate;
    }

}
