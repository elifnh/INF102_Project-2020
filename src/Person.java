//Elif Nur Hancer_180503032
public class Person {
	
	private String name = "";
	private String nachname = "";
	private String emailadresse = "";
	private String geburtsdatum = "";
	private String geschlecht = "";
	private String telefonnummer = "";

	public void setName(String name) {
        this.name = name;
	}
	public String getName() {
        return this.name;
	}
	public void setNachname(String nachname) {
        this.nachname = nachname;
	}
	public String getNachname() {
        return this.nachname;
	}
	
	public void setEmailadresse(String emailadresse) {
    	this.emailadresse = emailadresse;
	}
	public String getEmailadresse() {
    	return this.emailadresse;
	}
	
	public void setGeburtsdatum(String geburtsdatum) {
    	this.geburtsdatum = geburtsdatum;
	}
	public String getGeburtsdatum() {
    	return this.geburtsdatum;
	}
	
	public void setGeschlecht(String geschlecht) {
    	this.geschlecht = geschlecht;
	}
	public String getGeschlecht() {
   		return this.geschlecht;
	}
	
	public void setTelefonnummer(String telefonnummer) {
    	this.telefonnummer = telefonnummer;
	}
	public String getTelefonnummer() {
    	return this.telefonnummer;
	}
	
	public String toString(Student a) {
		return null;
	}
	public String toString(Dozent a) {
		return null;
	}
}
