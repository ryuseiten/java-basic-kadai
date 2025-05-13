package kadai_018;

abstract public class Kato_Chapter18 {
	
	//フィールド
	//姓
	public String familyName = "加藤";
	//名前
	public String givenName;
	//住所
	public String address = "東京都中野区〇×";
	
	
	//メソッド
	//共通の紹介
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です");
 		System.out.println("住所は" + address + "です");
		
	}
	
	//個別紹介
	abstract public void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
