package pack;

public class mainClass {
	public static void main(String[] args){
		Illness[] arr=new Illness[6];
		arr[0]=new Prostuda();
		arr[1]=new Allergiya();
		arr[2]=new Diabet();
		arr[3]=new Vetryanka();
		arr[4]=new Pnevmoniya();
		arr[5]=new Vich();
		Patient man= new Patient(arr);
		Doctor[] policlinica=new Doctor[6];
		policlinica[0]=new Labarant();
		policlinica[1]=new Dermatolog();
		policlinica[2]=new Hirurg();
		policlinica[3]=new Mama();
		policlinica[4]=new Terapevt();
		policlinica[5]=new DrHouse();
		for(int i=0; i<6; ++i){
			policlinica[i].explore(man);
		}
	}
}
