package HomeWoork6;

public class Jvachka extends Swit {
	String vkus ;
	public String getVkus() {
		return vkus;
	}
	public void setVkus(String vkus) {
		this.vkus = vkus;
	}
	public Jvachka(String Name, int Sugar, int Ves, String vkus) {
		super(Name, Sugar, Ves);
		this.vkus = vkus ; 
		
	}

}
