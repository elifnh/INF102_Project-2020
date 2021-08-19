//Elif Nur Hancer_180503032
import java.util.ArrayList;

public class Universitaet {
	private int n = 0;
	private int m = 0;
	private int mn = 0;
	Student stu = new Student("1","2","3");
	Dozent doz = new Dozent("","","");
	LVA lva = new LVA("","");
	
	final static String uniName = "TAU"; 
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Dozent> dozents = new ArrayList<Dozent>();
	ArrayList<LVA> vorlesungen = new ArrayList<LVA>();
	
	public Universitaet(String uniName){
	}
	
	public boolean addStudent(String matrikelnummer,String name,String nachname,String emailadresse,String fakultaet,String fachbereich,String geburtsdatum,String geschlecht,String klasse,String telefonnummer){
		
		Student u = new Student(matrikelnummer,name,nachname,emailadresse,fakultaet,fachbereich,geburtsdatum,geschlecht,klasse,telefonnummer);
		//wenn matrikelnummer der neuen Student gleich mit andere, wird sie nicht hinzugefügt.
		if(stuEquals(u)== false){
			students.add(u);
			n = students.size();
			return true;
		}else
			return false;
	}
	
	public boolean addDozent(String TCnummer, String name, String nachname, String emailadresse,String geburtsdatum, String geschlecht, String telefonnummer){
		
		Dozent v = new Dozent(TCnummer,name,nachname,emailadresse,geburtsdatum,geschlecht,telefonnummer);
		if(dozEquals(v)== false){
			dozents.add(v);
			m = dozents.size();
			return true;
		}else
			return false;
	}
	
	public boolean addLVA(String lehrveranstaltungskuerzel, String stunde){
		
		LVA w = new LVA(lehrveranstaltungskuerzel, stunde);
		if(lvaEquals(w)== false){
			vorlesungen.add(w);
			mn = vorlesungen.size();
			return true;
		}else
			return false;
	}
	
	public void stuList(){
		for(Student a : students){
			System.out.println(stu.toString(a));
		}
	}
	
	public void dozList(){
		for(Dozent a : dozents){
			System.out.println(doz.toString(a));
		}
	}
	
	public void lvaList(){
		for(LVA a : vorlesungen){
			System.out.println(lva.toString(a));
		}
	}

	public boolean stuEquals(Student u){
		for(Student a : students){
			if(stu.equals(a,u)== true){
				return true;
			}	
		}return false;
	}
	
	public boolean dozEquals(Dozent v){
		for(Dozent a : dozents){
			if(doz.equals(a,v)== true){
				return true;
			}
		}return false;
	}
	
	public boolean lvaEquals(LVA w){
		for(LVA a : vorlesungen){
			if(lva.equals(a,w) == true){
				return true;
			}
		}return false;
	}
	
	public String stuSuchen(String matrikel){
		String s = "";
		if(students.size()>0){
			boolean bool = false;
			for(int i=0;i<students.size();i++){
				if(matrikel.equals(students.get(i).getMatrikelnummer())){
					s = stu.toString(students.get(i));
					bool = true;
				}
			}
			if(bool == true){
				return s;
			}else
				return "Student existiert nicht./Falsche Eingabe.";
		}else
			return "Student existiert nicht./Falsche Eingabe.";
	}

	public String dozSuchen(String tcnummer){
		String s = "";
		if(dozents.size()>0){
			boolean boold = false;
			for(int i=0;i<dozents.size();i++){
				if(tcnummer.equals(dozents.get(i).getTCnummer())){					
					s = doz.toString(dozents.get(i));
					boold = true;
				}
			}
			if(boold == true){
				return s;
			}else
				return "Dozent existiert nicht./Falsche Eingabe.";
		}else
			return "Dozent existiert nicht./Falsche Eingabe.";
	}
	
	public String lvaSuchen(String kuerzel ){
		String s = "";
		if(vorlesungen.size()>0){
			boolean booll = false;
			for(int i=0;i<vorlesungen.size();i++){
				if(kuerzel.equals(vorlesungen.get(i).getLehrveranstaltungskuerzel())){
					s = lva.toString(vorlesungen.get(i));
					booll = true;
				}
			}
			if(booll == true){
				return s;
			}else	
				return "Lehrveranstaltung existiert nicht./Falsche Eingabe.";
		}else
			return "Lehrveranstaltung existiert nicht./Falsche Eingabe.";
	}
	
	public void stuLoeschen(String matrikel){
		int t = n;
		if(students.size()>0){
			for(int i=0;i<students.size();i++){
				if(matrikel.equals(students.get(i).getMatrikelnummer())){
					students.remove(i);
					n = n-1;
					System.out.println("Student ist geloescht.");
				}
			}
			//ob keine Student geloescht; 
			if(t == n){
				System.out.println("Student existiert nicht.");
			}
    	}else{
			System.out.println("Student existiert nicht.");
    	}
	}
	
	public void dozLoeschen(String tcnummer){
		int k = m;
		if(dozents.size()>0){
			for(int i=0;i<dozents.size();i++){
				if(tcnummer.equals(dozents.get(i).getTCnummer())){
					dozents.remove(i);
					m = m-1;
					System.out.println("Dozent ist geloescht.");
				}
			}
			//ob keine Dozent geloescht; 
			if(k == m){
				System.out.println("Dozent existiert nicht.");
			}
		}else{
    		System.out.println("Dozent existiert nicht.");
        }
	}
	
	public void lvaLoeschen(String kuerzel){
        int l = mn;
		if(vorlesungen.size()>0){
			for(int i=0;i<vorlesungen.size();i++){
				if(kuerzel.equals(vorlesungen.get(i).getLehrveranstaltungskuerzel())){
					vorlesungen.remove(i);
					mn = mn-1;
					System.out.println("Lehrveranstaltung ist geloescht.");
				}
			}
			//ob keine Lehrveranstaltung geloescht; 
			if(l == mn){
				System.out.println("Lehrveranstaltung existiert nicht.");
			}
		}else{
    		System.out.println("Lehrveranstaltung existiert nicht.");
        }
	}
	
	public boolean addCourse(String matrikel, String course){
		boolean check = true , checks = true, end = false;
		for(int i=0;i<students.size();i++){
			if(matrikel.equals(students.get(i).getMatrikelnummer())){
				check = false;
				for(LVA a : vorlesungen){
					if(course.equals(a.getLehrveranstaltungskuerzel())){
						checks = false;
						if((lva.addStudent(students.get(i),a)) && (stu.addCourse(a, students.get(i)))){
							//"Angemeldet."
							end = true;
							break;
						}else
							end = false;
    						//"Student existiert in diser LVA."
					}	
				} if(checks == true){
				//"Falsche  Eingabe."
					end = false;
				}
			}
		} 
		if(check == true){
			//"Student existiert nicht."
			end = false;
		}
		return end;
	}
	
	public boolean dropCourse(String matrikel, String coursed){
		boolean check = true , checks = true, end = false;
		for(int i=0;i<students.size();i++){
			if(matrikel.equals(students.get(i).getMatrikelnummer())){
				check = false;
				for(LVA a : vorlesungen){
					if(coursed.equals(a.getLehrveranstaltungskuerzel())){
						checks = false;
						if(lva.dropStudent(students.get(i),a) && stu.dropCourse(students.get(i), a)){
							//abgemeldet.
							end = true;
							break;
						}else
							end = false;
    						//Student existiert in diser LVA nicht.
					}
				}
				if(checks == true){
					end = false;
					//Falsche  Eingabe.
				}
			}
    	}
		if(check == true){
			end = false;
    		//Student existiert nicht.
		}
    	return end;
	}
	
	public boolean dozZuweisen(String tcnum, String coursedoz){
		boolean check = true , checks = true, end = false;
		for(int i=0;i<dozents.size();i++){
			if(tcnum.equals(dozents.get(i).getTCnummer())){
				check = false;
				for(LVA a : vorlesungen){
					if(coursedoz.equals(a.getLehrveranstaltungskuerzel())){
						checks = false;
						if(lva.addDozent(dozents.get(i),a) && (doz.addCourse(a, dozents.get(i)))){
							end = true;
							//"Zugewiesen."
							break;
						}else
							end = false;
    						//"Dozent existiert in diser LVA."
					}	
				}
				if(checks == true){
				end = false;
				//"Falsche  Eingabe."
				}
			}
		}
		if(check == true){
			end = false;
			//"Dozent existiert nicht."
		}
		return end;
	}
	
	public boolean dozDrop(String tcnum, String coursedozd){
		boolean check = true , checks = true, end = false;
		for(int i=0;i<dozents.size();i++){
			if(tcnum.equals(dozents.get(i).getTCnummer())){
				check = false;
				for(LVA a : vorlesungen){
					if(coursedozd.equals(a.getLehrveranstaltungskuerzel())){
						checks = false;
						if(lva.dropDozent(dozents.get(i),a) && (doz.dropCourse(dozents.get(i), a))){
							end = true;
							//"Abgemeldet."
							break;
						}else
							end = false;
    						//"Dozent existiert in diser LVA nicht."
					}
				}
				if(checks == true){
					end = false;
					//"Falsche  Eingabe."
				}
			}
    	}
		if(check == true){
    		end = false;
			//"Dozent existiert nicht."
		}
    	return end;
	}
	
	public String studentsOfLVA(String vl){
		String s = "";
		for(LVA a : vorlesungen){
			if(vl.equals(a.getLehrveranstaltungskuerzel())){
				s = lva.listStudents(a);
			}
		}
		return s;
	}
	
	public String dozentsOfLVA(String vl){
		String d = "";
		for(LVA a : vorlesungen){
			if(vl.equals(a.getLehrveranstaltungskuerzel())){
				d = (lva.listDozents(a));
			}
		}
		return d;
	}
	
	public String listStuCourses(String matrikel){
		String s = "";
		for(Student a : students){
			if(matrikel.equals(a.getMatrikelnummer())){
				s = stu.listCourses(a);
			}
		}
		return s;
	}
	
	public String listDozCourses(String tcnum){
		String d = "";
		for(Dozent a : dozents){
			if(tcnum.equals(a.getTCnummer())){
				 d = doz.listCourses(a);
			}
		}
		return d;
	}
}
