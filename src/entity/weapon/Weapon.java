
package entity.weapon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import entity.Player;
import entity.Character;


public abstract class Weapon {
	protected String name;
	protected String description="";
	protected String type;
    protected int strength;
	
	
	public Weapon () {	}
	
	public  abstract  void attack_someone(Character c);
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public boolean equals(Object obj) {
		Weapon w = (Weapon)obj;
		return this.getName().equals(w.getName());
	}
	
	
	
	
	
       }

