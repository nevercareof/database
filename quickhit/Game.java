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
			int rand = random.nextInt(strLength); // ���������
			//���������ƴ���ַ���
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
		return buffer.toString();//�޷�ֱ�ӷ���buffer����Ҫ��buffer�ַ�����
	}
	
	//�Ƚ��û������ַ����ͼ��������ַ����Ƿ����
	public void printResult(String input,String output) {
		boolean isTrue=false;
		if(input.equals(output)) {
			isTrue=true;
		}
		if(isTrue) {
			long currentTime = System.currentTimeMillis();//System.currentTimeMillis()�����Ժ���Ϊ��λ�ĵ�ǰʱ��
			if ((currentTime - player.getStartTime()) / 1000  // �����ʱ
			        >LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("������̫���ˣ��Ѿ���ʱ���˳���");
				System.exit(1);
			}else {
				//������һ���
				player.setCurrScore(player.getCurrScore()
						+ LevelParam.levels[player.getLevelNo() - 1].getPerScore());
				// 1.2.2�� ��������ʱ��
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				// 1.2.3�������ǰ���֡���ǰ��������ʱ��
				System.out.println("������ȷ�����ļ���"+ player.getLevelNo()+" ,���Ļ���" + player.getCurrScore() + ",����ʱ��"	+ player.getElapsedTime() + "�롣");
				// 1.2.4���ж��û��Ƿ��Ѿ��������һ��
				if (player.getLevelNo() == (LevelParam.levels.length)) {
					int score=LevelParam.levels[LevelParam.levels.length-1].getPerScore() 
							* LevelParam.levels[LevelParam.levels.length-1].getStrTime();//���㴳�ط���
					if (player.getCurrScore() == score) {
						System.out.println("���Ѵ��سɹ�����Ϊ�������֣���ϲ�㣡����");
						System.exit(0);
					}
				}
			}

			
		}else {
			System.out.println("�������");
			System.exit(1);//ϵͳ�˳�
		}
	}

}
