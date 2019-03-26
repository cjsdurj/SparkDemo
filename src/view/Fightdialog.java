
package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import entity.Player;
import entity.monster.HardMonsterFactory;
import entity.monster.MiddleMonsterFactory;
import entity.monster.Monster;
import entity.monster.MonsterFactory;

import entity.monster.SimpleMonsterFactory;
import entity.skill.Skill;
import entity.skill.Type;

class Fightdialog extends JDialog implements ActionListener {

	private Player player;
	private ArrayList<Monster> monsters;

	private JPanel_player PlayerPanel;
	private JPanel_monsters MonsterPanel;
	private JPanel panel3;

	private JButton attack = new JButton("攻击");
	private JButton prop = new JButton("道具");
	private JButton leave = new JButton("逃跑");
	private JButton skill = new JButton("技能");

	// 地图随机遇怪的构造方法
	Fightdialog() {
		int size = (int) (Math.random() * 10 + 4) / 4;

		this.player = Player.getInstance();
		// 怪物工厂
		MonsterFactory simpleFactory = new SimpleMonsterFactory();
		MonsterFactory middleFactory = new MiddleMonsterFactory();
		MonsterFactory hardFactory = new HardMonsterFactory();

		monsters = new ArrayList<Monster>();
		// 10%概率产生简单怪物，40%概率产生中等难度怪物，50%概率产生困难难度怪物
		for (int j = 0; j < size; j++) {
			double x = Math.random();
			Monster monster = null;
			if (x < 0.1) {
				monster = hardFactory.getRandom();
			} else if (x >= 0.1 && x < 0.5) {
				monster = middleFactory.getRandom();
			} else {
				monster = simpleFactory.getRandom();
			}
			monsters.add(monster);
		}

		PlayerPanel = new JPanel_player();// 主角面板
		PlayerPanel.setBounds(0, 0, 300, 400);

		MonsterPanel = new JPanel_monsters(monsters);// 怪物面板,把PLAYER改掉
		MonsterPanel.setBounds(300, 0, 300, 400);

		panel3 = new JPanel();// 按钮面板
		panel3.setBounds(0, 400, 600, 200);

		panel3.setLayout(new GridLayout(2, 2));
		panel3.add(attack);
		panel3.add(prop);
		panel3.add(skill);
		panel3.add(leave);

		this.setBounds(300, 100, 605, 635);
		this.setLayout(null);
		this.add(PlayerPanel);
		this.add(MonsterPanel);
		this.add(panel3);

		attack.addActionListener(this);
		prop.addActionListener(this);
		skill.addActionListener(this);
		leave.addActionListener(this);

		this.setTitle("战斗画面");
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.setModal(true);
		this.setVisible(true);
	}

	// 指定战斗的对象的构造方法
	Fightdialog(ArrayList<Monster> monsters) {
		this.player = Player.getInstance();
		this.monsters = monsters;

		PlayerPanel = new JPanel_player();// 主角面板
		PlayerPanel.setBounds(0, 0, 300, 400);

		MonsterPanel = new JPanel_monsters(monsters);// 怪物面板
		MonsterPanel.setBounds(300, 0, 300, 400);

		panel3 = new JPanel();// 按钮面板
		panel3.setBounds(0, 400, 600, 200);

		panel3.setLayout(new GridLayout(2, 2));
		panel3.add(attack);
		panel3.add(prop);
		panel3.add(skill);
		panel3.add(leave);

		this.setBounds(300, 100, 605, 635);
		this.setLayout(null);
		this.add(PlayerPanel);
		this.add(MonsterPanel);
		this.add(panel3);

		attack.addActionListener(this);
		prop.addActionListener(this);
		skill.addActionListener(this);
		leave.addActionListener(this);

		this.setTitle("战斗画面");
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.setModal(true);
		this.setVisible(true);
	}

	// 内部类
	// 主角面板
	public class JPanel_player extends JPanel {
		private Player player;

		public JPanel_player() {
			this.player = Player.getInstance();
		}

		protected void paintComponent(Graphics g) {
			g.drawImage(player.getImage(), 40, 0, this);
			g.drawString("名字： " + player.getName(), 50, 120);// 名字
			g.drawString("等级： " + player.getLevel(), 50, 140);
			g.drawString("生命： " + player.getCur_hp() + "/" + player.getHp(), 50, 160);
			g.drawString("攻击力： " + player.getCur_attack(), 50, 180);
			g.drawString("防御力： " + player.getCur_defence(), 50, 200);
		}
	}

	// 怪物面板,把PLAYER改掉
	public class JPanel_monsters extends JPanel {
		private ArrayList<Monster> monsters;

		public JPanel_monsters(ArrayList<Monster> monsters) {
			this.monsters = monsters;
		}

		protected void paintComponent(Graphics g) {

			if (monsters.size() != 0) {

				ListIterator<Monster> monster_iter = monsters.listIterator();
				int i = 0;
				while (monster_iter.hasNext()) {
					Monster monster = monster_iter.next();
					g.drawImage(monster.getImage(), 30 + (i % 2 * 150), 10 + (i / 2) * 200, this);
					g.drawString("名字： " + monster.getName(), 30 + (i % 2 * 150), 110 + (i / 2) * 200);// 名字
					g.drawString("等级： " + monster.getLevel(), 30 + (i % 2 * 150), 130 + (i / 2) * 200);
					g.drawString("生命： " + monster.getCur_hp() + "/" + monster.getHp(), 30 + (i % 2 * 150),
							150 + (i / 2) * 200);
					g.drawString("攻击力： " + monster.getCur_attack(), 30 + (i % 2 * 150), 170 + (i / 2) * 200);
					g.drawString("防御力： " + monster.getCur_defence(), 30 + (i % 2 * 150), 190 + (i / 2) * 200);
					i++;
				}
			}

		}
	}
    public void checkgame() {
    	boolean lose = false;

		if (!player.is_alive()) {
			lose = true;
		}

		for (Monster monster : monsters) {
			if (!monster.is_alive()) {
				new Textdialog(monster.getName() + "已经死亡");
				monster.award(player);
				if (player.can_levelup()) {
					player.levelup();
				}

			}
		}

		monsters.removeIf(monster -> !monster.is_alive());
		this.repaint();

		if (monsters.size() == 0) {
			new Textdialog("战斗结束");
			this.dispose();
		}

		if (lose) {
			new Textdialog("战斗结束");
			this.dispose();
		}
    	
    }

    public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("攻击")) {

			int choice = new Choosedialog(monsters).getChoice();
			if (choice == -1)
				return;

			player.attack_someone(monsters.get(choice));

			for (Monster monster : monsters) {
				monster.attack_someone(player);
			}
			this.repaint();
            
			this.checkgame();

		}

		if (e.getActionCommand().equals("道具")) {

		}

		if (e.getActionCommand().equals("技能")) {
			int skill_choice = new Choosedialog(player.getSkills()).getChoice();
			   if(skill_choice ==-1) return;
			Skill skill = player.getSkills()[skill_choice];
			boolean success =true;
			if(skill.getType()==entity.skill.Type.single) {
			int monster_choice = new Choosedialog(monsters).getChoice();
			if (monster_choice ==-1) return;
			 success = skill.useSkill(player, monsters, monster_choice);}
			
			if(success) {
			for (Monster monster : monsters) {
				monster.attack_someone(player);}}
			this.repaint();
			this.checkgame();			
		}
		if (e.getActionCommand().equals("逃跑")) {
			new Textdialog("逃跑成功");
			this.dispose();
		}
	}

}
