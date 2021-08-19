//Elif Nur Hancer_180503032
import java.util.ArrayList;

public class LVA {
	
	private ArrayList<Student> students;
	private ArrayList<Dozent> dozents;
	private String lehrveranstaltungskuerzel = "";
	private String stunde = "";
	
	public LVA(String lehrveranstaltungskuerzel, String stunde){
		this.lehrveranstaltungskuerzel = lehrveranstaltungskuerzel;
		this.stunde = stunde;
		this.students = new ArrayList<Student>();
		this.dozents = new ArrayList<Dozent>();
	}
	
	public void setLehrveranstaltungskuerzel(String lehrveranstaltungskuerzel){
		this.lehrveranstaltungskuerzel = lehrveranstaltungskuerzel;
	}
	public String getLehrveranstaltungskuerzel(){
		return this.lehrveranstaltungskuerzel;
	}
	
	public void setStunde(String stunde) {
		this.stunde = stunde;
	}
	public String getStunde() {
		return stunde;
	}
	
	public ArrayList<Student> getStudents(){
		return this.students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public ArrayList<Dozent> getDozents() {
		return dozents;
	}

	public void setDozents(ArrayList<Dozent> dozents) {
		this.dozents = dozents;
	}
	
	public String toString(LVA a){
		String str = "";
		str = str  +(a.getLehrveranstaltungskuerzel() + ", " + a.getStunde() + " Stunden");
		return str;
	}
	
	public String toSstring(LVA obj){
		return "Lehrveranstaltung: " + obj.getLehrveranstaltungskuerzel();	
	}
	
	public boolean addStudent(Student student,LVA a){
		if (student == null || a.getStudents().contains(student)) {
			return false;
		}
		a.getStudents().add(student);
        return true;
	}
	
	public boolean dropStudent(Student student, LVA a){
		if(student == null || !a.getStudents().contains(student)){
			return false;
		}
		a.getStudents().remove(student);
		return true;
	}
	
	public String listStudents(LVA a){
		String str = "";
		for(Student st : a.students){
			str = str + st.getMatrikelnummer() + ". ";
		}
		return str;
	}
	
	public boolean addDozent(Dozent dozent, LVA a){
		if(dozent == null || a.getDozents().contains(dozent)){
			return false;
		}
		a.getDozents().add(dozent);
		return true;
	}
	
	public boolean dropDozent(Dozent dozent, LVA a){
		if(dozent == null || !a.getDozents().contains(dozent)){
			return false;
		}
		a.getDozents().remove(dozent);
		return true;
	}
	
	public String listDozents(LVA a){
		String str = "";
		for(Dozent doz : a.dozents){
			str = str + doz.getTCnummer() + ". ";
		}
		return str;
	}
	
	public boolean equals(LVA obj, LVA a){	
		if(a.lehrveranstaltungskuerzel.equals(obj.lehrveranstaltungskuerzel))
			return true;
		return false;
	}
	
	public static boolean checklva(String vorlesung){
		if(vorlesung.length() == 6){
			for(int i=0;i<3;i++){
				if(Character.isUpperCase(vorlesung.charAt(i)) != true){
					return false;
				}
			}for(int j=3;j<6;j++){
				if(Character.isDigit(vorlesung.charAt(j)) != true){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
}
