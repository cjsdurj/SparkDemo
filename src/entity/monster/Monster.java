
package entity.monster;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;

import entity.Character;
import entity.Player;
import entity.potion.*;
import entity.weapon.*;
import view.Textdialog;

public abstract class Monster extends Character {
        protected int provide_xp;
        protected int provide_money;
        protected Weapon[] weapons = {new InfinityEdge(),new Bloodthirster()};
        protected Potion[] potions = {new HealthPotion(),new ManaPotion()};
        public Monster() {};
        
        public Monster(String name,int level) {
        	super(name,level);
        	this.provide_money= 10+level;
        	this.provide_xp = 50+2*level;
        }
        
        public void award(Player p) {
        	p.gain_money(this.provide_money);
        	p.gain_xp(this.provide_xp);
        	new Textdialog(p.getName()+"获得:  "+provide_xp+"经验,"+provide_money+"金币");
        	//5% 概率掉装备，10%概率掉药品；
        	double prob1 = Math.random();
        	double prob2 = Math.random();
        	int choice = (int)(Math.random()*10);
        	if(prob1<0.5 && prob1>=0.05) {
        		Weapon weapon  = weapons[choice%weapons.length];
                new Textdialog("恭喜"+p.getName()+"获得武器: "+weapon.getName());
                p.achieve_Weapon(weapon);
        	}
        	
        	if(prob2<0.1) {
        		Potion potion = potions[choice%potions.length];
                new Textdialog("恭喜"+p.getName()+"获得道具: "+potion.getName());
        	}
        	
        	
        	
        };
                 
}
