package com.pb.quickhit;

import java.util.Scanner;

public class Player {
	int levelNo;//玩家当前级别号
	int currScore;//玩家当前级别积分
	long startTime;//当前级别开始时间
	int elapsedTime;//当前级别已用时间
	
	
	public Player() {
		super();
	}


	public Player(int levelNo, int currScore, long startTime, int elapsedTime) {
		super();
		this.levelNo = levelNo;
		this.currScore = currScore;
		this.startTime = startTime;
		this.elapsedTime = elapsedTime;
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


	public int getElapsedTime() {
		return elapsedTime;
	}


	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	//玩游戏的方法
	public void play() {
		Game game=new Game(this);
		Scanner input=new Scanner(System.in);
		for(int i=0;i<LevelParam.levels.length;i++) {
			//循环一次就晋级一次
			this.levelNo+=1;
			//清空分数和重置时间
			this.currScore=0;
			this.startTime=System.currentTimeMillis();//获取系统当前时间
			for(int j=0;j<LevelParam.levels[getLevelNo()-1].strTime;j++){
				//循环次数为各级别输出字符串的次数
				//逐次比较输入输出
				String out=game.printStr();
				System.out.print("请输入：");
				String in=input.next();
				game.printResult(in, out);
			}
		}
		
		
	}
}
