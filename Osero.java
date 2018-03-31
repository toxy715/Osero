// オセロ
public class Osero {
    // 盤面の表示
    // ・１行目に, ８こマスを表示させる
    // ・８マスを8行表示させる
    // ・ゲームの初期盤面をつくる
    //   初期盤面は真ん中に黒と白の駒を置いた状態
    public void board_display() {
	String[][] board = new String[8][8];
	// ８マスを8行作る
	for (int y = 0; y < 8; y++) {
	    for (int x = 0; x < 8; x++) { // 一行目に8個マスを作る
		board[x][y] = "□";
	    }
	}

	// 初期盤面を作る
	board[3][3] = "○";
	board[4][3] = "●";
	board[3][4] = "●";
	board[4][4] = "○";
	System.out.println("黒(●)が先手です。");
	for (int y = 0; y < 8; y++) {
	    for (int x = 0; x < 8; x++) {
		System.out.print(board[x][y]);
	    }
	    System.out.println();
	}
	
    }
    
    
    // 駒を置く
    // ・駒が置けるかどうか判定する
    // ・駒を置く場所をキーボードから入力する(xとyの値)
    // ・駒が黒か白か判定する
    // ・駒を置く
    // ・駒の表示

    // 駒をひっくり返す
    // ・駒を置いたところを出発点にする
    // ・上下左右，斜めの8方向から1つ方向を選ぶ
    // ・選んだ方向に1マスずつ移動してマスの状態を調べる
    //  調べる状態
    //   ・相手の駒があるなら，次のマスに移動する
    //   ・移動したマスに自分の駒があったら，出発点と現在のマスまでの相手の駒を自分の駒に変える
    //     → 処理を終了する
    //   ・空きマスか壁だった場合は何もせず処理を終了する
    // ・調べる処理を全8方向で行う

    // 駒が置けるかどうか判定する
    // ・盤面で空きマスを探す
    // → ・自分の駒で挟めない場合は駒は置けない
    // → ・自分の駒で挟める場合は駒は置ける
    // ・盤面で空きマスがなかったら
    //   ・お互いの駒が置けないのでゲームを終了する
    //   ・ゲーム終了の処理を行う

    // ゲーム終了の処理
    // ・ゲーム終了の最終盤面を表示
    // ・黒と白の駒の数を数える
    // ・黒が多かったら黒の勝利
    //  → ・黒の勝利です。と表示する
    // ・白が多かったら白の勝利
    //  → ・白の勝利です。と表示する

    public static void main(String[] args) {
	Osero game = new Osero();

	game.board_display();
    }
}


