package allTasks.currency;

public enum Currency {
    USD(1.065), EUR(0.94);//курс валют на момент написания задачи

    public double exchangeRate;

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

}
