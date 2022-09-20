package ExchangeRate;

public class NationalMoney {
    private double ExchangeRatePentruEuro;
    private double ExchangeRatePentruUsd;
    private double ExchangeRatePentruGbp;

    public NationalMoney(double exchangeRatePentruEuro, double exchangeRatePentruUsd, double exchangeRatePentruGbp) {
        ExchangeRatePentruEuro = exchangeRatePentruEuro;
        ExchangeRatePentruUsd = exchangeRatePentruUsd;
        ExchangeRatePentruGbp = exchangeRatePentruGbp;
    }

    public double getExchangeRatePentruEuro() {
        return ExchangeRatePentruEuro;
    }

    public void setExchangeRatePentruEuro(double exchangeRatePentruEuro) {
        ExchangeRatePentruEuro = exchangeRatePentruEuro;
    }

    public double getExchangeRatePentruUsd() {
        return ExchangeRatePentruUsd;
    }

    public void setExchangeRatePentruUsd(double exchangeRatePentruUsd) {
        ExchangeRatePentruUsd = exchangeRatePentruUsd;
    }

    public double getExchangeRatePentruGbp() {
        return ExchangeRatePentruGbp;
    }

    public void setExchangeRatePentruGbp(double exchangeRatePentruGbp) {
        ExchangeRatePentruGbp = exchangeRatePentruGbp;
    }
}
