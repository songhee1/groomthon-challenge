import java.io.*;
import java.util.*;
class 2일차_프로젝트_매니징 {
	public static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int h, m;
		st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i = 0;i<n;i++){
			sum += Integer.parseInt(br.readLine());
		}
		
		int hr = sum / 60;
		int min = sum % 60;
		
		h += hr;
		m += min;
		
		h+=m/60;
		m = m%60;
		
		h = h%24;
		
		System.out.println(h+" "+m);
	}
}