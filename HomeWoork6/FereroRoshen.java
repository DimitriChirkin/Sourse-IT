package HomeWoork6;

public class FereroRoshen extends Swit {
String Vid ;

public String getVid() {
	return Vid;
}

public void setVid(String vid) {
	Vid = vid;
}

public FereroRoshen(String Name, int Sugar, int Ves,String Vid ) {
	super(Name, Sugar, Ves);
	this.Vid = Vid ;
	
}
}
