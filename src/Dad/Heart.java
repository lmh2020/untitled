package Dad;
import java.awt.*;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Heart extends JFrame {
    Graphics  g ;
    public void Init(){
        //创建界面
        this.setTitle("love");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        JButton jbu = new JButton("按我");
        this.setDefaultCloseOperation(3);
        this.add(jbu);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        g = this.getGraphics();
        ActionListener l = new MyListener(g) ;
        jbu.addActionListener(l);


    }

    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.Init();
    }


}
