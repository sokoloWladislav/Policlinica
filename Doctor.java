package pack;

abstract class Doctor {
	public abstract void explore(Patient p);
}

class Labarant extends Doctor{
	private int[] results=new int[2];
	Symptoms[] finded=new Symptoms[2];
	private int proverka(Symptoms s, Patient p, int n){
		int temp=0;
		Illness[] temp1=new Illness[n];
		temp1=p.getIllnesses().clone();
		for(int i=0; i<n; ++i){
			Symptoms[] temp2=new Symptoms[temp1[i].getLength()];
			temp2=temp1[i].getSymptoms().clone();
			for(int j=0; j<temp1[i].getLength(); ++j){
				if(temp2[j]==s){
					++temp;
				}
			}
		}
			return temp;
	}
	Labarant(){
		results[0]=0;
		results[1]=0;
		finded[0]=Symptoms.krov_S;
		finded[1]=Symptoms.krov_V;
	}
	public void explore(Patient p){
		int n=p.getNumberOfIllnesses();
		results[0]=proverka(finded[0],p,n);
		results[1]=proverka(finded[1],p,n);
		p.setResults(results, 2);
	}
}

class Dermatolog extends Doctor{
	private int[] results=new int[1];
	Symptoms[] finded=new Symptoms[1];
	private int proverka(Symptoms s, Patient p, int n){
		int temp=0;
		Illness[] temp1=new Illness[n];
		temp1=p.getIllnesses().clone();
		for(int i=0; i<n; ++i){
			Symptoms[] temp2=new Symptoms[temp1[i].getLength()];
			temp2=temp1[i].getSymptoms().clone();
			for(int j=0; j<temp1[i].getLength(); ++j){
				if(temp2[j]==s){
					++temp;
				}
			}
		}
			return temp;
	}
	Dermatolog(){
		results[0]=0;
		finded[0]=Symptoms.syp;
	}
	public void explore(Patient p){
		int n=p.getNumberOfIllnesses();
		results[0]=proverka(finded[0],p,n);
		p.setResults(results, 1);
	}
}

class Hirurg extends Doctor{
	private int[] results=new int[1];
	Symptoms[] finded=new Symptoms[1];
	private int proverka(Symptoms s, Patient p, int n){
		int temp=0;
		Illness[] temp1=new Illness[n];
		temp1=p.getIllnesses().clone();
		for(int i=0; i<n; ++i){
			Symptoms[] temp2=new Symptoms[temp1[i].getLength()];
			temp2=temp1[i].getSymptoms().clone();
			for(int j=0; j<temp1[i].getLength(); ++j){
				if(temp2[j]==s){
					++temp;
				}
			}
		}
		return temp;
	}
	Hirurg(){
		results[0]=0;
		finded[0]=Symptoms.rentgen;
	}
	public void explore(Patient p){
		int n=p.getNumberOfIllnesses();
		results[0]=proverka(finded[0],p,n);
		p.setResults(results, 1);
	}
}

class Mama extends Doctor{
	private int[] results=new int[2];
	Symptoms[] finded=new Symptoms[2];
	private int proverka(Symptoms s, Patient p, int n){
		int temp=0;
		Illness[] temp1=new Illness[n];
		temp1=p.getIllnesses().clone();
		for(int i=0; i<n; ++i){
			Symptoms[] temp2=new Symptoms[temp1[i].getLength()];
			temp2=temp1[i].getSymptoms().clone();
			for(int j=0; j<temp1[i].getLength(); ++j){
				if(temp2[j]==s){
					++temp;
				}
			}
		}
		return temp;
	}
	Mama(){
		results[0]=0;
		results[1]=0;
		finded[0]=Symptoms.temperatura_H;
		finded[1]=Symptoms.temperatura_L;
	}
	public void explore(Patient p){
		int n=p.getNumberOfIllnesses();
		results[0]=proverka(finded[0],p,n);
		results[1]=proverka(finded[1],p,n);
		p.setResults(results, 2);
	}
}

class Terapevt extends Doctor{
	private int[] results=new int[2];
	Symptoms[] finded=new Symptoms[2];
	private int proverka(Symptoms s, Patient p, int n){
		int temp=0;
		Illness[] temp1=new Illness[n];
		temp1=p.getIllnesses().clone();
		for(int i=0; i<n; ++i){
			Symptoms[] temp2=new Symptoms[temp1[i].getLength()];
			temp2=temp1[i].getSymptoms().clone();
			for(int j=0; j<temp1[i].getLength(); ++j){
				if(temp2[j]==s){
					++temp;
				}
			}
		}
		return temp;
	}
	Terapevt(){
		results[0]=0;
		results[1]=0;
		finded[0]=Symptoms.kashel;
		finded[1]=Symptoms.chikhaniye;
	}
	public void explore(Patient p){
		int n=p.getNumberOfIllnesses();
		results[0]=proverka(finded[0],p,n);
		results[1]=proverka(finded[1],p,n);
		p.setResults(results, 2);
	}
}

class DrHouse extends Doctor{
	int[] results;
	public void explore(Patient p) {
		results=p.getResults().clone();
		int sum=1;
			while(sum!=0){
				sum=0;
				for(int i=0; i<results.length; ++i){
					sum+=results[i];
				}
				if(results[3]!=0 && results[4]!=0 && results[6]!=0){
					results[3]-=1;
					results[4]-=1;
					results[6]-=1;
					System.out.println("Pnevmonia");
				}
		
				if(results[4]!=0 && results[6]!=0){
					results[4]-=1;
					results[6]-=1;
					System.out.println("Prostuda");
				}
		
				if(results[2]!=0 && results[7]!=0){
					results[2]-=1;
					results[7]-=1;
					System.out.println("Chihanie");
				}

				if(results[0]!=0 && results[5]!=0){
					results[0]-=1;
					results[5]-=1;
					System.out.println("Diabet");
				}
		
				if(results[2]!=0 && results[4]!=0){
					results[2]-=1;
					results[4]-=1;
					System.out.println("Vetryanka");
				}
				if(results[1]!=0 && results[5]!=0){
					results[1]-=1;
					results[5]-=1;
					System.out.println("Vich");
				}
			}
		}
}