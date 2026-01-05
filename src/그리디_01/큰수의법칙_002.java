package 그리디_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 큰수의법칙_002 {

    public int solve() {
        try{
            List<Integer> list = new ArrayList<>();
            int rs = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력. br.readLine() 마다 입력함.
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력한 값을 어떠한 기준점으로 나누어 가져올 수 있음.

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int i=0; i<N; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Collections.reverseOrder());

            int first = list.get(0);
            int second = list.get(1);

            int m = M;
            while(m > 0){
                for(int i = 0; i < K; i++){
                    rs += first;
                    m -= 1;
                }
                rs += second;
                m -= 1;
            }

            br.close();

            return rs;
        }catch (Exception e){
            throw new RuntimeException("ERROR", e);
        }
    }
}
