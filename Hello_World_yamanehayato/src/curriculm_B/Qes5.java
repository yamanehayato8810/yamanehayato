package curriculm_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九の計算
				for (int i = 1; i <= 9; i++) {
					for (int j = 1; j <= 20; j++) {
						int ji = j * i;
						//3桁に満たない場合0をつける処理
						String i2 = String.format("%03d", i);
						String j2 = String.format("%03d", j);
						String ji2 = String.format("%03d", ji);
						// 掛け算の結果を表示
						if (j == 20) {
							System.out.print(j2 + " * " + i2 + " = " + ji2);
						} else {
							System.out.print(j2 + " * " + i2 + " = " + ji2 + " || ");
						}
						
					}
					// 改行
					System.out.println();
					System.out.println();
				}
	}

}
