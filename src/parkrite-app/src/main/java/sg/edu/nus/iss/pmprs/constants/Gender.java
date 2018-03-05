package sg.edu.nus.iss.pmprs.constants;

public enum Gender {
	
	M("M",true),
	F("F",false);
	
	private String name;
	private boolean value;
	private Gender(String name,boolean value)
	{
	 this.name=name;
	 this.value=value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}

}
