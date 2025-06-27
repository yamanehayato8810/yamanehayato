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
		myFloat = 0f;
		myDouble = 0d;
		myChar = 'a';
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
	}

}
