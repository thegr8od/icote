package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 위에서아래로 {
    static int N;
    static Integer[] map;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new Integer[N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(map, Collections.reverseOrder());

        for(int i=0; i<map.length; i++) {
            System.out.print(map[i] +" ");
        }
    }
}
