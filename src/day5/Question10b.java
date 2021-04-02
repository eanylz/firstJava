package day5;

import javax.swing.*;

public class Question10b {
    public static void main(String[] args) {

        String aa = JOptionPane.showInputDialog("enter the value of a");
        double a = Double.parseDouble(aa);

        double b = Double.parseDouble(JOptionPane.showInputDialog("enter the value of b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("enter the value of c"));

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        JOptionPane.showMessageDialog(null, "area is"+area);

    }
}
