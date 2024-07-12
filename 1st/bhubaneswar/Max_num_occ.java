package bhubaneswar;

import java.util.HashMap;

public class Max_num_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int ans=0;
		int[] arr= {10,20,30,10,20,10,};
		int len=arr.length;
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<len;i++) {
			int num=arr[i];
			mp.put(num, mp.getOrDefault(num, 0)+1);
			
			if (cnt<mp.get(num)) {
				ans=num;
				cnt=mp.get(num);
			}
		}
		System.out.println(mp);
		System.out.println(ans);
	}

}
