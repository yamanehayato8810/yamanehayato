package curriculm_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//スキャナーの初期化
		Scanner scanner = new Scanner(System.in);
		//数字の取得
		System.out.print("生徒の人数を入力してください(2以上)：");
		int input = scanner.nextInt();
		//科目の配列取得
		String[] subject = {"英語", "数学", "理科", "社会"};
		//点数の配列作成
		int[][] scores = new int[input][subject.length];
		
		//繰り返し処理
		//点数入力処理
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < subject.length; j++) {
				System.out.print((i + 1) + "人目の『" + subject[j] + "』の点数を入力してください ：");
				int score = scanner.nextInt();
				scores[i][j] = score;
			}
			System.out.println();
		}
		//人ごとの平均点出力処理
		for (int k = 0; k < input; k++) {
			double sum = 0;
			for (int l = 0; l < subject.length; l++) {
				sum += scores[k][l];
			}
			System.out.println((k + 1) + "人目の平均点は" + String.format("%.2f", sum / 4) + "です。");
		}
		System.out.println();
		//科目の平均点出力処理
		for (int m = 0; m < subject.length; m++) {
			double sum = 0;
			for (int n = 0; n < input; n++) {
				sum += scores[n][m];
			}
			System.out.println(subject[m] + "の平均点は" + String.format("%.2f", sum / input) + "です。");
		}
		//全体の平均点出力処理
		double sum = 0;
		for (int o = 0; o < input; o++) {
			for (int p = 0; p < subject.length; p++) {
				sum += scores[o][p];
			}
		}
		System.out.println("全体の平均点は" + String.format("%.2f", sum / (input * subject.length)) + "です。");

	}

}
