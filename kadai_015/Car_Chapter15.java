package kadai_015;

public class Car_Chapter15 {

	//フィールドの定義
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	
	//メソッド
	public void gearChange( int afterGear ) {
		
		switch( afterGear ) {
		
			case 2 -> {
				System.out.println( "ギア1から" + afterGear + "に切り替えました"); 
				speed = 20;
			}
			case 3 -> {
				System.out.println( "ギア1から" + afterGear + "に切り替えました");
				speed = 30;
			}
			case 4 -> {
				System.out.println( "ギア1から" + afterGear + "に切り替えました");
				speed = 40;
			}
			case 5 -> {
				System.out.println( "ギア1から" + afterGear + "に切り替えました");
				speed = 50;
			}
			default -> {
				System.out.println( "ギア1から" + afterGear + "に切り替えました");
				speed = 10;
			}
		}
	}

	
	public void run() {
		
		System.out.println( "速度は時速" + speed + "kmです"); 		
		
	}
	
	
	
	
	
	

}
