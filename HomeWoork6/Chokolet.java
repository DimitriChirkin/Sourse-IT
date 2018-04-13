package HomeWoork6;

public class Chokolet extends Swit {
private String Chok ;
 

public String getChok() {
	return Chok;
}

public void setChok(String chok) {
	Chok = chok;
}

public Chokolet (String Name , int Sugar , int Ves , String Chok) {
	 super (Name, Sugar,Ves) ;
	 this.Chok = Chok ;
 }
}
