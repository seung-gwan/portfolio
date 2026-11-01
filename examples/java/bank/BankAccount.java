// 학교 Java 객체지향 실습. 공개용으로 주석과 공백을 정리했습니다.
class BankAccount {
    private String owner;
    private int balance;

    public BankAccount() {
        owner = "Unknown";
        balance = 0;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(String name, int now) {
        if (now <= 0) {
            System.out.println("0원 이하는 입금할 수 없음");
        } else {
            balance += now;
            System.out.println(name + "의 계좌에 " + now + "입금 -> 잔액 : " + balance);
        }
    }

    public void withdraw(String name, int now) {
        if (now <= 0) {
            System.out.println("0원 이하는 출금할 수 없음");
        } else if (now > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= now;
            System.out.println(name + "의 계좌에 " + now + "출금 -> 잔액 : " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void printAccountInfo() {
        System.out.println("예금주: " + owner + ", 잔액: " + balance);
    }
}
