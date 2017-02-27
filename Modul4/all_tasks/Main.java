package all_tasks;

import all_tasks.bank.BankSystemRealithation;
import all_tasks.bank.ChinaBank;
import all_tasks.bank.EUBank;
import all_tasks.bank.USBank;
import all_tasks.currency.Currency;
import all_tasks.user.User;

public class Main {
    public static void main(String[] args) {
        USBank usBankUSD = new USBank(11122, "USA", Currency.USD, 200, 2000, 55555, 10000000);
        USBank usBankEUR = new USBank(11123, "USA", Currency.EUR, 150, 1500, 55556, 20000000);

        EUBank euBankUSD = new EUBank(22222, "Spain", Currency.USD, 100, 2500, 44444, 15000000);
        EUBank euBankEUR = new EUBank(22223, "Spain", Currency.EUR, 120, 2700, 44445, 12000000);

        ChinaBank chinaBankUSD = new ChinaBank(33333, "China", Currency.USD, 300, 700, 22225, 350000000);
        ChinaBank chinaBankEUR = new ChinaBank(33334, "China", Currency.EUR, 270, 800, 22226, 250000000);


        User userUSBankUSD = new User(1234567, "Masha", 8000.55, 10, "Adidas", 1200, usBankUSD);
        User userUSBankEUR = new User(1234568, "Konstantin", 10200.68, 9, "Reno", 2000, usBankEUR);

        User userEUBankUSD = new User(1234569, "Karina", 5600.25, 5, "Samsung", 1800, euBankUSD);
        User userEUBankEUR = new User(1234570, "Maksim", 22600.37, 15, "Trust", 1500, euBankEUR);

        User userChinaBankUSD = new User(1234571, "Alina", 9600.85, 4, "LG", 2500, chinaBankUSD);
        User userChinaBankEUR = new User(1234572, "Aleks", 33000.95, 20, "Honda", 3500, chinaBankEUR);

        BankSystemRealithation bankSystem = new BankSystemRealithation();

        System.out.println("Имя пользователя банка долларового счета USBank: " + userUSBankUSD.getName());
        bankSystem.withdrawOfUser(userUSBankUSD, 250);
        bankSystem.fundUser(userUSBankUSD, 255);
        bankSystem.transferMoney(userUSBankUSD, userUSBankEUR, 350);
        bankSystem.paySalary(userUSBankUSD);

        System.out.println("\n" + "Имя пользователя банка евро счета USBank: " + userUSBankEUR.getName());
        bankSystem.withdrawOfUser(userUSBankEUR, 350);
        bankSystem.fundUser(userUSBankEUR, 1000000);
        bankSystem.transferMoney(userUSBankEUR, userUSBankUSD, 200);
        bankSystem.paySalary(userUSBankEUR);

        System.out.println("\n" + "Имя пользователя банка долларового счета EUBank: " + userEUBankUSD.getName());
        bankSystem.withdrawOfUser(userEUBankUSD, -1000000);
        bankSystem.fundUser(userEUBankUSD, 2500);
        bankSystem.transferMoney(userEUBankUSD, userUSBankEUR, 2005);
        bankSystem.paySalary(userEUBankUSD);

        System.out.println("\n" + "Имя пользователя банка евро счета EUBank: " + userEUBankEUR.getName());
        bankSystem.withdrawOfUser(userEUBankEUR, 999);
        bankSystem.fundUser(userEUBankEUR, 2564);
        bankSystem.transferMoney(userEUBankEUR, userUSBankUSD, 2771);
        bankSystem.paySalary(userEUBankEUR);

        System.out.println("\n" + "Имя пользователя банка долларового счета ChinaBank: " + userChinaBankUSD.getName());
        bankSystem.withdrawOfUser(userChinaBankUSD, 1234);
        bankSystem.fundUser(userChinaBankUSD, 9899);
        bankSystem.transferMoney(userChinaBankUSD, userEUBankEUR, 25678);
        bankSystem.paySalary(userChinaBankUSD);

        System.out.println("\n" + "Имя пользователя банка евро счета ChinaBank: " + userChinaBankEUR.getName());
        bankSystem.withdrawOfUser(userChinaBankEUR, 119);
        bankSystem.fundUser(userChinaBankEUR, 777);
        bankSystem.transferMoney(userChinaBankEUR, userChinaBankUSD, 556);
        bankSystem.paySalary(userChinaBankEUR);
    }
}
