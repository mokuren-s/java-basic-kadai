package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// 英単語の辞書として機能するHashMapを宣言
	HashMap<String,String> dictionary = new HashMap<String,String>();
			
	public Dictionary_Chapter21() {
		// 辞書としての要素の追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	// 辞書で調べてその結果を出力する
	public void lookUpWords (String[] wordsArray) {
		for (String word : wordsArray) {
			if ( dictionary.containsKey(word)) {
				System.out.println( word + "の意味は" + dictionary.get(word));
			} else {
				System.out.println( word + "は辞書に存在しません");
			}
		}
	}
			
}