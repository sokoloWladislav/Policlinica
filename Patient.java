package pack;

import java.util.Random;

public class Patient {
	boolean status;					
	public Patient(){status=true;}
	private Illness[] arr;
	private Symptoms[] arr2;
	public Patient ( Illness[] arr1){
		status=false;
		int n;
		Random k = new Random();
		n = k.nextInt(6);
		System.out.println("n="+n);
		arr=new Illness[n];
		int[] p=new int[n];
		for (int i=0; i<n; i++){
			Random r = new Random();
			p[i]=r.nextInt(6);
			if(i>0){
				for(int j=0; j<i; j++){
					while(p[i]==p[j]){
						Random f = new Random();
						p[i]=f.nextInt(6);
					}
				}
			}	
		}
		for (int i=0; i<n; i++){
			arr[i]=arr1[p[i]];
			System.out.println(arr[i]);
		}
	}
}
