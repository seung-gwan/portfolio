// 생성자 오버로딩, 입출금, 예외 조건을 확인하는 학습 예제입니다.
public class Bank {
    public static void main(String[] args) {
        BankAccount BA1 = new BankAccount();
        BankAccount BA2 = new BankAccount("Alice");
        BankAccount BA3 = new BankAccount("Bob", 5000);

        System.out.print("계좌 1 : ");
        BA1.printAccountInfo();
        System.out.print("계좌 2 : ");
        BA2.printAccountInfo();
        System.out.print("계좌 3 : ");
        BA3.printAccountInfo();

        BA3.deposit("Bob", 2000);
        BA3.withdraw("Bob", 3000);
        BA2.deposit("Alice", -100);
        BA2.withdraw("Alice", 100);
    }
}
