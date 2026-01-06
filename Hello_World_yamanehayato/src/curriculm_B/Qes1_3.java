package curriculm_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		//スキャナーの初期化
		Scanner scanner = new Scanner(System.in);

		boolean judge = true;

		while (judge) {
			System.out.println("文字列を入力してください: ");
			// 文字列を取得
			String input = scanner.nextLine();
			// 文字列の判定
			if (input == null || input.length() <= 0) {
				System.out.println("名前を入力してください");
			} else if (input.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			} else if (!input.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名「" + input + "」を登録しました");
				judge = false;
			}
		}

		Random random = new Random();

		//手の選択肢
		String[] hands = { "グー", "チョキ", "パー" };

		System.out.println("じゃんけんゲームを始めます！");
		System.out.println("0: グー, 1: チョキ, 2: パー");

		//じゃんけんカウント回数
		int i = 0;
		//繰り返し処理
		while (true) {
			i++;
			int userHand;
			while (true) {
				while (true) {
					System.out.print("あなたの手を選んでください: ");
					String input = scanner.nextLine();
					if (input.matches("\\d+")) { // 正規表現で数字のみチェック
						userHand = Integer.parseInt(input);
						break;
					} else {
						System.out.println("エラー: 数字以外が入力されました。");
					}
				}
				if (userHand > 2) {
					System.out.println("2以下の数字を入力してください");
				} else {
					break;
				}
			}
			int computerHand = random.nextInt(3);

			System.out.println("あなたの手: " + hands[userHand]);
			System.out.println("コンピュータの手: " + hands[computerHand]);

			//勝敗判定
			if (userHand == computerHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if (userHand == 1 && computerHand == 0) {
				System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
			} else if (userHand == 2 && computerHand == 1) {
				System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
			} else if (userHand == 0 && computerHand == 2) {
				System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
			} else {
				System.out.println("やるやん。次は俺にリベンジさせて");
				break; //ループを終了
			}

		}

		scanner.close();

		System.out.println("勝つまでにかかった合計回数は" + i + "回です");
	}

}
