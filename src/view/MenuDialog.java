package view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import entity.Player;
import entity.potion.Potion;
import entity.skill.Skill;
import entity.weapon.Weapon;

public class MenuDialog extends javax.swing.JDialog {
	private Player player;

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;

	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;

	private JList jList1;
	private JList jList2;
	private JList jList3;
	private JTextArea jTextArea1;

	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;

	private javax.swing.JPanel statepanel;

	public MenuDialog() {
		player = Player.getInstance();
		this.player = player;
		initComponents();
		this.setBounds(100, 100, 600, 600);
		this.setTitle("人物状态");
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setModal(true);
		this.setVisible(true);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		statepanel = new Statepanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();

		jList1 = new JList();
		jList2 = new JList();
		jList3 = new JList();
		jTextArea1 = new javax.swing.JTextArea();

		jScrollPane1 = new JScrollPane();
		jScrollPane2 = new JScrollPane();
		jScrollPane3 = new JScrollPane();
		jScrollPane4 = new JScrollPane();

		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();

		javax.swing.GroupLayout statepanelLayout = new javax.swing.GroupLayout(statepanel);
		statepanel.setLayout(statepanelLayout);
		statepanelLayout.setHorizontalGroup(statepanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 180, Short.MAX_VALUE));
		statepanelLayout.setVerticalGroup(statepanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 473, Short.MAX_VALUE));

		jLabel1.setText("  药水");
		jLabel2.setText("  武器");
		jLabel3.setText("  技能");

		jList1.setModel(new ListModel("药水"));
		jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				jList1ValueChanged(evt);
			}
		});
		jScrollPane1.setViewportView(jList1);

		jList2.setModel(new ListModel("武器"));
		jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				jList2ValueChanged(evt);
			}
		});
		jScrollPane2.setViewportView(jList2);

		jList3.setModel(new ListModel("技能"));
		jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				jList3ValueChanged(evt);
			}
		});
		jScrollPane3.setViewportView(jList3);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setLineWrap(true);
		jScrollPane4.setViewportView(jTextArea1);

		jButton1.setText("使用物品");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("装备");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("学习技能");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(statepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(35, 35, 35)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												layout.createSequentialGroup().addGap(18, 18, 18)
														.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
																52, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(37, 37, 37)
														.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
																42, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(52, 52, 52).addComponent(jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 89,
												Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
										Short.MAX_VALUE)))
				.addGap(48, 48, 48)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap()
								.addComponent(statepanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
				.addGroup(layout.createSequentialGroup()
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout
								.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addComponent(jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addComponent(jLabel3,
												javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 214,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(55, 55, 55)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85,
												Short.MAX_VALUE)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(14, 14, 14)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)));
		pack();
	}

	private void jList1ValueChanged(ListSelectionEvent evt) {
		if (jList1.getSelectedIndex() == -1)
			return;
		jTextArea1.setText(player.getPotions()[jList1.getSelectedIndex()].getDescription());
	}

	private void jList2ValueChanged(ListSelectionEvent evt) {
		jTextArea1.setText(player.getWeapons()[jList2.getSelectedIndex()].getDescription());
	}

	private void jList3ValueChanged(ListSelectionEvent evt) {
		jTextArea1.setText(player.getAll_skills().get(jList3.getSelectedIndex()).getDescription());
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		// 状态面板重画
		if (jList1.getSelectedIndex() == -1)
			return;
		player.getPotions()[jList1.getSelectedIndex()].Use();
		statepanel.repaint();
		// 道具面板重画
		jList1.setModel(new ListModel("药水"));
		jList1.repaint();
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		if (jList2.getSelectedIndex() == -1)
			return;
		Weapon w =player.getWeapons()[jList2.getSelectedIndex()];
		player.useWeapon(w);
		statepanel.repaint();
	
	}

	private void jButton3ActionPerformed(ActionEvent evt) {
		if (jList3.getSelectedIndex() == -1)
			return;
		Skill target = player.getAll_skills().get(jList3.getSelectedIndex());
		
		int skill_choice = new Choosedialog(player.getSkills()).getChoice();
		   if(skill_choice ==-1) return;
		Skill skill = player.getSkills()[skill_choice];
		new Textdialog(player.getName()+"忘记了"+skill.getName()+"，"+"学会了"+target.getName());
		player.SwapSkill(skill, target);
		
		statepanel.repaint();
		// 道具面板重画
		jList3.setModel(new ListModel("技能"));
		jList3.repaint();
	}

	class ListModel extends AbstractListModel {
		private String[] strings;

		public ListModel(String str) {
			if (str.equals("武器")) {
				Weapon[] weapons = Player.getInstance().getWeapons();
				int length = weapons.length;
				strings = new String[length];
				for (int i = 0; i < length; i++) {
					strings[i] = weapons[i].getName();
				}
			} else if (str.equals("药水")) {
				Potion[] potions = Player.getInstance().getPotions();
				int length = potions.length;
				strings = new String[length];
				for (int i = 0; i < length; i++) {
					strings[i] = potions[i].getName();
				}
			} else if (str.equals("技能")) {
				ArrayList<Skill> skills = Player.getInstance().getAll_skills();
				int length = skills.size();
				strings = new String[length];
				for (int i = 0; i < length; i++) {
					strings[i] = skills.get(i).getName();
				}
			}
		}

		@Override
		public Object getElementAt(int i) {
			// TODO Auto-generated method stub
			return strings[i];
		}

		@Override
		public int getSize() {
			// TODO Auto-generated method stub
			return strings.length;
		}
	}
}
