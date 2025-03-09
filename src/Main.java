import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N,M,ans;
    static int[][] map;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for(int i =0; i<N;i++){
            String num = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = num.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0){
                    dfs(i,j);
                    ans++;
                }
            }
        }

        System.out.println(ans);



    }

    static void dfs(int x, int y){
        map[x][y] =1;
        for(int i =0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<N && ny>=0 && ny<M){
                if(map[nx][ny]!=1){
                    dfs(nx,ny);
                }
            }
        }
    }

}