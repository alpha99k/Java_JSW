package ch11.capsule.ex03;

public class AccountBad {
    //  잔고
    private int balance;


    //GetterSetter
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    //생성자
    public AccountBad() {
        this.balance = balance;
    }
    public AccountBad(int balance) {
        this.balance = balance;
    }


    //  입금 (amount만큼 balance 증가)
    public void deposit(int amount){
        balance += amount;
        System.out.println( amount + "원 입금 ---> 잔고 : " + balance);
    }

    //  출금 (amount만큼 balance 감소, 잔고가 부족한거 확인)
    public void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println( amount + "원 출금 ---> 잔고 : " + balance);
        } else {
            System.out.println( "잔액 부족  ---> 잔고 : " + balance);
        }

    }
}
