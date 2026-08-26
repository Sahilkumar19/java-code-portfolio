import javax.swing.*;
public class First {
    public static void main(String[] args) {
//        JFrame f=new JFrame("Button example");//creating instance of jframe
//        JButton b=new JButton("click");//creating an instance of button
//        b.setBounds(130,100,100,40);
//        f.add(b);//adding button in Jframe
//        f.setSize(400,400);
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);
        JFrame f= new JFrame("Label Example");
        JLabel l1,l2;
        l1=new JLabel("First Label.");
        l1.setBounds(50,50, 100,30);

        l2=new JLabel("Second Label.");
        l2.setBounds(50,100, 100,30);
        f.add(l1); f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);



    }
}