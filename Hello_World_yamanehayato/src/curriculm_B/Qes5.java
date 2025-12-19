package curriculm_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {
				int ji = j * i;
				//3桁に満たない場合0をつける処理and掛け算を表示
				if (j == 20) {
					System.out.printf("%03d * %03d = %03d", i, j, ji);
				} else {
					System.out.printf("%03d * %03d = %03d || ", i, j, ji);
				}

			}
			// 改行
			System.out.println();
			System.out.println();
		}
	}

}
