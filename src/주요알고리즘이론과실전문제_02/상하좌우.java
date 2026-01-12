package 주요알고리즘이론과실전문제_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 상하좌우 {

    public String solve(){
        String result = "";

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine()); // N X M 입력

            int N = Integer.parseInt(st.nextToken()); // 공간의 크기

            st = new StringTokenizer(br.readLine()); // command

            int x = 1;
            int y = 1;

            // L R U D
            int [] commandX = {0, 0, -1, 1};
            int [] commandY = {-1, 1, 0, 0};
            String [] move_type = {"L", "R", "U", "D"};

            int commandLength = st.countTokens();

            for(int i=0; i<commandLength; i++){
                String commands = st.nextToken();

                int addX = 0;
                int addY = 0;

                for(int i2=0; i2<move_type.length; i2++){
                    if(move_type[i2].equals(commands)){
                        addX = x + commandX[i2];
                        addY = y + commandY[i2];
                    }
                }

                if(addX < 1 || addY < 1 ||
                    addX > N || addY > N){
                    continue;
                }

                x = addX;
                y = addY;
            }

            result = String.format("%s %s", x, y);
        }catch(Exception e){
            throw new RuntimeException("ERROR", e);
        }

        return result;
    }
}
