package Rep03;

import javax.swing.JOptionPane;

public class Rep03Replace2 {
    public static void main(String[] args) {
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w)");
        String strWeight = JOptionPane.showInputDialog("몸무게를 입력하세요: ");
        String strHeight = JOptionPane.showInputDialog("키를 입력하세요: ");
        String strAge = JOptionPane.showInputDialog("나이를 입력하세요");

        double weight = Double.parseDouble(strWeight);
        double height = Double.parseDouble(strHeight);
        int age = Integer.parseInt(strAge);

        double calories = 0;
        if (gender.equals("M") || gender.equals("m")) {
            calories = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (gender.equals("W") || gender.equals("w")) {
            calories = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        } else {
            JOptionPane.showMessageDialog(null,
                    "성별이 잘못 입력되었습니다.");
            System.exit(0);
        }

        int chocolate = (int) (calories / 200);

        String cal = String.format("%.1f", calories);

        JOptionPane.showMessageDialog(null,
                "하루에 필요한 칼로리: " + cal + " kcal\n" +
                        "하루에 필요한 초콜릿 수: " + chocolate + "개");
    }
}
