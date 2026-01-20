package 주요알고리즘이론과실전문제_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 게임개발_003 {
    public int solve(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            // 현위치, 방향
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][M];

            int[][] d = new int[N][M];

            // 현재 위치 방문처리
            d[x][y] = 1;

            // 전체 맵 초기화
            for (int a=0; a<N; a++){
                st = new StringTokenizer(br.readLine());
                for(int b=0; b<M; b++){
                    arr[a][b] = Integer.parseInt(st.nextToken());
                }
            }

            // 두개 배열의 요소를 합쳐서 북,동,남,서 방향을 의미
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            // 현 위치

            // 시뮬레이션 시작
            int count = 1;
            int turn_time = 0;

            while(true){
                // 왼쪽으로 회전
                direction = turn_left(direction);

                // 2개 배열의 요소를 합쳐서 방향을 설정
                int nx = x + dx[direction];
                int ny = y + dy[direction];

                // 가보지 않은 곳이고, 육지면 이동. 육지 == 0 / 바다 == 1
                if(d[nx][ny] == 0 && arr[nx][ny] == 0){
                    // 가본 곳으로 수정
                    d[nx][ny] = 1;

                    // 현 위치 업데이트
                    x = nx;
                    y = ny;

                    // 방문 칸수 증가
                    count += 1;

                    // 회전 횟수 초기화
                    turn_time = 0;

                    continue;
                }
                // 회전한 이후 가보지 않은 칸이 없거나, 바다인 경우
                else {
                    turn_time += 1;
                }

                // 네방향 모두 갈 수 없는 경우
                if (turn_time == 4){
                    nx = x - dx[direction];
                    ny = y - dy[direction];
                    // 뒤로 갈 수 있는 경우 이동
                    if (arr[nx][ny] == 0){
                        x = nx;
                        y = ny;
                    }
                    // 이동 할 수 없으면 끝
                    else{
                        break;
                    }
                    turn_time = 0;
                }
            }


            return count;
        }catch (Exception e){
            throw new RuntimeException("Error", e);
        }
    }

    private int turn_left(int direction){
        direction -= 1;
        if(direction == -1){
            direction = 3;
        }

        return direction;
    }
}
