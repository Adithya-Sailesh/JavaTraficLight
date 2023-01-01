import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TraficLight implements ActionListener{
    JFrame jf;
    JButton red,yel,gre,clr;
    public TraficLight(){
        jf=new JFrame("Trafic Light");
        jf.setLayout(null);
        jf.setSize(500, 300);
        red=new JButton("red");
        red.setBounds(20, 190, 100, 50);
        jf.add(red);
        yel=new JButton("Yellow");
        yel.setBounds(140, 190, 100, 50);
        jf.add(yel);
        gre=new JButton("Green");
        gre.setBounds(260, 190, 100, 50);
        jf.add(gre);
        clr=new JButton("Clear");
        clr.setBounds(380, 190, 100, 50);
        jf.add(clr);
        jf.setVisible(true);
        red.addActionListener(this);
        yel.addActionListener(this);
        gre.addActionListener(this);
        clr.addActionListener(this);
    }
    public static void main(String arg[]){
        new TraficLight();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            jf.getContentPane().setBackground(Color.RED);
        }
        else if(e.getSource()==yel){
            jf.getContentPane().setBackground(Color.yellow);
        }
        else if(e.getSource()==gre){
            jf.getContentPane().setBackground(Color.green);
        }
        else if(e.getSource()==clr){
            jf.getContentPane().setBackground(Color.white);
        }
    }
}
