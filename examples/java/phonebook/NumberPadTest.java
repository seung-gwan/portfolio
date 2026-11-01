import java.awt.*;
import javax.swing.*;
import java.util.HashMap;

// 학교 Swing 실습. 연락처는 메모리에 저장합니다.
public class NumberPadTest extends JFrame {
    private HashMap<String, String> phoneBook = new HashMap<>();
    private JTextField nameField;
    private JTextField phoneField;
    private JTextArea logArea;
    private JTextArea listArea;
    private JButton okbtn;
    private JButton upbtn;
    private JButton clbtn;
    private JButton fibtn;

    public NumberPadTest() {
        setTitle("HashMap 기반 전화번호부 관리 프로그램");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(4, 2, 10, 15));
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        topPanel.add(new JLabel(" 이름"));
        nameField = new JTextField();
        topPanel.add(nameField);
        topPanel.add(new JLabel(" 전화번호"));
        phoneField = new JTextField();
        topPanel.add(phoneField);

        okbtn = new JButton("입력완료");
        upbtn = new JButton("수정");
        clbtn = new JButton("삭제");
        fibtn = new JButton("검색");
        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(okbtn);
        btnPanel.add(upbtn);
        btnPanel.add(clbtn);
        btnPanel.add(fibtn);
        topPanel.add(new JLabel(""));
        topPanel.add(btnPanel);
        add(topPanel, BorderLayout.NORTH);

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        split.setDividerLocation(450);
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
        JScrollPane log = new JScrollPane(logArea);
        log.setBorder(BorderFactory.createTitledBorder("메세지"));
        listArea = new JTextArea();
        listArea.setEditable(false);
        listArea.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        listArea.setBackground(new Color(250, 250, 255));
        JScrollPane list = new JScrollPane(listArea);
        list.setBorder(BorderFactory.createTitledBorder("현재 연락처 목록"));
        split.setLeftComponent(log);
        split.setRightComponent(list);
        add(split, BorderLayout.CENTER);

        updateListArea();
        okbtn.addActionListener(e -> addContact());
        upbtn.addActionListener(e -> updateContact());
        clbtn.addActionListener(e -> deleteContact());
        fibtn.addActionListener(e -> searchContact());
    }

    private void appendLog(String msg) {
        logArea.append(msg + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }

    private void updateListArea() {
        StringBuilder sb = new StringBuilder();
        if (phoneBook.isEmpty()) {
            sb.append("아직 저장된 연락처가 없습니다.");
        } else {
            sb.append("현재 연락처 목록 (").append(phoneBook.size()).append("명)\n\n");
            for (String name : phoneBook.keySet()) {
                sb.append(" ").append(name).append(" , ").append(phoneBook.get(name)).append("\n\n");
            }
        }
        listArea.setText(sb.toString());
    }

    private void addContact() {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        // 학습 당시 로직을 유지했습니다. 빈 입력 검증은 개선 과제입니다.
        if (phoneBook.containsKey(name)) {
            appendLog("추가 실패 이미 존재합니다.");
            return;
        }
        phoneBook.put(name, phone);
        appendLog(name + " 님의 전화번호가 추가되었습니다.");
        updateListArea();
        clearFields();
    }

    private void updateContact() {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        // put은 기존 키를 덮어쓰고, 새 키면 항목을 추가합니다.
        phoneBook.put(name, phone);
        appendLog("수정 완료");
        updateListArea();
        clearFields();
    }

    private void deleteContact() {
        String name = nameField.getText().trim();
        String removed = phoneBook.remove(name);
        if (removed != null) {
            appendLog(name + " 님의 정보가 삭제되었습니다.");
        } else {
            appendLog("삭제 실패 : " + name + " 님을 찾을 수 없습니다.");
        }
        updateListArea();
        nameField.setText("");
    }

    private void searchContact() {
        String name = nameField.getText().trim();
        String phone = phoneBook.get(name);
        if (phone != null) {
            appendLog("검색 결과 : " + name + " -> " + phone);
        } else {
            appendLog(name + " 님에 대한 정보가 없습니다.");
            phoneField.setText("");
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        nameField.requestFocus();
    }

    public static void main(String[] args) {
        // 이벤트 스레드에서의 화면 생성은 다음 개선 과제로 남깁니다.
        new NumberPadTest().setVisible(true);
    }
}
