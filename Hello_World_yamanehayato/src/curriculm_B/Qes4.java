package curriculm_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int ij = i * j;
				// 2桁に満たない場合0をつける処理and掛け算の表示
				if (j == 9) {
					System.out.printf("%02d * %02d = %02d", i, j, ij);
				} else {
					System.out.printf("%02d * %02d = %02d || ", i, j, ij);
				}
				
			}
			// 改行
			System.out.println();
			System.out.println();
		}

	}

}
