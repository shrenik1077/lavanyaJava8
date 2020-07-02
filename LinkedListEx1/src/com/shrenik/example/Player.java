package com.shrenik.example;

public class Player implements Comparable{

	private int playercode;
	private String playername;
	private int totalruns;

	public Player()
	{}
	
	public Player(int playercode, String playername, int totalruns) {
		super();
		this.playercode = playercode;
		this.playername = playername;
		this.totalruns = totalruns;
	}
	
	

	public int getPlayercode() {
		return playercode;
	}

	public String getPlayername() {
		return playername;
	}

	public int getTotalruns() {
		return totalruns;
	}

	@Override
	public String toString() {
		return "Player [playercode=" + playercode + ", playername=" + playername + ", totalruns=" + totalruns + "]";
	}

	
	// Sort Players order by total_runs
	
	
	@Override
	public int compareTo(Object o) {
		Player another = (Player)o;
		//System.out.println("\n current object = " + this + "\t another object = " + another);
		
		if(this.totalruns > another.getTotalruns())
			return 1;
		else if(this.totalruns < another.getTotalruns())
			return -1;
		else
			return 0;
	}
}
