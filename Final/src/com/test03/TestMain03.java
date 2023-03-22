package com.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * 주어진 String 데이터를 “,”로 구분하여 5개의 실수 데이터를 추출하고 합과 평균을 구한다.
 * 단, String 문자열의 모든 실수 데이터를 List에 저장하고 계산한다. 
 * @author ebina
 *
 */
public class TestMain03 {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		//모든 실수 데이터 List에 저장한다.
		String[] sArr = str.split(",");
		List<Double> list = new ArrayList<>();
		for(int i=0; i<sArr.length; i++) {
			list.add(Double.parseDouble(sArr[i]));
		}
		
		//List에 저장된 데이터의 합과 평균을 구한다.
		double sum = 0, avg = 0;
		
		for(Double d : list) {
			sum += d;
		}
		avg = sum / list.size();
		
		
		System.out.printf("합 계: %.3f", sum);
		System.out.println();
		System.out.printf("평 균: %.3f", avg);

	}
}
