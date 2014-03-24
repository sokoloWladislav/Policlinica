package pack;

public class mainClass {
	public static void main(String[] args){
		Illness[] arr=new Illness[6];
		Prostuda p=new Prostuda();
		arr[0]=p;
		Allergiya a=new Allergiya();
		arr[1]=a;
		Diabet d=new Diabet();
		arr[2]=d;
		Vetryanka v=new Vetryanka();
		arr[3]=v;
		Pnevmoniya pn=new Pnevmoniya();
		arr[4]=pn;
		Vich vi=new Vich();
		arr[5]=vi;
		 
		Patient man= new Patient(arr);	
		}
}
