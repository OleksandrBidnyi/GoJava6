package allTasks.bank;

import allTasks.user.User;

public interface BankSystem {

    public void withdrawOfUser(User user, int amount);

    public void fundUser(User user, int amount);

    public void transferMoney(User fromUser, User toUser, int amount);

    public void paySalary(User user);
}
