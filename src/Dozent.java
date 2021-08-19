//Elif Nur Hancer_180503032
import java.util.ArrayList;

public class Dozent extends Person {
	
	private ArrayList<LVA> courses;
	private String TCnummer ="";

	public Dozent(String TCnummer, String name, String nachname){
		this.TCnummer = TCnummer;
		setName(name);
		setNachname(nachname);
	}
	public Dozent(String TCnummer, String name, String nachname, String emailadresse,String geburtsdatum, String geschlecht, String telefonnummer){
		this.TCnummer = TCnummer;
		setName(name);
		setNachname(nachname);
        setEmailadresse(emailadresse);
        setGeburtsdatum(geburtsdatum);
        setGeschlecht(geschlecht);
        setTelefonnummer(telefonnummer);
        this.setCourses(new ArrayList<LVA>());
	}
	
	public void setTCnummer(String TCnummer){
		this.TCnummer = TCnummer;
	}
	public String getTCnummer(){
		return this.TCnummer;
	}
	
	public ArrayList<LVA> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<LVA> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString(Dozent a){
		String str = "";
		str = str  +(a.getTCnummer() + ", " + a.getName() + " " + a.getNachname().toUpperCase());
		return str;
	}
	
	public String toSstring(Dozent obj){
		return "Name: " + obj.getName() + "\nNachname: " + obj.getNachname().toUpperCase() + "\nE-mail: " + obj.getEmailadresse() + "\nTelefonnumer: " + obj.getTelefonnummer();			
	}
	
	public boolean addCourse(LVA a, Dozent dozent){
		if (a == null || dozent.getCourses().contains(a)) {
			return false;
		}
		dozent.getCourses().add(a);
        return true;
	}
	
	public boolean dropCourse(Dozent dozent, LVA a){
		if(a == null || !dozent.getCourses().contains(a)){
			return false;
		}
		dozent.getCourses().remove(a);
		return true;
	}
	
	public String listCourses(Dozent doz){
		String str = "";
		for(LVA a : doz.courses){
			str = str + a.getLehrveranstaltungskuerzel() + ". ";
		}
		return str;
	}
	
	public boolean equals(Dozent obj, Dozent a){
			if(a.TCnummer.equals(obj.TCnummer))
				return true;
			return false;
	}
	
	public static boolean checkTC(String TC){
		if(TC.length() == 11 && Student.isNumeric(TC)== true){
			return true;
		}else
			return false;
	}
}
