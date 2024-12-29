package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
        
        // Scannerクラスのオブジェクトを生成する
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // 正しい手が入力されるまで繰り返す
        while (true) {
        	// じゃんけんの手となる入力内容を改行区切りで取得
            input = scanner.nextLine();
        	// 入力内容を判定して処理を分岐
        	if (input.equals("r") || input.equals("s") || input.equals("p")) {
        		break;
        	} else {
        		System.out.println("もう一度、じゃんけんの手を入力してください。");
        	}
        }
        scanner.close();
        return input;
        
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] jankenArray = new String[] {"r", "s", "p"};
		String random = jankenArray[(int) Math.floor(Math.random() * 3)];
		return random;
	}
	
	// じゃんけんを行うメソッド
    public void playGame() {
        // HashMapの宣言,要素の追加
    	HashMap<String,String> janken = new HashMap<String,String>();

        janken.put("r", "グー");
        janken.put("s", "チョキ");
        janken.put("p", "パー");
        
        // 自分と対戦相手のじゃんけんの手を取得
        String myChoice = getMyChoice();
        String yourHand = getRandom();
        
        // お互いに出した手を表示
        System.out.println("自分の手は" + janken.get(myChoice)
                    + ",対戦相手の手は" + janken.get(yourHand));
        
        // 自分と対戦相手の手を比較して」結果を出力
        if (myChoice.equals(yourHand)) {
        	System.out.println("あいこです");
        } else if ((myChoice.equals("r") && yourHand.equals("s")) ||
        		   (myChoice.equals("s") && yourHand.equals("p")) ||
        		   (myChoice.equals("p") && yourHand.equals("r"))) {
        	System.out.println("自分の勝ちです");
        } else {
        	System.out.println("自分の負けです");
        	
        }
    }
}
