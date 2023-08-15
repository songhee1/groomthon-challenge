import java.io.*;
import java.util.*;
class 1일차_운동_중독_플레이어{
    public static StringTokenizer st;
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            
            int w = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            System.out.println(w+(w*r)/30);
        }
}