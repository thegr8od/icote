package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탈출 {
    static int N,M;
    static int[][] map;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++){
            String num = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = num.charAt(j) -'0';
            }
        }

        bfs(0,0);
        System.out.println(map[N-1][M-1]);

    }

    static void bfs(int x, int y){

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x,y});

        while (!queue.isEmpty()) {

            int[] data = queue.poll();
            x = data[0];
            y = data[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] == 1) {
                        map[nx][ny] = map[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

    }

}
