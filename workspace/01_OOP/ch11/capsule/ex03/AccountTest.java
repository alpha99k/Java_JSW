package ch11.capsule.ex03;

public class AccountTest {
    static void main(String[] args) {
        AccountBad myAccount = new AccountBad();

        // 10000원 입금 잔고 -
        myAccount.deposit(20000);
        // 5000원 출금 잔고 : -
        myAccount.withdraw(5000);
        // 잔고가 부족합니다. 잔고 : -
        myAccount.withdraw(10000);
        System.out.println(myAccount.getBalance());
    }
}
