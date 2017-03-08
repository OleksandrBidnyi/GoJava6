package all_tasks.user;

/**
 * Created by Aleksandr on 07.03.2017.
 */
public class UserMain {
    public static void main(String[] args) {
        User user[] = new User[5];
        user[0] = new User(1111, "Aleks", "Black", 500, 2000);
        user[1] = new User(1112, "Mikle", "White", 100, 1000);
        user[2] = new User(1113, "Masha", "Green", 400, 1500);
        user[3] = new User(1114, "Dima", "Gray", 800, 3000);
        user[4] = new User(1111, "Aleks", "Black", 500, 2000);

        System.out.println("Unique Users: ");
        User[] unique = UserUtils.uniqueUsers(user);
        for (User u : unique) System.out.println(u);
        System.out.println();

        int balance = 1000;
        System.out.println("Users with contitional balance; balance = " + balance + ":");
        User[] usersWithContitionalBalance = UserUtils.usersWithContitionalBalance(user, balance);
        for (User u : usersWithContitionalBalance) System.out.println(u);
        System.out.println();

        UserUtils.paySalaryToUsers(user);
        System.out.println();

        System.out.println("Users id:");
        long[] usersId = UserUtils.getUsersId(user);
        for (long l : usersId) System.out.println(l);
        System.out.println();

        System.out.println("Delete empty users and create new array:");
        user = UserUtils.deleteEmptyUsers(user);
        for (User del : user) System.out.println(del);
    }
}
