package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//フィールド
	String input;
	String handsResult;
	
/////getMyChoice
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//Scanncerクラスのオブジェクト作成、入力、クローズ
		Scanner scanner = new Scanner(System.in); 
		input = scanner.next(); 	
		scanner.close(); 
		
		//r、s、pの場合とそれ以外で切り分け
		if( input.equals("r") || input.equals("s") || input.equals("p") ) {
			//System.out.println(input);
			return input;
		}else {
			System.out.println("エラー：再度実行してください。");
			return null;
		}
	}
/////getMyChoice
	
	
/////getRandom
	public String getRandom() {
		
		//乱数の作成＋端数切り捨て
		double cpuHand = Math.random() * 3;
		cpuHand = Math.floor(cpuHand);
		//System.out.println(cpuHand);
		
		//配列にじゃんけんの手をセット
		String[] hands = { "r", "s", "p"};
		
		//乱数で対戦相手のじゃんけんの手を選ぶ
		handsResult = hands[(int)cpuHand];
		//System.out.println(handsResult);
				
		return handsResult;	
	}
/////getRandom

	
	
/////playGame
	public void playGame() {
		
		//HashMapの作成
		HashMap<String, String> handsMap = new HashMap<String, String>();
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		//じゃんけんの手を出力	
		input = handsMap.get(input);
		handsResult = handsMap.get(handsResult);
		
		//System.out.println("自分:" + input);		
		//System.out.println("相手:" + handsResult);
		
		System.out.println("自分の手は" + input + ",対戦相手の手は" + handsResult);
		
		if( input.equals(handsResult)) {
			System.out.println("あいこです");
		}else if( input.equals("グー") && handsResult.equals("チョキ")) {
			System.out.println("自分の勝ちです");
		}else if( input.equals("チョキ") && handsResult.equals("パー")) {
			System.out.println("自分の勝ちです");
		}else if( input.equals("パー") && handsResult.equals("グー")) {
			System.out.println("自分の勝ちです");
		}else if( input.equals("グー") && handsResult.equals("パー")) {
			System.out.println("自分の負けです");
		}else if( input.equals("チョキ") && handsResult.equals("グー")) {
			System.out.println("自分の負けです");
		}else if( input.equals("パー") && handsResult.equals("チョキ")) {
			System.out.println("自分の負けです");
		}
	}
}
