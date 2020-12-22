import java.io.BufferedReader;
import java.io.InputStreamReader;
import sample.DiceSystem ; //xDyクラスのインポート
import sample.AgainstRoll ;//対抗ロールクラスのインポート（成功判定クラスは対抗ロールクラスでインポートされている)
import sample.SuccessfulDecision ;//成功判定クラスのインポート
import sample.insanityTable ;//狂気表のインポート
 
public class Dice2 {
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	// 入力パラメータを読み込む
    	
    	
    	System.out.println("\n\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    	System.out.println("■                                                                ■");
    	System.out.println("■① 2～4個の整数：xDy xDy+z xDy+zDuダイス                        ■");
    	System.out.println("■② X ％　　　　：X%の成功判定ロール                             ■");
    	System.out.println("■③ X ： Y 　   ：XがYに対して対抗ロール                         ■");
    	System.out.println("■④ itiji 　　  :一時的狂気ロール(san5以上減少かつアイデア成功)  ■");
    	System.out.println("■⑤ hutei       :不定の狂気ロール(1時間以内にsan1/5減少)         ■");
    	System.out.println("■                                                                ■");
    	System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n\n");
		
    	
    	
    	
    	try{
    		System.out.print("①～⑤どれか入力してください:");
	    	String input = br.readLine();
			String[] param = input.split(" ");
	    	
	    	
			System.out.println( "\n_____________________[ダイスを振ります]______________________________\n" );

	    	DiceSystem dicePlay = new DiceSystem();
			
			
			int dice1 , dice2 , dice3 ,dice4 ;
	    	
	    	
	    	//一時的狂気
	    	if( param[0].equals("itiji")){
	    		insanityTable sanCheck = new insanityTable();
	    		sanCheck.temporarySanCheck();
	    	
	    		
	    	//不定の狂気
	    	}else if( param[0].equals("hutei")){
	    		insanityTable sanCheck = new insanityTable();
	    		sanCheck.indefiniteSanCheck();
	    	
	    		
	    	//成功判定
	    	}else if ( param[1].equals( "%")  ){
				SuccessfulDecision successDice = new SuccessfulDecision();
				dice1 = Integer.parseInt(param[0]) ;
				successDice.judgement(dice1);
			
			
			//対抗ロール
			}else if ( param[1].equals(":")  ||  param[1].equals("vs")){
				int against01 = Integer.parseInt(param[0]);
				int against02 = Integer.parseInt(param[2]);
				
				AgainstRoll strAgainst = new AgainstRoll();
				strAgainst.againstRoll( against01 , against02 );
	    	
	    	
	    	}else{
			
				dice1 = Integer.parseInt(param[0]) ;
				dice2 = Integer.parseInt(param[1]) ;
	    		
			//ダイスロール[xDy] or [xDy+z] or [xDy + yDu] 
				switch (param.length){
				
				case 2 : dicePlay.diceRoll( dice1 , dice2 );
					break ;
				
					
				case 3 :  dice3 = Integer.parseInt(param[2]) ;
						  dicePlay.diceRoll(dice1,dice2,dice3);
					break ;
					
					
				case 4 :  dice3 = Integer.parseInt(param[2]) ;
						  dice4 = Integer.parseInt(param[3]) ;
						  dicePlay.diceRoll(dice1,dice2,dice3,dice4);
					break ;
					
					
				default : System.out.println( "※入力値不正 \n　数字を２～４個入力してください　\n　xDy　か xDy+z　か uDx + yDzが計算可能です" );
					
					break ;
					
				}
	    	}
    		
    	}catch(ArithmeticException e){
			System.out.println("ゼロ割" + e + "が発生しました");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("インデックス範囲外指定" + e + "が発生しました");
		}catch(NumberFormatException e){
			System.out.println("入力値不正(数字ではない)" + e +"が発生しました");
		}
    		
			System.out.println( "_____________________________________________________________________" );


		}
    	
    
}
