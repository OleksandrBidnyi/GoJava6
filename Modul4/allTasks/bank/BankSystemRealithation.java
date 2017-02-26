package allTasks.bank;

import allTasks.user.User;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankSystemRealithation implements BankSystem {

    public void withdrawOfUser(User user, int amount) {

        if (amount <= 0) {
            System.out.println("Неправильно указанная сумма для снятия");
            return;
        }
        if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Превышен лимит на снятие");
            return;
        }
        double actualCommision = amount * user.getBank().getCommission(amount) / 100;
        if (user.getBalance() < amount + actualCommision) {
            System.out.println("Недостаточно денег для снятия");
            return;
        }
        double primaryBalance = user.getBalance();

        user.setBalance(new BigDecimal(user.getBalance() - amount - actualCommision).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println("Первоначальная сумма: " + primaryBalance + "; сумма снятия: " + amount + "; размер комиссии: " + actualCommision + "; остаток: " + user.getBalance());

    }

    public void fundUser(User user, int amount) {
        if (amount <= 0) {
            System.out.println("Неправильно указанная сумма для пополнения");
            return;
        }
        if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("Превышен лимит на пополнение");
            return;
        }
        double primaryBalance = user.getBalance();
        user.setBalance(user.getBalance() + amount);
        System.out.println("Баланс до пополнения: " + primaryBalance + "; размер пополнения: " + amount + "; стало на счету: " + user.getBalance());
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println("Перевод от юзера: " + fromUser.getName() + " юзеру: " + toUser.getName());
        if (amount <= 0) {
            System.out.println("Неправильно указанная сумма для перевода");
            return;
        }
        double actualCommision = amount * fromUser.getBank().getCommission(amount) / 100;
        if (fromUser.getBalance() < amount + actualCommision) {
            System.out.println("Недостаточно денег для перевода");
            return;
        }
        double transferAmount;
        if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency()) {
            transferAmount = new BigDecimal(amount * toUser.getBank().getCurrency().exchangeRate).setScale(2, RoundingMode.HALF_UP).doubleValue();
        } else {
            transferAmount = amount;
        }

        if (transferAmount > toUser.getBank().getLimitOfFunding()) {
            System.out.println(" Лимит пополнения превышен для пользователя: " + toUser.getName());
            return;
        }

        fromUser.setBalance(new BigDecimal(fromUser.getBalance() - amount - actualCommision).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        toUser.setBalance(new BigDecimal(toUser.getBalance() + transferAmount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println("Юзер: " + fromUser.getName() + " перевел сумму: " + amount + " валюта: " + fromUser.getBank().getCurrency() + " Юзеру: " + toUser.getName());
        System.out.println("Юзер: " + toUser.getName() + " получил сумму: " + transferAmount + " валюта: " + toUser.getBank().getCurrency() + " от юзера: " + fromUser.getName());
    }

    public void paySalary(User user) {
        user.setBalance(new BigDecimal(user.getBalance() + user.getSalary()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println("Баланс после выплаты зарплаты: " + user.getBalance());
    }
}
