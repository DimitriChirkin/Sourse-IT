package HomeWoork6;

public class Candi extends Swit {
	String TypeCandy ;

	public String getTypeCandy() {
		return TypeCandy;
	}

	public void setTypeCandy(String typeCandy) {
		TypeCandy = typeCandy;
	}

	public Candi (String Name , int Sugar , int Ves , String TypeCandy) {
		 super (Name, Sugar,Ves) ;
		 this.TypeCandy=TypeCandy ;

}
	}
