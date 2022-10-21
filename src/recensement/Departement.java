package recensement;

public class Departement {

	String DepNum;
	int DepHab;
	public Departement(String depNum) {
		
		DepNum = depNum;
		
		
	}
	public String toString()
	{
		return "Le département "+getDepNum()+" a "+getDepHab();
	}
	public String getDepNum() {
		return DepNum;
	}
	public void setDepNum(String depNum) {
		DepNum = depNum;
	}
	public int getDepHab() {
		return DepHab;
	}
	public void setDepHab(int depHab) {
		DepHab = depHab;
	}
	
	
}
