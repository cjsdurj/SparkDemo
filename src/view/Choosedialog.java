/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import entity.Player;
import entity.monster.Monster;
import entity.skill.Skill;

/**
 *
 * @author Administrator
 */
public class Choosedialog extends JDialog implements ActionListener{
    
    private JButton[] button = new JButton[30];
    private JPanel panel = new JPanel();
    private int total;
    private int choice=-1;
    
      public  Choosedialog(ArrayList<Monster> monsters){
          this.total = monsters.size();
          panel.setLayout(new GridLayout(1 , 4));
          for(int j = 0 ; j < total ; j++){
              button[j] = new JButton("第"+(j+1)+"个怪物: "+monsters.get(j).getName());
              panel.add(button[j]);
              button[j].addActionListener(this);
          }
          
          panel.setBounds(0, 0, 400, 400);
          this.add(panel);
          this.setLocation(300, 500);
          this.setSize(600 , 250);
          this.setTitle("选择攻击的怪物");
          this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
          this.setModal(true);
          this.setVisible(true);
          
      }
      
      public Choosedialog(Skill[] skill ,int i){
          
      }
      
      public  Choosedialog(Player player){
         
      }


          
        

   

    public int getChoice() {
		return choice;
	}

	public void actionPerformed(ActionEvent e) {
        for(int m = 0 ; m < total ; m++){
            if(e.getActionCommand().equals(button[m].getText())){
                choice = m;
                this.dispose();
                return ;
            }
        }
    }
  
}
