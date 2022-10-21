package recensement;

public class Region implements Comparable<Region>{

	String regCode;
	String regName;
	int regPop;
	
	public Region(String regCode, String regName) {
		super();
		this.regCode = regCode;
		this.regName = regName;
		
	}
	
	

	@Override
	public String toString() {
		return "Region [regCode=" + regCode + ", regName=" + regName + ", regPop=" + regPop + "]";
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

	public int getRegPop() {
		return regPop;
	}

	public void setRegPop(int regPop) {
		this.regPop = regPop;
	}

	@Override
	public int compareTo(Region o) {
		if (this.regPop>o.regPop)
		{
			return -1;
		}
		if (this.regPop>o.regPop)
		{
			return +1;
		}
		return 0;
	}


	
}
