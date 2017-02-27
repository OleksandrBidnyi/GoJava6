package all_tasks.bank;

import all_tasks.user.User;

public interface BankSystem {

    public void withdrawOfUser(User user, int amount);

    public void fundUser(User user, int amount);

    public void transferMoney(User fromUser, User toUser, int amount);

    public void paySalary(User user);
}
