package com.pb.quickhit;

public class Level {
	int levelNo;//各级别号
	int strLength;//各级别一次输出字符串的长度
	int strTime;//各级别输出字符串的次数
	int timeLimit;//各级别闯关的时间限制
	int perScore;//各级别正确输入一次的得分

	public Level() {
		super();
	}

	public Level(int levelNo, int strLength, int strTime, int timeLimit, int perScore) {
		super();
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTime = strTime;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
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

	public int getStrTime() {
		return strTime;
	}

	public void setStrTime(int strTime) {
		this.strTime = strTime;
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
