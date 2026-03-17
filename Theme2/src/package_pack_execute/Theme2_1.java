/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package package_pack_execute;

import package_pack_process.Theme2_2;

public class Theme2_1 {

	public static void main(String[] args) {
		Theme2_2 obj = new Theme2_2();
		String textHello = obj.hello;
		String textFood = obj.food;
		String textAboutFood = obj.aboutFood;
		String printNow = obj.now;
		
		System.out.println(textHello);
		System.out.println(textFood);
		System.out.println(textAboutFood);
		System.out.println(printNow);
	}
}
