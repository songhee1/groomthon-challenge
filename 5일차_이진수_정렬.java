import java.io.*;
import java.util.*;
class Pair{
	int x;
	int two;
	Pair(int x, int two){
		this.x = x;
		this.two = two;
	}
}
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Pair> list = new ArrayList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int []arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(st.nextToken());
			
			int mok = -1;
			int namo = -1;
			int sum = 0;
			int tmp = arr[i];
			
			while(mok != 0 && mok != 1){
				mok = tmp/2;
				namo = tmp%2;
				
				tmp = mok;
				
				if(mok == 1) sum++;
				if(namo == 1) sum++;
			}
			
			list.add(new Pair(arr[i], sum));
		}
		
		Collections.sort(list, new Comparator<Pair>(){
			@Override
			public int compare(Pair o1, Pair o2){
				if(o1.two == o2.two){
					return o2.x-o1.x;
				}else
					return o2.two-o1.two;
			}
		});
		
		System.out.println(list.get(k-1).x);
	}
}