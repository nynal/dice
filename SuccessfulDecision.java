package sample ;

public class SuccessfulDecision {
	
	
	public void judgement( int successRate ){
		
		
		//サイコロを振る(1～100)
		
		int rate =  1+(int)(Math.random()* 100);
		
		
		//成功判定________________________________________________________________________________________________
		
		System.out.println("\n★成功判定を行います★");
		
		if ( successRate < 0 || successRate >100 ){
			
			System.out.println( "※成功率は0～100で入力してください" );
			
		}else if ( rate < 6 && successRate > rate  ){
			
			System.out.println ("「クリティカル！！」 \n結果は " + rate + " でした\n" ) ;
			
		}else if ( rate >  94 && successRate < rate){
			
			System.out.println ("「ファンブル！！」 \n結果は " + rate + " でした\n" ) ;

		}else if (successRate < rate ){
			
			System.out.println ("「失敗！」 \n結果は " + rate + " でした\n(" + successRate + "以下で成功)") ;
			
		}else if (successRate > rate ){
			
			System.out.println ("「成功！」 \n結果は " + rate + " でした\n(" + successRate + "以下で成功)") ;
		
		}
		//___________________________________________________________________________________________________________
	}
}

	
