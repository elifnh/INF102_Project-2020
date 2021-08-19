//Elif Nur Hancer_180503032
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Universitaet uni = new Universitaet("TAU");	
        int operation = 0;
        while (operation != 24) {
            System.out.println("Welche Operation moechten Sie durchfuehren?");
            
            System.out.println("1- Student hinzufuegen");
            System.out.println("2- Studenten auflisten");
            System.out.println("3- Student suchen");
            System.out.println("4- Studentinfo bearbeiten");
            System.out.println("5- Student loeschen");
            System.out.println("6- Student zur LVA anmelden");
            System.out.println("7- Student von LVA abmelden");
            System.out.println("8- Alle LVAs eines Studenten anzeigen");

            System.out.println("9- Dozent hinzufuegen");
            System.out.println("10- Dozenten auflisten");
            System.out.println("11- Dozent suchen");
            System.out.println("12- Dozent-Info bearbeiten");
            System.out.println("13- Dozent loeschen");
            System.out.println("14- Dozent zur LVA zuweisen");
            System.out.println("15- Dozent von LVA abmelden");
            System.out.println("16- Alle LVAs des Dozenten anzeigen");

            System.out.println("17- LVA hinzufuegen");
            System.out.println("18- LVAs auflisten");
            System.out.println("19- LVA suchen");
            System.out.println("20- LVA-Info bearbeiten");
            System.out.println("21- LVA loeschen");
            System.out.println("22- Alle angemeldeten Studenten der LVA auflisten");
            System.out.println("23- Alle verantwortlichen Dozenten der LVA auflisten");
            
            System.out.println("24- Programm beenden");
            
            Scanner r = new Scanner(System.in);
            operation = r.nextInt();

            switch (operation) {
                case 1:
                    boolean checks = false;
            		String matrikelnummer= "";
            		while(!checks){
            			System.out.println("Matrikelnummer:");
            		   	matrikelnummer = r.next();
            		   	if(Student.checkmatrkl(matrikelnummer)==true){
            	 			checks = true;
            	 		}else{
            	 			System.out.println("Fehler bei der Matriklenummer! Versuchen Sie es nochmal.");
            		    }
            		}
            		
            		System.out.println("Name:");
            		String name = r.next();
            		
            		System.out.println("Nachname:");
            		String nachname = r.next();
            		
                	System.out.println("Emailadresse:");
                	String emailadresse = r.next();

                	System.out.println("Fakultaet:");
                	String fakultaet = r.next();
                	
                	System.out.println("Fachbereich:");
                	String fachbereich = r.next();

                	System.out.println("Geburtsdatum(tt.mm.jj):");
                	String geburtsdatum = r.next();

                	System.out.println("Geschlecht:");
                	String geschlecht = r.next();

                	System.out.println("Klasse(0/1/2/3/4):");
                	String klasse = r.next();

                	System.out.println("Telefonnummer:");
                	String telefonnummer = r.next();

                	if(uni.addStudent(matrikelnummer,name,nachname,emailadresse,fakultaet,fachbereich,geburtsdatum,geschlecht,klasse,telefonnummer) == false){
            			System.out.println("Student existiert.");
            	   	}
                	break;
                     
                case 2:
                	uni.stuList();
                    break;
                    
                case 3:
                    System.out.println("Geben Sie die Matrikelnummer des Studenten ein, den Sie suchen moechten:");
            		String checks2 = r.next();
            		System.out.println(uni.stuSuchen(checks2));
                	break;
                     
                case 4:
                	break;
                	
                case 5:
                    System.out.println("Geben Sie die Matrikelnummer des Studenten ein, den Sie loeschen moechten:");
            		String checks1 = r.next();
            		uni.stuLoeschen(checks1);
                    break;
                
                case 6:
                	System.out.println("Geben Sie die Matrikelnummer des Studenten ein:");
                	String checks3 = r.next();
                	System.out.println("Für welche LVA möchten Sie anmelden?");
    				String course = r.next();
    				if(uni.addCourse(checks3, course) == true){
    					System.out.println("Student angemeldet.");
    				}else
    					System.out.println("Falsche Eingabe/Student existiert nicht.");
                	break;
                	
                case 7:
                	System.out.println("Geben sie die Matrikelnumer des Studenten ein:");
                	String checks4 = r.next();
                	System.out.println("Von welche LVA möchten Sie abmelden?");
    				String coursed = r.next();
                	if(uni.dropCourse(checks4, coursed) == true){
                		System.out.println("Student abgemeldet.");
                	}else
                		System.out.println("Falsche Eingabe/ Student existiert nicht.");
                	break;
                	
                case 8:
                	System.out.println("Geben sie die Matrikelnumer des Studenten ein:");
                	String checks5 = r.next();
                	System.out.println(uni.listStuCourses(checks5));
                	break;
                	
                case 9:
                	boolean checkd = false;
            		String TCnummer= "";
            		while(!checkd){
            			System.out.println("TC Nummer:");
            		   	TCnummer = r.next();
            		   	if(Dozent.checkTC(TCnummer)==true){
            	 			checkd = true;
            	 		}else{
            	 			System.out.println("Fehler bei der TC Nummer! Versuchen Sie es nochmal.");
            		    }
            		}
        		   	
                	System.out.println("Name:");
            		String dname = r.next();
            		
            		System.out.println("Nachname:");
            		String dnachname = r.next();
            		
                	System.out.println("Emailadresse:");
                	String demailadresse = r.next();
            		
                	System.out.println("Geburtsdatum(tt.mm.jj):");
                	String dgeburtsdatum = r.next();

                	System.out.println("Geschlecht:");
                	String dgeschlecht = r.next();
                	
                	System.out.println("Telefonnummer:");
                	String dtelefonnummer = r.next();
                	
                	if(uni.addDozent(TCnummer,dname,dnachname,demailadresse,dgeburtsdatum,dgeschlecht,dtelefonnummer) == false);{
                		System.out.println("Dozent existiert.");
                	}
            		break;

                case 10:
                	uni.dozList();
                	break;
                	
                case 11:
                	System.out.println("Geben Sie die TCnummer des Dozenten ein, den Sie suchen moechten:");
            		String checkd2 = r.next();
            		System.out.println(uni.dozSuchen(checkd2));
                	break;
                	
                case 12:
                	break;
                	
                case 13:
                	System.out.println("Geben Sie die TC Nummer des Dozenten ein, den Sie loeschen moechten:");
            		String checkd1= r.next();
            		uni.dozLoeschen(checkd1);	
                	break;
                	
                case 14:
                	System.out.println("Geben Sie die TC Nummer des Dozenten ein:");
            		String checkd3= r.next();
            		System.out.println("Für welche LVA möchten Sie zuweisen?");
    				String coursedoz = r.next();
    				if(uni.dozZuweisen(checkd3, coursedoz)){
    					System.out.println("Dozent angemeldet.");
    				}else
    					System.out.println("Falsche Eingabe/Dozent existiert nicht.");
            		break;
            		
                case 15:
                	System.out.println("Geben Sie die TC Nummer des Dozenten ein:");
            		String checkd4= r.next();
    				System.out.println("Von welche LVA möchten Sie abmelden?");
    				String coursedozd = r.next();
            		if(uni.dozDrop(checkd4, coursedozd)){
    					System.out.println("Dozent abgemeldet.");
            		}else
    					System.out.println("Falsche Eingabe/Dozent existiert nicht.");
            		break;
                
                case 16:
                	System.out.println("Geben sie die TC Nummer des Dozenten ein:");
                	String checkd5 = r.next();
                	if(Dozent.checkTC(checkd5)){
                	System.out.println(uni.listDozCourses(checkd5));
                	}else
                		System.out.println("Falsche Eingabe.");
                	break;
                	
                case 17:
                	boolean checkl = false;
            		String lehrveranstaltungskuerzel = "";
            		while(!checkl){
            			System.out.println("Lehrveranstaltungskuerzel:");
            			lehrveranstaltungskuerzel = r.next();
            		   	if(LVA.checklva(lehrveranstaltungskuerzel)==true){
            	 			checkl = true;
            	 		}else{
            	 			System.out.println("Fehler bei der Lehrveranstaltungskuerzel! Versuchen Sie es nochmal.");
            		    }
            		}
        			System.out.println("Stunde:");
        			String stunde = r.next();
                	if(uni.addLVA(lehrveranstaltungskuerzel, stunde) == false){
            			System.out.println("Lehrveranstaltung existiert.");
                	}
                	break;
                
                case 18:
                	uni.lvaList();
                	break;
                	
                case 19:
                	System.out.println("Geben Sie die Lehrveranstaltungskuerzel der Lehrveranstaltung ein, den Sie suchen moechten:");
            		String checkl2 = r.next();
            		System.out.println(uni.lvaSuchen(checkl2));
                	break;
                	
                case 20:
                	break;
                	
                case 21:
                	System.out.println("Geben Sie die Lehrveranstaltungskuerzel der Lehrveranstaltung ein, den Sie loeschen moechten:");                  
            		String checkl1= r.next(); 
            		uni.lvaLoeschen(checkl1);
                	break;
                	
                case 22:
                	System.out.println("Welche LVA?");
                	String checkl3 = r.next();
                	if( LVA.checklva(checkl3)== true){
                		System.out.println(uni.studentsOfLVA(checkl3));
                	}else
                		System.out.println("Falsche Eingabe.");
                	break;
                	
                case 23:
                	System.out.println("Welche LVA?");
                	String checkl4 = r.next();
                	if( LVA.checklva(checkl4)== true){
                		System.out.println(uni.dozentsOfLVA(checkl4));
                	}else
                		System.out.println("Falsche Eingabe.");
                	break;
                	
                case 24:
                	break;
           }          
        }
    }
}