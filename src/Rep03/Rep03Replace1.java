package Rep03;

import javax.swing.JOptionPane;

public class Rep03Replace1 {
    public static void main(String[] args){
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w)");
        String weight = JOptionPane.showInputDialog("몸무게를 입력하세요: ");
        String height = JOptionPane.showInputDialog("키를 입력하세요: ");
        String age = JOptionPane.showInputDialog("나이를 입력하세요");

        JOptionPane.showMessageDialog(null,
                "성별: " + gender + "\n" +
                "몸무게: " + weight + "\n" +
                "키: " + height + "\n" +
                "나이: " + age);
    }
}
