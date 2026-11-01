# Java — 객체지향과 GUI 실습

**클래스로 상태를 관리하고, 사용자 입력을 이벤트로 처리하는 과정을 공부했습니다.**

## 1. 계좌 모델

[`BankAccount.java`](../examples/java/bank/BankAccount.java) · [`Bank.java`](../examples/java/bank/Bank.java)

- 예금주와 잔액을 필드로 두고 외부에서는 메서드를 통해 사용합니다.
- 생성자 오버로딩으로 기본 계좌·예금주 지정 계좌·초기 잔액 지정 계좌를 만듭니다.
- 입출금 과정에서 0원 이하 금액과 잔액 부족 조건을 처리합니다.

실행:

```sh
cd examples/java/bank
javac -encoding UTF-8 BankAccount.java Bank.java
java Bank
```

예제에서는 Bob 계좌의 초기 잔액 5,000원에 2,000원을 입금하고 3,000원을 출금하여 4,000원이 남습니다.
Alice 계좌에서는 음수 입금과 잔액 부족에 대한 메시지를 확인합니다.

다음 과제는 출력용 이름을 따로 받는 구조를 계좌의 예금주 필드와 통일하고, 생성자의 초기 잔액도 검증하는 것입니다.

## 2. Swing 전화번호부

[`NumberPadTest.java`](../examples/java/phonebook/NumberPadTest.java)

이름과 전화번호를 입력하고 추가·수정·삭제·검색 버튼으로 데이터를 다루는 데스크톱 GUI 실습입니다.
`HashMap<String, String>`에 연락처를 저장하고 목록과 동작 로그를 갱신합니다.

```sh
cd examples/java/phonebook
javac -encoding UTF-8 NumberPadTest.java
java NumberPadTest
```

| 조작 | 코드의 동작 |
| --- | --- |
| 추가 | 같은 이름이 있으면 추가하지 않고 메시지 표시 |
| 수정 | 이름을 키로 저장하며, 없던 이름이면 새 항목 추가 |
| 삭제 | 이름에 해당하는 항목 제거 후 목록 갱신 |
| 검색 | 이름으로 번호를 찾아 로그에 표시 |

현재 데이터는 메모리에 보관됩니다. 프로그램을 종료한 뒤 유지하려면 파일 또는 DB 저장을 추가해야 합니다.
빈 입력 검증, 수정 대상 존재 여부 확인, Swing 이벤트 스레드에서 화면 생성하기를 다음 개선점으로 남겼습니다.

자료: 학교 Java 실습 파일에서 선별한 코드. 공개본의 주석·공백을 정리했고 주요 동작을 유지했습니다.
검증 범위는 [검증 기록](../evidence/verification.md)에 정리합니다.

[학습 목록](README.md)
