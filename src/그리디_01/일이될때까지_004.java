package 그리디_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 일이될때까지_004 {

    public int solve() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine()); // N K 입력

            int N = Integer.parseInt(st.nextToken()); // 기준점
            int K = Integer.parseInt(st.nextToken()); // 나눌 숫자

            int result = 0;

            while (true){
                if(N == 1){
                    break;
                }

                if(N % K == 0){
                    N = N / K;
                }else{
                    N -= 1;
                }
                result++;
            }
            return result;
        }catch (Exception e){
            throw new RuntimeException("Error", e);
        }
    }
}
