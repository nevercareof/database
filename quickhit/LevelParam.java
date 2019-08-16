package com.pb.quickhit;

public class LevelParam {
	static final Level levels[] = new Level[6];
	static {
		//级别号  输出字符串长度  输出字符串的次数  时间限制  正确一次的得分 
		levels[0]=new Level(1,2,10,30,1);
		levels[1]=new Level(2,3,9,26,2);
		levels[2]=new Level(3,4,8,22,5);
		levels[3]=new Level(4,5,7,18,8);
		levels[4]=new Level(5,6,6,15,10);
		levels[5]=new Level(6,7,5,12,15);
	}
}
