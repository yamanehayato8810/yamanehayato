package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	static void textOut(String text, int number) {
		System.out.println(text + number);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	static void value(int number1, int number2) {
		System.out.println(number1 * number2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	static void numberOut(int[] arrayNum) {
		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum.length == i + 1) {
	            System.out.println(arrayNum[i]);
	        }
	        else {
	        	System.out.print(arrayNum[i]);
	        }
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	static void value(double number1, double number2) {
		System.out.println(number1 + number2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	static int[] printRandomNumber(int count) {
		Random random = new Random();
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = random.nextInt(100) + 1;
			if(i == (numbers.length - 1)) {
				System.out.print(numbers[i]);
			}
			else {
				System.out.print(numbers[i] + ",");
			}
		}
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	static double average(int[] result) {
		double sum = 0;
		for (double num : result) {
			sum += num;
		}
		double averageResult = sum / (double) result.length;
		System.out.println(averageResult);
		return averageResult;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	static boolean isBoolean(double averageAnser) {
		return averageAnser >= 50;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//Q1
		textOut("Hello JavaSE ", 11);

		//Q2
		value(5, 5);

		//Q3
		int[] pArrayNum = { 1, 2, 3, 4 };
		numberOut(pArrayNum);
		
		//Q4
		value(1.2, 1.5);
		
		//Q5
		int[] result = printRandomNumber(4);
		//確認用
		System.out.println(Arrays.toString(result));
		
		//Q6
		double averageResult = average(result);
		
		//Q7
		if (isBoolean(averageResult)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}
