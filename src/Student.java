//Elif Nur Hancer_180503032
import java.util.ArrayList;

public class Student extends Person {
	
	private ArrayList<LVA> courses;
	private String fakultaet = "";
	private String fachbereich = "";
	private String matrikelnummer = "";
	private String klasse = "";

	public Student(String matrikelnummer,String name,String nachname){
		this.matrikelnummer = matrikelnummer;
		setName(name);
		setNachname(nachname);
	}
	public Student(String matrikelnummer){
		this.matrikelnummer = matrikelnummer;	
	}
	public Student(String matrikelnummer,String name,String nachname,String emailadresse,String fakultaet,String fachbereich,String geburtsdatum,String geschlecht,String klasse,String telefonnummer){
		this.matrikelnummer = matrikelnummer;
		setName(name);
		setNachname(nachname);
        setEmailadresse(emailadresse);
        this.fakultaet = fakultaet;
        this.fachbereich = fachbereich;
        setGeburtsdatum(geburtsdatum);
        setGeschlecht(geschlecht);
       	this.klasse = klasse;
        setTelefonnummer(telefonnummer);   
		this.courses = new ArrayList<LVA>();
	}
	
	public void setMatrikelnummer(String matrikelnummer){
		this.matrikelnummer = matrikelnummer;
	}
	public String getMatrikelnummer(){
		return this.matrikelnummer;
	}
	
	public void setFakultaet(String fakultaet) {
        	this.fakultaet = fakultaet;
	}
	public String getFakultaet() {
        	return this.fakultaet;
	}
	
	public void setFachbereich(String fachbereich) {
        	this.fachbereich = fachbereich;
	}
	public String getFachbereich() {
        	return this.fachbereich;
	}
	
	public void setKlasse(String klasse) {
        	this.klasse = klasse;
	}
	public String getKlasse() {
        	return this.klasse;
	}
	public void setCourses(ArrayList<LVA> courses){
		this.courses = courses;
	}
	public ArrayList<LVA> getCourses(){
		return this.courses;
	}
	
	@Override
	public String toString(Student a){
		String str = "";
		str = str  +(a.getMatrikelnummer() + ", " + a.getName() + " " + a.getNachname().toUpperCase());
		return str;
	}
	
	public String tosString(Student obj){
		return "Name: " + obj.getName() + "\nNachname: " + obj.getNachname().toUpperCase() + "\nE-mail: " + obj.getEmailadresse() + "\nFakultaet: " + obj.getFakultaet() + "\nFachbereich: " + obj.fachbereich + "\nKlasse: " + obj.klasse;			
	}	
	
	public boolean addCourse(LVA a,Student student){
		if (a == null || student.getCourses().contains(a)) {
			return false;
		}
		student.getCourses().add(a);
        return true;
	}
	
	public boolean dropCourse(Student student, LVA a){
		if(a == null || !student.getCourses().contains(a)){
			return false;
		}
		student.getCourses().remove(a);
		return true;
	}
	
	public String listCourses(Student stud){
		String str = "";
		for(LVA a : stud.courses){
			str = str + a.getLehrveranstaltungskuerzel() + ". ";
		}
		return str;
	}
	
	public boolean equals(Student obj, Student a){
		if(a.matrikelnummer.equals(obj.matrikelnummer))
			return true;
		return false;
	}
	
	public static boolean isNumeric(String str){
	    for (char c : str.toCharArray()){
	        if (!Character.isDigit(c))
	        	return false;
	    }
	    return true;
	}
	
	public static boolean checkmatrkl(String matrkl){
		final char c = '0';
		if(matrkl.length()== 7 && matrkl.charAt(0) != c && isNumeric(matrkl)==true){
			return true;
		}else{
			return false;
		}
	}
}