package services;

public interface InterestService {

    double getInterestRate();

    default double payment (double amount, int months) {
        if (months < 1){
            throw new IllegalArgumentException("Número de meses deve ser maior que 0");
        } else {
            return amount * Math.pow(1 + (getInterestRate() / 100), months);
        }
    }

}
