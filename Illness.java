package pack;

enum Symptoms{temperatura_H, temperatura_L, kashel, chikhaniye, rentgen, syp, krov_S, krov_V};

public abstract class Illness{
	public abstract Symptoms[] getSymptoms();
}

class Prostuda extends Illness{
	private Symptoms[] s=new Symptoms[2];
	public Prostuda(){
	s[0]=Symptoms.temperatura_H;
	s[1]=Symptoms.kashel;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Allergiya extends Illness{
	private Symptoms[] s=new Symptoms[2];
	public Allergiya(){
		s[0]=Symptoms.syp;
		s[1]=Symptoms.chikhaniye;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Diabet extends Illness{
	private Symptoms[] s=new Symptoms[2];
	public Diabet(){
		s[0]=Symptoms.temperatura_L;
		s[1]=Symptoms.krov_S;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Vetryanka extends Illness{
	private Symptoms[] s=new Symptoms[2];
	public Vetryanka(){
		s[0]=Symptoms.temperatura_H;
		s[1]=Symptoms.syp;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Pnevmoniya extends Illness{
	private Symptoms[] s=new Symptoms[3];
	public Pnevmoniya(){
		s[0]=Symptoms.temperatura_H;
		s[1]=Symptoms.kashel;
		s[2]=Symptoms.rentgen;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Vich extends Illness{
	private Symptoms[] s=new Symptoms[2];
	public Vich(){
		s[0]=Symptoms.temperatura_L;
		s[1]=Symptoms.krov_V;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}
