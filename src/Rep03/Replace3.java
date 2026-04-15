package Rep03;

import javax.swing.*;

public class Replace3 {
    public static void main(String[] args){

        while(true) {
            String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w):");
            if (gender.equals("Q") || gender.equals("q")) {
                JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                break;
            }

            if (!(gender.equals("M") || gender.equals("m") || gender.equals("W") || gender.equals("w"))) {
                JOptionPane.showMessageDialog(null, "성별이 잘못 입력되었습니다.");
                continue;
            }

            String s_weight = JOptionPane.showInputDialog("몸무게를 입력하세요:");
            int weight = Integer.parseInt(s_weight);
            if(weight <= 0){
                JOptionPane.showMessageDialog(null, "몸무게는 양수여야 합니다. 다시 입력해주세요.");
                continue;
            }
            String s_height = JOptionPane.showInputDialog("키를 입력하세요:");
            int height = Integer.parseInt(s_height);
            if(height <= 0){
                JOptionPane.showMessageDialog(null, "키는 양수여야 합니다. 다시 입력해주세요.");
                continue;
            }

            String s_age = JOptionPane.showInputDialog("나이를 입력하세요:");

            double calories = 0;
            int age = Integer.parseInt(s_age);

            if (gender.equals("M") || gender.equals("m")) {
                calories = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            } else if (gender.equals("W") || gender.equals("w")) {
                calories = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            }

            int chocolate = (int) (calories / 200);
            String cal = String.format("%.1f", calories);

            JOptionPane.showMessageDialog(null, "성별: " + gender + "\n"
                    + "몸무게: " + weight + "\n"
                    + "키: " + height + "\n"
                    + "나이: " + age);

            JOptionPane.showMessageDialog(null, "하루에 필요한 칼로리: " + cal + " kcal\n"
                    + "하루에 필요한 초콜릿 수: " + chocolate + "개");
        }
    }
}
