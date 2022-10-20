package recensement;

public class Ville {

	String regCode;
	String regName;
	String depCode;
	String comCode;
	String comName;
	int comPop;
	public Ville(String regCode, String regName, String depCode, String comCode, String comName, int comPop) {
		this.regCode = regCode;
		this.regName = regName;
		this.depCode = depCode;
		this.comCode = comCode;
		this.comName = comName;
		this.comPop = comPop;
	}
	
	public String toString()
	{
		return "La ville "+getComName();
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getDepCode() {
		return depCode;
	}
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public int getComPop() {
		return comPop;
	}
	public void setComPop(int comPop) {
		this.comPop = comPop;
	}
	
	

}
