package sample;

public class insanityTable {
	
	public void temporarySanCheck(){
		
		int diceSpot = 1 + (int)( Math.random() * 10 );
		System.out.println( "★一時的狂気判定★\n1D10の結果は「" + diceSpot +  "」でした(1d10＋4ラウンドまたは1d6*10＋30分)\n" );
	
		switch(diceSpot){
		
			case 1 :System.out.println("気絶あるいは金切り声の発作");break;
			case 2 :System.out.println("パニック状態で逃げ出す");break;
			case 3 :System.out.println("肉体的なヒステリーあるいは感情の噴出(大笑い、大泣きなど)");break;
			case 4 :System.out.println("早口でぶつぶつ言う意味不明の会話あるいは多弁症(一貫した会話の奔流)");break;
			case 5 :System.out.println("探索者をその場に釘づけにしてしまうかもしれないような極度の恐怖症");break;
			case 6 :System.out.println("殺人癖あるいは自殺癖");break;
			case 7 :System.out.println("幻覚あるいは妄想");break;
			case 8 :System.out.println("反響動作あるいは反響言語(探索者は周りの者の動作あるいは発言を反復する)");break;
			case 9 :System.out.println("奇妙なもの、異様なものを食べたがる(泥、粘着物、人肉など)");break;
			case 10 :System.out.println("昏迷(胎児のような姿勢をとる、物事を忘れる)あるいは緊張症(我慢する\nことはできるが意思も興味もない。強制的に単純な行動をとらせることはできるが、自発的に行動することはない)");
				break;
			default : 
				break;
		}
	}
	
	
	
	public void indefiniteSanCheck(){
	
		int diceSpot = 1 + (int)( Math.random() * 10 );
		System.out.println("★不定の狂気判定★\n1D10の結果は「" + diceSpot + "」でした(1d10*10時間)\n");

			switch(diceSpot){
		
			case 1 :System.out.println("健忘症(親しい者のことを最初に忘れる。言語や肉体的な技能は働くが、知的な技能は働かない)あるいは昏迷/緊張症(短期の一時的狂気の表を参照))");break;
			case 2 :System.out.println("激しい恐怖症(逃げ出すことはできるが、恐怖の対象はどこへ行っても見える)");break;
			case 3 :System.out.println("幻覚");break;
			case 4 :System.out.println("奇妙な性的嗜好(露出症、過剰性欲、奇形愛好症など)");break;
			case 5 :System.out.println("フェティッシュ(探索者はある物、ある種類の物、人物に対し異常なまでに執着する)");break;
			case 6 :System.out.println("制御不能のチック、震え、あるいは会話や文章で人と交流することができなくなる");break;
			case 7 :System.out.println("心因性視覚障害、心因性難聴、単数あるいは複数の四肢の機能障害");break;
			case 8 :System.out.println("短期的の心因反応(支離滅裂、妄想、常軌を逸した振る舞い、幻覚など)");break;
			case 9 :System.out.println("一時的偏執症");break;
			case 10 :System.out.println("強迫観念に取り付かれた行動(手を洗い続ける、祈る、特定のリズムで歩く、割れ目をまたがない、銃を絶え間なくチェックし続けるなど)");break;
			default : 
				break;
		}
	}
}
