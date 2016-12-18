package ex;
/* Topic:公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，該如何選購獎品，使得總花費最少且不超過預算?
	說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據，
	第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， k 代表有 k 件物品可供選購。
	第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。
	對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，則列印 "Impossible"，最後必須有換行字元
 * Date: 2016/12/12
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0 ; i < n ; i++){
			int T = scn.nextInt();
			int employee = scn.nextInt();
			int kind = scn.nextInt();
			int data[] = new int [kind];
			int v1 , sum = 0;
			for(int j = 0 ; j < kind ; j++){
				data[j] = scn.nextInt();
			}
			for(int k = 0 ; k < data.length - 1 ; k++){
				for(int j = 0 ; j < data.length - 1 ; j++)
					if(data[j] > data[j + 1]){
						v1 = data[j + 1];
						data[j+1]=data[j];
						data[j]=v1;
					}
			}
			for(int s = 0 ; s < employee ; s++){
				sum = sum + data[s];
			}
			if(sum <= T){
				System.out.println(sum);
			}else{
				System.out.println("Impossible!");
			}
		}
//			int sum = 0;
//			int l = giftList.size();
//			for(int j = 0 ; j < employee ; j++){
//				sum = sum + giftList.get(l-1);
//				l--;
//			}
//			if(sum < T){
//				System.out.println(sum);
//			}else{
//				System.out.println("Impossible!");
//			}
//		}

	}
}