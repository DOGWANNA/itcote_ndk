package 주요알고리즘이론과실전문제_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 왕실의나이트_002 {
    public int solve(){
        try{
            int result = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String steps = st.nextToken();

            char[] arr = steps.toCharArray();

            char h = arr[0];
            char v = arr[1];

            if(h){

            }

            int N = Integer.parseInt(st.nextToken());

            return result;
        }catch (Exception e){
            throw new RuntimeException("Error", e);
        }
    }
}
