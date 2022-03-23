import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);


    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            /*case 'a' : label.setLocation(label.getX() - 5, label.getY());
                break;
            case 'd' : label.setLocation(label.getX() + 5, label.getY());
                break;*/
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37 :
                label.setLocation(label.getX() - 5, label.getY());//SINISTRA
                break;
            case 39 :
                label.setLocation(label.getX() + 5, label.getY());//DESTRA
                break;
            case 32 :
                label.setLocation(label.getX(), label.getY() - 5);//SALTO
                //AGGIUNGERE MODO PER FARLO SCENDERE AL POSTO DI PARTENZA

                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Tasto :" + e.getKeyChar());
        System.out.println("Tasto :" + e.getKeyCode());

    }
}
