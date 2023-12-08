package array_sample;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//基礎
		
		// 配列にモンスターのインスタンスを格納する方法
		// まずは、基礎となる配列の生成とモンスターのインスタンスの作成

		// 要素の数が３つのMonster型の配列を生成 中身はnull（空っぽ）
		Monster[] monsters = new Monster[3];
		// 次にモンスター型のはインスタンスを3体生成
		Monster monster1 = new Monster("モンスター1");
		Monster monster2 = new Monster("モンスター2");
		Monster monster3 = new Monster("モンスター3");

		//monsters配列にインスタンスを代入
		monsters[0] = monster1;
		monsters[1] = monster2;
		monsters[2] = monster3;
		
		//配列の中にモンスター型のインスタンスが入っているか確認
		//拡張for文を使うことで、配列の中身をすべて取り出すことが出来る。
		// for( 配列から取り出した要素を入れる変数 : 取り出したい配列 ）
		for(Monster m : monsters) {
			System.out.println(m.name);
		}
		
		//応用
		
		//配列の中にランダムにモンスター型のインスタンスを格納する方法
		//すこし発展して、基礎でやった配列の生成とインスタンスの格納をランダムに行う
		
		//モンスターインスタンスを生成する数を乱数で生成（今回は最大4体）
		int random = new Random().nextInt(1,4);
		
		//インスタンスを入れる配列を定義
		Monster[] monsters2 = new Monster[random];
		
		//randomの数だけ繰り返すfor文を書く
		for(int i = 0; i < random; i++) {
			//生成した空の配列にモンスターインスタンスを代入する
			monsters2[i] = new Monster("スライム");
		}
		
		//配列の中にモンスター型のインスタンスが入っているか確認
		for(Monster m : monsters2) {
			System.out.println(m.name);
		}
	}
}
