package com.pb.quickhit;

import java.util.Random;

import com.pb.quickhit.LevelParam;

public class Game {
	Player player;
	
	
	
	public Game() {
		super();
	}

	public Game(Player player) {
		this.player = player;
	}

	public String printStr() {
		int strLength=LevelParam.levels[player.getLevelNo()-1].strLength;
		Random random = new Random();
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<strLength;i++) {
			int rand = random.nextInt(strLength); // 产生随机数
			//根据随机数拼接字符串
			switch(rand) {
			case 0:
				buffer.append("<");
				break;
			case 1:
				buffer.append(">");
				break;
			case 2:
				buffer.append("?");
				break;
			case 3:
				buffer.append("|");
				break;
			case 4:
				buffer.append("@");
				break;
			case 5:
				buffer.append("#");
				break;
			case 6:
				buffer.append("!");
				break;
			}
		}
		System.out.println(buffer);
		return buffer.toString();//无法直接返回buffer，需要把buffer字符串化
	}
	
	//比较用户输入字符串和计算机输出字符串是否相等
	public void printResult(String input,String output) {
		boolean isTrue=false;
		if(input.equals(output)) {
			isTrue=true;
		}
		if(isTrue) {
			long currentTime = System.currentTimeMillis();//System.currentTimeMillis()返回以毫秒为单位的当前时间
			if ((currentTime - player.getStartTime()) / 1000  // 如果超时
			        >LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("你输入太慢了，已经超时，退出！");
				System.exit(1);
			}else {
				//计算玩家积分
				player.setCurrScore(player.getCurrScore()
						+ LevelParam.levels[player.getLevelNo() - 1].getPerScore());
				// 1.2.2、 计算已用时间
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				// 1.2.3、输出当前积分、当前级别、已用时间
				System.out.println("输入正确，您的级别"+ player.getLevelNo()+" ,您的积分" + player.getCurrScore() + ",已用时间"	+ player.getElapsedTime() + "秒。");
				// 1.2.4、判断用户是否已经闯过最后一关
				if (player.getLevelNo() == (LevelParam.levels.length)) {
					int score=LevelParam.levels[LevelParam.levels.length-1].getPerScore() 
							* LevelParam.levels[LevelParam.levels.length-1].getStrTime();//计算闯关分数
					if (player.getCurrScore() == score) {
						System.out.println("你已闯关成功，成为绝世高手，恭喜你！！！");
						System.exit(0);
					}
				}
			}

			
		}else {
			System.out.println("输入错误！");
			System.exit(1);//系统退出
		}
	}

}
