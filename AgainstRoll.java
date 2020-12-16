
package sample;

import sample.SuccessfulDecision; // 成功判定クラスのインポート


public class AgainstRoll {
	
	
	
	SuccessfulDecision againstRoll01 = new SuccessfulDecision ();
	
	
	public void againstRoll( int a , int b ){
		
		System.out.println("\n★対抗ロールを行います  " + a + " : " + b + "  ★" );
		
		int against = 50 + (( a - b ) * 5 );
		
		againstRoll01.judgement( against ) ;
		
	}
}

