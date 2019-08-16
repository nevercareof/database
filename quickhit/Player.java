package com.pb.quickhit;

import java.util.Scanner;

public class Player {
	int levelNo;//��ҵ�ǰ�����
	int currScore;//��ҵ�ǰ�������
	long startTime;//��ǰ����ʼʱ��
	int elapsedTime;//��ǰ��������ʱ��
	
	
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

	//����Ϸ�ķ���
	public void play() {
		Game game=new Game(this);
		Scanner input=new Scanner(System.in);
		for(int i=0;i<LevelParam.levels.length;i++) {
			//ѭ��һ�ξͽ���һ��
			this.levelNo+=1;
			//��շ���������ʱ��
			this.currScore=0;
			this.startTime=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
			for(int j=0;j<LevelParam.levels[getLevelNo()-1].strTime;j++){
				//ѭ������Ϊ����������ַ����Ĵ���
				//��αȽ��������
				String out=game.printStr();
				System.out.print("�����룺");
				String in=input.next();
				game.printResult(in, out);
			}
		}
		
		
	}
}
