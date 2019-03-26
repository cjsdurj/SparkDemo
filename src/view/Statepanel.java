/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import entity.Equipment;
import entity.Player;

/**
 *
 * @author Administrator
 */

//状态类

public class Statepanel extends JPanel{
    
    public Player player;  
    Image image = (new ImageIcon("./util/主角头像.png")).getImage();//人物头像图标
    
    public Statepanel(Player player){
        this.player = player;
        this.setSize(200, 600);
    }
    
    protected void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 200, 600);
        g.setColor(Color.BLACK);
        g.drawImage(image, 45, 0, this);
        
        Equipment[] equipmentOnUse = player.getEquipmentOnUse();
        
        g.drawString("名字： "+player.getName(), 10, 150);//名字
        g.drawString("等级："+player.getLevel(), 10, 175);
        g.drawString("力量 : "+player.getStrength(), 10, 200);
        g.drawString("敏捷: "+player.getAgility(), 10, 225);
        g.drawString("智力: "+player.getIntelligence(), 10, 250);
        
        g.drawString("HP: "+player.getCur_hp()+"/"+player.getHp(), 10, 275);
        g.drawString("攻击力: "+player.getAttack(), 10, 300);
        g.drawString("防守力: "+player.getDefence(), 10, 325);
        g.drawString("速度 : "+player.getSpeed(), 10, 350);
        g.drawString("武器: "+equipmentOnUse[0].getName(), 10, 375);
        g.drawString("衣服: "+equipmentOnUse[1].getName(), 10, 400);
        g.drawString("鞋子: "+equipmentOnUse[2].getName(), 10, 425);
        g.drawString("装饰品(左): "+equipmentOnUse[3].getName(), 10, 450);
        g.drawString("装饰品(右): "+equipmentOnUse[4].getName(), 10, 475);
        g.drawString("金子："+player.getMoney(), 10, 500);
        g.drawString("经验："+player.getCur_xp()+"/"+player.getXp(), 10, 525);
        
        
    }
    
}
