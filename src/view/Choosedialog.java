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
import entity.potion.*;
import entity.skill.Skill;

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
      
      public Choosedialog(Skill[] skills){
    	  this.total =skills.length;
          panel.setLayout(new GridLayout(2, 4));
          for(int j = 0 ; j < skills.length ; j++){
              button[j] = new JButton(skills[j].getName()+"(PP:"+skills[j].getCur_pp()+"/"+skills[j].getMax_pp()+")");
              panel.add(button[j]);
              button[j].addActionListener(this);
          }
          
          panel.setBounds(0, 0, 300, 100);
          this.add(panel);
          this.setLocation(300, 500);
          this.setSize(600,250);
          this.setTitle("选择技能");
          this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
          this.setModal(true);
          this.setVisible(true);
          
      }
      
      public  Choosedialog(Player player){
    	  Potion[] potions = player.getPotions();
    	  this.total = potions.length;
          panel.setLayout(new GridLayout(2 , 3));
          for(int j = 0 ; j < total ; j++){
              button[j] = new JButton(potions[j].getName() );
              panel.add(button[j]);
              button[j].addActionListener(this);
          }
          
          panel.setBounds(0, 0, 300, 100);
          this.add(panel);
          this.setLocation(300, 500);
          this.setSize(600,250);
          this.setTitle("选择使用的物品");
          this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
          this.setModal(true);
          this.setVisible(true);
         
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
