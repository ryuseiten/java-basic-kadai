package kadai_015;

public class Car_Chapter15 {

	//フィールドの定義
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
			
	
//	//コンストラクタ
//	public Car_Chapter15() {
//		System.out.println("インスタンス化");
//	}
//	
	
	//メソッド
	public void gearChange( int afterGear ) {
			
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました"); 
		
		this.gear = afterGear;
		
		switch( afterGear ) {
			case 2 -> speed = 20;
			case 3 -> speed = 30;
			case 4 -> speed = 40;
			case 5 -> speed = 50;
			default -> speed = 10;
		}
		

		
	}

	public void run() {
		
		System.out.println( "速度は時速" + speed + "kmです"); 		
		
	}
	
	
	
	
	
	

}
