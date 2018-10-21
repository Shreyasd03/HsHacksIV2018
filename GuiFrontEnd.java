import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiFrontEnd extends JFrame {
    public GuiFrontEnd() {
        JOptionPane.showMessageDialog(null,"Do this \"fun\" game to earn points(or you can't use your computer)","Focused Fun", JOptionPane.PLAIN_MESSAGE);

        //create window
        setTitle("Focused Learning");
        setSize(2800, 2000);

        //button dimension
        Dimension d=new Dimension(50,50);//dimension for button
        Dimension o=new Dimension(500,50);//dimension for button2ndstage
        //panel
        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.setPreferredSize(new Dimension(400,400));
        //reminder label
        JLabel label1=new JLabel("              Choose a subject");
        label1.setFont(new Font("Arial",Font.PLAIN,100));
        GridBagConstraints x=new GridBagConstraints();
        x.gridx=1;
        x.gridy=1;
        panel.add(label1);
        //Math Button
        JButton button = new JButton("Math");
        button.setSize(d);
        button.setFont(new Font("Arial",Font.PLAIN,150));
        GridBagConstraints g=new GridBagConstraints();
        g.gridx=1;
        g.gridy=2;
        panel.add(button,g);
        //English Button
        JButton button2 = new JButton("English");
        button2.setSize(d);
        button2.setFont(new Font("Arial",Font.PLAIN,150));
        GridBagConstraints y=new GridBagConstraints();
        y.gridx=1;
        y.gridy=3;
        panel.add(button2,y);
        this.getContentPane().add(panel);

        class MyActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button){
                    JPanel panel=new JPanel(new GridLayout(4,1));
                    //Topic
                    JFrame frame2=new JFrame("Topics");
                    frame2.setVisible(true);
                    frame2.setSize(3000,2000);

                //Question which topic they want
                JLabel label2=new JLabel("  Which math topic do you want?");
                label2.setFont(new Font("Arial",Font.PLAIN,100));
                GridBagConstraints z=new GridBagConstraints();
                z.gridx=0;
                z.gridy=1;
                panel.add(label2);
                //algebra button
                JButton jButton1=new JButton("Algebra");
                jButton1.setSize(d);
                jButton1.setFont(new Font("Arial",Font.PLAIN,70));
                frame2.add(panel);
                GridBagConstraints l = new GridBagConstraints();
                l.gridx = 2;
                l.gridy = 1;
                panel.add(jButton1,l);



                /*if(e.getSource()==jButton1){
                    jButton1.
                }//when algebra is pressed
jButton1.addActionListener(JOptionPane.showMessageDialog(null,"Here is your question:");*/

                //geometry button
                JButton jButton2=new JButton("Geometry");
                jButton2.setPreferredSize(o);
                jButton2.setFont(new Font("Arial",Font.PLAIN,70));
                GridBagConstraints c=new GridBagConstraints();
                c.gridx=2;
                c.gridy=2;
                panel.add(jButton2,c);
                //calculus button
                JButton jButton3=new JButton("Calculus");
                jButton3.setPreferredSize(o);
                jButton3.setFont(new Font("Arial",Font.PLAIN,70));
                GridBagConstraints k=new GridBagConstraints();
                k.gridx=2;
                k.gridy=3;
                panel.add(jButton3,k);
                if(e.getSource()==jButton1) {
                    jButton1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JLabel labelAlgebraQ = new JLabel("  Here is your question:");
                            labelAlgebraQ.setFont(new Font("Arial", Font.PLAIN, 70));
                            }
                        });
                    }
            }
            }
        }
        button.addActionListener(new MyActionListener());

                setVisible(true);
/*if(!points>=100) {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}*/



            }

            public static void main(String[] args) {
                GuiFrontEnd guiFrontEnd = new GuiFrontEnd();


            }

            }





