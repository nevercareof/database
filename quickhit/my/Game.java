package com.pb.quickhit.my;

import java.util.Random;

public class Game {
	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public String printStr() {
		Random random = new Random();
//		StringBuffer buffer = new StringBuffer();
		String str="";
		for (int i = 0; i < LevelParam.levels[player.levelNo - 1].getStrLength(); i++) {
			int rand = random.nextInt(LevelParam.levels[player.levelNo - 1].getStrLength());
			switch (rand) {
			case 0:
				str+="<";
//				buffer.append("<");
				break;
			case 1:
				str+=">";
//				buffer.append(">");
				break;
			case 2:
				str+="!";
//				buffer.append("!");
				break;
			case 3:
				str+="*";
//				buffer.append("*");
				break;
			case 4:
				str+="?";
//				buffer.append("?");
				break;
			case 5:
				str+="/";
//				buffer.append("/");
				break;
			case 6:
				str+="|";
//				buffer.append("|");
				break;
			}
		}
//		System.out.println(buffer);
		System.out.println(str);
		return str;
//		return buffer.toString();
	}

	public void printResult(String in, String out) {
		if (in.equals(out)) {
			long time = System.currentTimeMillis();
			if (((time - player.getStartTime()) / 1000) > LevelParam.levels[player.levelNo - 1].getTimeLimit()) {
				System.out.println("您输入的太慢了，已超时！");
				System.exit(1);
			} else {
				// 计算用户积分
				player.setCurrScore(player.getCurrScore() + LevelParam.levels[player.getLevelNo() - 1].getPerScore());
				// 计算用户所用时间
				player.setElspsedTime((int) ((time - player.getStartTime()) / 1000));
				System.out.println("输入正确，当前级别:" + player.getLevelNo() + "，当前积分:" + player.getCurrScore() + "，已用时间:"
						+ player.getElspsedTime());
			}
		} else {
			System.out.println("输入错误！");
			System.exit(1);
		}
	}

}
