package curriculm_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int ij = i * j;
				//2桁に満たない場合0をつける処理
				String i2 = String.format("%02d", i);
				String j2 = String.format("%02d", j);
				String ij2 = String.format("%02d", ij);
				// 掛け算の結果を表示
				if (j == 9) {
					System.out.print(i2 + " * " + j2 + " = " + ij2);
				} else {
					System.out.print(i2 + " * " + j2 + " = " + ij2 + " || ");
				}
				
			}
			// 改行
			System.out.println();
			System.out.println();
		}

	}

}
