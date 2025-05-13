package kadai_018;

abstract public class Kato_Chapter18 {
	
	//フィールド
	//姓
	public String familyName;
	//名前
	public String givenName;
	//住所
	public String address;
	
	
	//メソッド
	//共通の紹介
	public void commonIntroduce(String familyName, String givenName){
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = "東京都中野区〇×";
		
	}
	
	//個別紹介
	abstract public void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

}
