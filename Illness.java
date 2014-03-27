package pack;

enum Symptoms{temperatura_H, temperatura_L, kashel, chikhaniye, rentgen, syp, krov_S, krov_V};

public abstract class Illness{
	public abstract Symptoms[] getSymptoms();
	abstract public int getLength();
}

class Prostuda extends Illness{
	private int length=2;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
	public Prostuda(){
	s[0]=Symptoms.temperatura_H;
	s[1]=Symptoms.kashel;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Allergiya extends Illness{
	private int length=2;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
	public Allergiya(){
		s[0]=Symptoms.syp;
		s[1]=Symptoms.chikhaniye;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Diabet extends Illness{
	private int length=2;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
	public Diabet(){
		s[0]=Symptoms.temperatura_L;
		s[1]=Symptoms.krov_S;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Vetryanka extends Illness{
	private int length=2;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
	public Vetryanka(){
		s[0]=Symptoms.temperatura_H;
		s[1]=Symptoms.syp;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}

class Pnevmoniya extends Illness{
	private int length=3;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
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
	private int length=2;
	private Symptoms[] s=new Symptoms[length];
	public int getLength(){
		return length;
	}
	public Vich(){
		s[0]=Symptoms.temperatura_L;
		s[1]=Symptoms.krov_V;
	}
	public Symptoms[] getSymptoms(){
		return s;
	}
}
