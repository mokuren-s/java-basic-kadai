package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	// メソッドの変更
	public void setGivenName() {
		this.givenName = "一郎"; // 一郎を割り当てる
	}
	
	// 抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
