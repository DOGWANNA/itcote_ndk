package 주요알고리즘이론과실전문제_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시각 {
    public int solve(){
        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            int count = 0;
            for(int h=0; h<=N; h++){
                for(int m=0; m<60; m++){
                    for(int s=0; s<60; s++){
                        String time = h + String.valueOf(m) + s;
                        if(time.contains("3")){
                            count++;
                        }
                    }
                }
            }

            return count;
        }catch (Exception e){
            throw new RuntimeException("Error", e);
        }
    }
}
