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
package package_pack_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2_2 {
	public String hello;
	public String food;
	public String aboutFood;
	public String now;
	
	
	public Theme2_2(){
		this.hello = "こんにちは！ここは日本です！";
		this.food = "この寿司はうまい";
		this.aboutFood = "寿司は和食です";
		LocalDateTime localNow = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		this.now = localNow.format(formatter);
	}
}
