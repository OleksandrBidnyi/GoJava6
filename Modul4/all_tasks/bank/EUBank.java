package all_tasks.bank;

import all_tasks.currency.Currency;

public class EUBank extends Bank {

    public final static int WITHDRAWAL_LIMIT_USD = 2000;
    public final static int WITHDRAWAL_LIMIT_EUR = 2200;

    public final static int FUNDING_LIMIT_USD = 10000;
    public final static int FUNDING_LIMIT_EUR = 20000;

    public final static int MONTHLY_RATE_USD = 0;
    public final static int MONTHLY_RATE_EUR = 1;

    public final static int COMISSION_USD_DOWN = 5;
    public final static int COMISSION_USD_UP = 7;

    public final static int COMISSION_EUR_DOWN = 2;
    public final static int COMISSION_EUR_UP = 4;
    public final static int COMISSION_LIMIT = 1000;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(Currency.USD)) {
            withdrawal = WITHDRAWAL_LIMIT_USD;
        } else if (getCurrency().equals(Currency.EUR)) {
            withdrawal = WITHDRAWAL_LIMIT_EUR;
        }
        return withdrawal;
    }

    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (getCurrency().equals(Currency.USD)) {
            limitOfFunding = FUNDING_LIMIT_USD;
        } else if (getCurrency().equals(Currency.EUR)) {
            limitOfFunding = FUNDING_LIMIT_EUR;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency().equals(Currency.USD)) {
            monthlyRate = MONTHLY_RATE_USD;
        } else if (getCurrency().equals(Currency.EUR)) {
            monthlyRate = MONTHLY_RATE_EUR;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int comission = 0;
        if (getCurrency().equals(Currency.USD)) {
            if (summ < COMISSION_LIMIT) {
                comission = COMISSION_USD_DOWN;
            } else if (summ > COMISSION_LIMIT) {
                comission = COMISSION_USD_UP;
            }
        } else if (getCurrency().equals(Currency.EUR)) {
            if (summ < COMISSION_LIMIT) {
                comission = COMISSION_EUR_DOWN;
            } else if (summ > COMISSION_LIMIT) {
                comission = COMISSION_EUR_UP;
            }
        }
        return comission;
    }
}
