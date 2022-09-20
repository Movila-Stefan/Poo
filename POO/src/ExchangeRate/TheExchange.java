package ExchangeRate;

public class TheExchange {

    private String numeMoneda;
    private double exchangeRate;

    public TheExchange(String numeMoneda, double exchangeRate) {
        this.numeMoneda = numeMoneda;
        this.exchangeRate = exchangeRate;
    }

    public String getNumeMoneda() {
        return numeMoneda;
    }

    public void setNumeMoneda(String numeMoneda) {
        this.numeMoneda = numeMoneda;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
