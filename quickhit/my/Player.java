package com.pb.quickhit.my;

import java.util.Scanner;

public class Player {
	int levelNo;//级别号
	int currScore;//当前分数
	long startTime;//开始时间
	int elspsedTime;//花费时间

	public Player(int levelNo, int currScore, long startTime, int elspsedTime) {
		super();
		this.levelNo = levelNo;
		this.currScore = currScore;
		this.startTime = startTime;
		this.elspsedTime = elspsedTime;
	}

	public Player() {
		super();
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getCurrScore() {
		return currScore;
	}

	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getElspsedTime() {
		return elspsedTime;
	}

	public void setElspsedTime(int elspsedTime) {
		this.elspsedTime = elspsedTime;
	}

	public void play() {
		Game game=new Game(this);
		for(int i=0;i<LevelParam.levels.length;i++) {
			//晋级成功，级别自动+1
			levelNo++;
			startTime=System.currentTimeMillis();
			currScore=0;
			for(int j=0;j<LevelParam.levels[levelNo-1].getStrTimes();j++) {
				String out=game.printStr();
				Scanner input =new Scanner(System.in);
				System.out.print("请输入：");
				String in=input.next();
				game.printResult(in, out);
			}
			
		}
		System.out.println("您已闯过所有关卡！");
		System.exit(1);
	}

}
