

package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class Textdialog extends JDialog implements   KeyListener,MouseListener{

    JLabel jlabel;
    ImageIcon icon;
    public Textdialog(String string){
        jlabel =new  JLabel(string ,icon,SwingConstants.CENTER);
        
        this.add(jlabel);
        this.setLocation(100, 550);
        this.setSize(1000, 100);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setModal(true);
        this.setVisible(true);
        
    }

    

    

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
       if(e.getButton()==1)this.dispose();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == ' '||e.getKeyCode() == '\n')
            this.dispose();
    }

    public void keyReleased(KeyEvent e) {
    }
}
