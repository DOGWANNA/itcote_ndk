package 주요알고리즘이론과실전문제_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 왕실의나이트_002 {
    public int solve(){
        try{
            int result = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String step = st.nextToken();

            char[] arr = step.toCharArray();

            int x = arr[0] - 'a' + 1; // 1 ~ 8
            int y = arr[1] - '0';     // 1 ~ 8


            // 검색의 경우에는 검색 방향을 List에 담아두고 반복문으로 검색한다.
            List<int[]> steps = new ArrayList<>();
            steps.add(new int[]{-2,-1});
            steps.add(new int[]{-1,-2});
            steps.add(new int[]{1, -2});
            steps.add(new int[]{2, -1});
            steps.add(new int[]{2, 1});
            steps.add(new int[]{1, 2});
            steps.add(new int[]{-1, 2});
            steps.add(new int[]{-2, 1});

            for(int[] s : steps){
                int next_x = x + s[0];
                int next_y = y + s[1];

                if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8) {
                    result++;
                }
            }

            return result;
        }catch (Exception e){
            throw new RuntimeException("Error", e);
        }
    }
}
