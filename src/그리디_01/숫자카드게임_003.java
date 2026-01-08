package 그리디_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드게임_003 {

    public int solve(){
        try{
            int result = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine()); // N X M 입력

            int N = Integer.parseInt(st.nextToken()); // 가로 길이
            int M = Integer.parseInt(st.nextToken()); // 세로 길이

            int[][] cards = new int[N][M];

//            for(int x=0; x<N; x++){
//                st = new StringTokenizer(br.readLine());
//
//                for(int y=0; y<M; y++){
//                    cards[x][y] = Integer.parseInt(st.nextToken());
//                }
//            }
//
//            for(int x=0; x<N; x++){
//                Arrays.sort(cards[x]);
//
//                if(cards[x][0] > result){
//                    result = cards[x][0];
//                }
//            }
            for (int x = 0; x < N; x++) {
                st = new StringTokenizer(br.readLine());

                int rowMin = Integer.MAX_VALUE;

                for (int y = 0; y < M; y++) {
                    int value = Integer.parseInt(st.nextToken());
                    rowMin = Math.min(rowMin, value);
                }

                result = Math.max(result, rowMin);
            }

            return result;
        }catch (Exception e){
            throw new RuntimeException("ERROR",e);
        }
    }
}
