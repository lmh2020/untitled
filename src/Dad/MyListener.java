package Dad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    Graphics g;

    public MyListener(Graphics g) {

        this.g = g;
    }

    public void actionPerformed(ActionEvent e) {

        if ("按我".equals(e.getActionCommand())) {

            g.setColor(Color.red);
            //画两圆
            int x1 = 100, y1 = 100, r = 30;
            g.fillOval(x1 - r, y1 - r, 2 * r, 2 * r);
            g.fillOval((int) x1 + r - 10, y1 - r, 2 * r, 2 * r);
            //画切线
            g.drawLine(125, y1 + 5 / 2 * r, (int) (126 - 30 * Math.sqrt(3)), 115);
            //循环填充
            for (int i = 125; i <= 228; i++) {
                g.drawLine(125, y1 + 5 / 2 * r, (int) (i - 30 * Math.sqrt(3)), 115);
            }
            //浪一下，设置“love”字体，因为有的地方画两遍，用字体挡住颜色不均匀的地方
            g.setColor(Color.blue);
            Font font = new Font("1188", Font.BOLD, 32);
            g.setFont(font);
            g.drawString("1188", x1 - 6, y1 + 22);

        }
    }
}
