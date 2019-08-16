package com.pb.quickhit.my;

public class Level {
	private int levelNo;//级别号
	private int strLength;//一次输出字符串的长度
	private int strTimes;//各级别输出字符串的次数
	private int timeLimit;//时间限制
	private int perScore;//每一次得分

	public Level(int levelNo, int strLength, int strTimes, int timeLimit, int perScore) {
		super();
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}

	public Level() {
		super();
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

	public int getStrTimes() {
		return strTimes;
	}

	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}

	public int getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public int getPerScore() {
		return perScore;
	}

	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}

}
