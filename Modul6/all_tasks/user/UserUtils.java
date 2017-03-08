package all_tasks.user;


/**
 * Created by Aleksandr on 06.03.2017.
 */
public final class UserUtils {

    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        User temp[] = new User[users.length];
        temp[0] = users[0];
        int count = 1;
        for (int i = 1; i < users.length; i++) {
            boolean bool = true;
            for (int j = 0; j < count; j++) {
                if (users[i].equals(temp[j])) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                temp[count] = users[i];
                count++;
            }
        }
        User[] unique = new User[count];
        System.arraycopy(temp, 0, unique, 0, count);
        return unique;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] temp = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                temp[count] = users[i];
                count++;
            }
        }
        User[] usWithContBal = new User[count];
        System.arraycopy(temp, 0, usWithContBal, 0, count);
        return usWithContBal;
    }

    final public static void paySalaryToUsers(User[] users) {
        System.out.println("Pay salary to all users: ");
        for (int i = 0; i < users.length; i++) {
            System.out.print("User: " + users[i].getFirstName() + " " + users[i].getLastName() + "; balance before: "
                    + users[i].getBalance() + " salary: " + users[i].getSalary());
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            System.out.println(" balance after: " + users[i].getBalance());
        }
    }

    final public static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();//for each
        }
        return usersId;
    }

    // user is empty when First name or Last name are empty.
    public static User[] deleteEmptyUsers(User[] users) {
        User temp[] = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {

            if (users[i].getLastName() != "" && users[i].getLastName() != null && (users[i].getFirstName() != "" && users[i].getFirstName() != null)) {
                temp[count] = users[i];
                count++;
            }
        }
        User[] newUsers = new User[count];
        System.arraycopy(temp, 0, newUsers, 0, count);
        return newUsers;
    }
}

