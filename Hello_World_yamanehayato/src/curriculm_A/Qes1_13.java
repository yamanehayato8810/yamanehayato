package curriculm_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//1
		byte myByte;
		short myShort;
		long myLong;
		int myInt;
		float myFloat;
		double myDouble;
		char myChar;
		String myString;
		boolean myBoolean;

		//2
		myByte = 0;
		myShort = 0;
		myLong = 0;
		myInt = 0;
		myFloat = 0.0f;
		myDouble = 0.0d;
		myChar = '\u0000';
		myString = null;
		myBoolean = false;
		
		//3
		myByte = 10;
		myShort = 100;
		myLong = 1000;
		myInt = 10000;
		myFloat = 9.5f;
		myDouble = 10.5d;
		myChar = 'a';
		myString = "ハロー";
		myBoolean = true;
		
		//4
		long sum = myByte + myShort + myLong + myInt;
		System.out.println(sum);
		
		int result = myByte + myByte;
		System.out.println(result);
		
		String helloText = myChar + " " + myString + " " + myBoolean;
		System.out.println(helloText);
		
		double a = myFloat + myDouble;
		int b = (int)a;
		long result1 = myByte + myShort + myLong + myInt + b;
		System.out.println(result1);
		
		long result2 = myByte * myShort * myLong * myInt;
		System.out.println(result2);
		
		double result3 = myDouble / myShort;
		System.out.println(result3);
		
		int result4 = myByte - myShort;
		System.out.println(result4);
		
		//5
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		
		//6
		String name = "山田太郎";
		int age = 18;
		double high = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		System.out.println("「初めまして"+name+"です」");
		System.out.println("「年齢は"+age+"歳です」");
		System.out.println("「身長は"+high+"cmです」");
		System.out.println("「体重は"+weight+"kgです」");
		System.out.println("「好きな食べ物は"+food+"です」");
		
		//7
		double m = high / 100;
		double m2 = m * m;
		double bmi = weight / m2;
		System.out.println("「BMIは"+String.format("%.1f", bmi)+"です」");
		
		//8
		name = "鈴木一郎";
		age = 24;
		high = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+high+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		m = high / 100;
		m2 = m * m;
		bmi = weight / m2;
		System.out.println("BMIは"+String.format("%.1f", bmi)+"です");
		
		//9
		age = age * 2;
		high = high * 2;
		weight = weight * 2;
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+high+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		m = high / 100;
		m2 = m * m;
		bmi = weight / m2;
		System.out.println("BMIは"+String.format("%.1f", bmi)+"です");
		
		//10
		String anser = (age/2 >= 25) ? "true" : "false";
		System.out.println(anser);
		
		//11
		String str1 = String.valueOf(age/2);
		String str2 = String.valueOf(high/2);
		String str3 = String.valueOf(weight/2);
		System.out.println(str1 + str2 + str3);
		
		//12
		int c = (int)age;
		int d = (int)high;
		System.out.println(c/2);
		System.out.println(d/2);
		
		//13
		String anser2 = (age/2 >= 25 || high/2 >= 160) ? "true" : "false";
		System.out.println(anser2);
		
	}

}
