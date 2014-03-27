package pack;

import java.util.Random;

public class Patient {
	private boolean status;					
	private Illness[] arr;
	int index;
	private int n;		//number of illnesses
	private int[] medcarta;
	public void setResults(int[] results, int end){
		for(int i=index; i<end; ++i){
			medcarta[i]=results[i-index];
		}
		index+=end;
	}
	public int[] getResults(){
		return medcarta;
	}
	public Patient(){status=true;}
	public int getNumberOfIllnesses(){
		return n;
	}
	public Illness[] getIllnesses(){
		return arr;
	}
	//private Symptoms[] arr2;
	//private int nSymptoms;
	/*public Symptoms[] getSymptoms(){
		return arr2;
	}*/
	public Patient ( Illness[] arr1){
		status=false;
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
			//System.out.println(arr[i]);
		}
		for(int i=0; i<n; ++i){
			for(int j=0; j<arr[i].getLength(); ++j){
					++index;
			}
		}
		medcarta=new int[index];
		index=0;
	}
}
