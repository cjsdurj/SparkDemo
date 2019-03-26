
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
import view.Textdialog;

public abstract class Monster extends Character {
        protected int provide_xp;
        protected int provide_money;
        
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
        };
                 
}
