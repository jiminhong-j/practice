package Rep03;

import javax.swing.JOptionPane;

public class Rep03Replace2 {
    public static void main(String[] args){
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w)");
        String strWeight = JOptionPane.showInputDialog("몸무게를 입력하세요: ");
        String strHeight = JOptionPane.showInputDialog("키를 입력하세요: ");
        String strAge = JOptionPane.showInputDialog("나이를 입력하세요");

        double weight = Double.parseDouble(strWeight);
        double height = Double.parseDouble(strHeight);
        int age = Integer.parseInt(strAge);

        double calories = 0;


        JOptionPane.showMessageDialog();
}
