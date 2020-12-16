package sample ;

public class DiceSystem {
	
	
	//フィールド＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿
	
	int diceSum  ;
	int diceSum2 ;

	//＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿
	
	
	//
	public void diceRoll(){
		
	System.out.println("2～4個の整数を入力してください");
	
	}
	
	//xDyのダイスロール
	public void diceRoll(int diceX , int diceY ){
		
		diceSum = 0 ;
		
		for (int i = 0 ; i < diceX ; i++ ) {
			
			int diceSpot = 1 + (int)( Math.random() * diceY );
			
			diceSum += diceSpot ;
			
			System.out.println( ( i + 1 ) + "回目の出目は 「" + diceSpot + "」 でした" );
		}
		
		System.out.println( "\n" +diceX + "D" + diceY +" の合計は「" + diceSum + " 」でした。\n");
		
	}
	
	
	
	//xDy + z のダイスロール
	public void diceRoll(int diceX , int diceY , int diceZ){
		
		diceSum = 0 ;
		
		for (int i = 0 ; i < diceX ; i++ ) {
			
			int diceSpot = 1 + (int)( Math.random() * diceY );
			
			diceSum += diceSpot ;
			
			System.out.println( ( i + 1 ) + "回目の出目は 「" + diceSpot + "」 でした" );
		}
		
		System.out.println("\n" + diceX + "D" + diceY +" + " + diceZ + " の合計は「" +( diceSum +  diceZ ) +" 」でした。\n");
		
	}
	
	//xDy + yDu のダイスロール
	public void diceRoll( int diceX , int diceY , int diceZ , int diceU){

		diceSum = 0 ;	
		
			for (int i = 0 ; i < diceX ; i++ ) {
			
			int diceSpot = 1 + (int)( Math.random() * diceY );
			
			diceSum += diceSpot ;
			
			System.out.println( ( i + 1 ) + "回目の出目は 「" + diceSpot + "」 でした" );
		}

		System.out.println( diceX + "D" + diceY +" の合計は「" + diceSum + " 」でした。\n");

			
			for (int i = 0 ; i < diceZ ; i++ ) {
			
			int diceSpot = 1 + (int)( Math.random() * diceU );
			
			diceSum2 += diceSpot ;
			
			System.out.println( ( i + 1 ) + "回目の出目は 「" + diceSpot + "」 でした" );
		}
			
		System.out.println( "\n" +diceZ + "D" + diceU +" の合計は「" + diceSum2 + " 」でした。\n");


		
		System.out.println( diceX + "D" + diceY + " + " + diceZ + "D"+ diceU +" の合計は「" + ( diceSum + diceSum2 ) + " 」でした。\n");
		
	}
}


		
