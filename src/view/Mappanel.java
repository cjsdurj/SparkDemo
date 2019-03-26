
package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import entity.Player;


//地图类

public class Mappanel extends JPanel implements KeyListener {

	int[][] map = new int[20][20];// 地图数组


	Image image_front = (new ImageIcon("./util/人物面" + ".png")).getImage();// 人物图标
	Image image_back = (new ImageIcon("./util/人物背" + ".png")).getImage();
	Image image_right = (new ImageIcon("./util/人物右" + ".png")).getImage();
	Image image_left = (new ImageIcon("./util/人物左" + ".png")).getImage();

	Image image = image_front; // 初始方向

	Image image0 = (new ImageIcon("./util/草地.png")).getImage();
	Image image1 = (new ImageIcon("./util/森林.png")).getImage();
	Image image2 = (new ImageIcon("./util/众山.png")).getImage();
	Image image3 = (new ImageIcon("./util/海洋.png")).getImage();
	Image image4 = (new ImageIcon("./util/树桩.png")).getImage();
	Image image5 = (new ImageIcon("./util/花.png")).getImage();

	int x = 5, y = 5; // 人物图标的坐标

	Statepanel statepanel;
	Player player;

	public Mappanel(Statepanel statepanel) {
		this.player = Player.getInstance();
		x = player.getX();
		y = player.getY();

		map = this.getMap();

		setLocation();// 确定主角坐标

		this.statepanel = statepanel;
		this.setBounds(0, 0, 600, 600);
	}

	public void paintComponent(Graphics g) {
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++)
				switch (map[i][j]) {
				case 0:
					g.drawImage(image0, i * 30, j * 30, this);
					break;
				case 1:
					g.drawImage(image1, i * 30, j * 30, this);
					break;
				case 2:
					g.drawImage(image2, i * 30, j * 30, this);
					break;
				case 3:
					g.drawImage(image3, i * 30, j * 30, this);
					break;
				case 4:
					g.drawImage(image4, i * 30, j * 30, this);
					break;
				case 5:
					g.drawImage(image5, i * 30, j * 30, this);
					break;
				}
		g.drawImage(image, x * image.getWidth(this), y * (image.getHeight(this) - 30) - 30, this);

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_DOWN:
			y++;
			if (y * (image.getHeight(this) - 30) > 570)
				y--;
			else if (map[x][y] != 0 & map[x][y] != 5)
				y--;
			else {
				image = image_front;
				if(map[x][y]==5) {
					int rand = (int)(Math.random()*8);
					if (rand<2) {
						this.repaint();
						Fightdialog fight =  new Fightdialog();
						statepanel.repaint(); break;
					}
				}
			}
			break;

		case KeyEvent.VK_UP:
			y--;
			if (y < 0)
				y++;
			else if (map[x][y] != 0 & map[x][y] != 5)
				y++;
			else {
				image = image_back;
				if(map[x][y]==5) {
					int rand = (int)(Math.random()*8);
					if (rand<2) {
						this.repaint();
						Fightdialog fight =  new Fightdialog();
						statepanel.repaint(); break;
					}
				}
			}
			break;

		case KeyEvent.VK_RIGHT:
			x++;
			if (x * image.getWidth(this) > 570)
				x--;
			else if (map[x][y] != 0 & map[x][y] != 5)
				x--;
			else {
				image = image_right;
				if(map[x][y]==5) {
					int rand = (int)(Math.random()*8);
					if (rand<2) {
						this.repaint();
						Fightdialog fight =  new Fightdialog();
						statepanel.repaint(); break;
					}
				}
			}
			break;

		case KeyEvent.VK_LEFT:
			x--;
			if (x < 0)
				x++;
			else if (map[x][y] != 0 & map[x][y] != 5)
				x++;
			else {
				image = image_left;
				if(map[x][y]==5) {
					int rand = (int)(Math.random()*100);
					if (rand<15) {
						this.repaint();
						Fightdialog fight =  new Fightdialog();
						statepanel.repaint(); break;
					}
				}
			}
			break;

		case KeyEvent.VK_ENTER:
			setEnter();
		}

		setLocation();
		this.repaint();

	}

	public void setEnter() {
	
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void setLocation() {
		this.player.setX(x);
		this.player.setY(y);
	}

	public int[][] getMap() {
		int[][] map = { { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },

				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 2 },
				{ 2, 3, 3, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 2 },

				{ 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 5, 5, 0, 0, 0, 3, 3, 3, 3, 0, 0, 4, 4, 4, 0, 0, 2 },
				{ 2, 0, 5, 5, 5, 0, 0, 0, 3, 3, 3, 3, 4, 4, 4, 0, 0, 0, 0, 2 },

				{ 2, 0, 5, 5, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
				{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },

		};
		int[][] res = new int[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				res[i][j] = map[j][i];
			}
		}

		return res;
	}
}
