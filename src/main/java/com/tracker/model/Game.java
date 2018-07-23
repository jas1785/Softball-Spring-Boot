package com.tracker.model;

public class Game {

	public int gameNumber;
	public int atBats;
	public int hits;
	public int doubles;
	public int triples;
	public int single;
	public int homeRuns;
	public int walks;
	public int strikeOuts;
	
	public int getGameNumber() {
		return gameNumber;
	}
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	public int getAtBats() {
		return atBats;
	}
	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getDoubles() {
		return doubles;
	}
	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}
	public int getTriples() {
		return triples;
	}
	public void setTriples(int triples) {
		this.triples = triples;
	}
	public int getSingle() {
		return single;
	}
	public void setSingle(int single) {
		this.single = single;
	}
	public int getHomeRuns() {
		return homeRuns;
	}
	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}
	public int getWalks() {
		return walks;
	}
	public void setWalks(int walks) {
		this.walks = walks;
	}
	public int getStrikeOuts() {
		return strikeOuts;
	}
	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}
}