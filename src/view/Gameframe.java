/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import demo.Music;
import entity.Player;

/**
 *
 * @author Administrator
 */

//游戏主面板类

public class Gameframe extends JFrame implements ActionListener {
    
    public Player player = new Player("渣渣辉");
    
    Mappanel mappanel; 
    Statepanel statepanel = new Statepanel(player);
    JButton close = new JButton("离开游戏");
    
    Music music;
    
    public Gameframe(){
        music = new Music("./util/游戏配乐.au");
     
        mappanel = new Mappanel(statepanel,player);
                
        this.setLayout(null);
        this.setBounds(300, 100, 605+200, 635);
        this.add(mappanel);
        this.add(statepanel);
        statepanel.setBounds(600, 0, 200, 550);
        
        this.add(close);
        close.setBounds(625 ,560 , 150 , 30);
        close.addActionListener(this);
        
     
        this.addKeyListener(mappanel);
        this.setFocusable(true);//什么用
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		music.Close();
        this.dispose();
	}
}
