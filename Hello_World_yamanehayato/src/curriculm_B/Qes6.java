package curriculm_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//スキャナーの初期化
		Scanner scanner = new Scanner(System.in);
		//文字列の取得
		String input = scanner.nextLine();
		//取得した文字列を配列に変換
		String[] products = input.split("、");
		//ランダム
		Random random = new Random();
		
		int tv = random.nextInt(11);

		for (String productname : products) {
			switch (productname) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + random.nextInt(11) + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + random.nextInt(11) + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + random.nextInt(11) + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + random.nextInt(11) + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + random.nextInt(11) + "台です");
				break;
			case "テレビ":
				System.out.println("テレビの残り台数は" + tv + "台です");
				System.out.println("ディスプレイの残り台数は" + (11-tv) + "台です");
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + (11-tv) + "台です");
				break;	
			default:
				System.out.println("商品が見つかりません");
			}
		}
	}
}
