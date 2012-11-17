package cn.yimu.util;

import java.util.Calendar;

public class SystemUtil {

	public static String generatorEntityId() {
		Calendar calendar = Calendar.getInstance();
		String rlt = String.format("ID%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%1$tL",
				calendar);
		// System.out.println(rlt);
		System.out.println("length:\t" + rlt.length());
		return rlt;
	}

	public static void main(String[] args) {
		System.out.println(generatorEntityId());
	}
}
