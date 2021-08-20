public class Main {
    public static void main(String[] args) {

        int clientAccount = 100;
        int accountRefill = 1500;
        int bonusAmount = 100;

        int bonus;
        if (accountRefill >= 1000) {
            bonus = accountRefill / bonusAmount;
        }
        else
        {
            bonus = 0;
        }
        int Total = clientAccount + accountRefill + bonus;

        System.out.println(Total);
        System.out.println(bonus);

    }
}