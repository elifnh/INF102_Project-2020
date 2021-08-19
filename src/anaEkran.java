//Elif Nur Hancer_180503032
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.TextField;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

import java.awt.Label;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Color;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


public class anaEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tF_name;
	private JTextField tF_nachname;
	private JTextField tF_matrikel;
	private JTextField tF_email;
	private JTextField tF_fakultaet;
	private JTextField tF_fachbereich;
	private JTextField tF_geburtsdatum;
	private JTextField tF_geschlecht;
	private JTextField tF_klasse;
	private JTextField tF_telefon;
	private JTable table_Students;
	
	
	private JTextField tF_geburtsdatum_1;
	private JTextField tF_tcnummer;
	private JTextField tF_email_1;
	private JTextField tF_telefon_1;
	private JTextField tF_geschlecht_1;
	private JTable table_Dozents;
	private JTextField tF_name_1;
	private JTextField tF_nachname_1;
	private JTextField tF_lva;
	private JTextField tF_stunde;
	private JTable table_LVAs;
	private JTextField tF_mtrkl;
	private JTextField tF_lvastu;
	private JTextField tF_tc;
	private JTextField tF_lvadoz;
	private JTextField tF_matrikel1;
	private JTextField tF_tcnummer_1;
	private JTextField tF_lva_1;
	private JTextField tF_lvastulist;
	private JTextField tF_lvadozlist;
	Universitaet uni = new Universitaet("TAU");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anaEkran frame = new anaEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public anaEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		tabbedPane.setBounds(0, 0, 592, 345);
		contentPane.add(tabbedPane);
		
		JPanel panel_Student = new JPanel();
		tabbedPane.addTab("Student", null, panel_Student, null);
		panel_Student.setLayout(null);
		
		JLabel lblName = new JLabel("Name:*");
		lblName.setBounds(10, 11, 79, 14);
		panel_Student.add(lblName);
		
		JLabel lblNachname = new JLabel("Nachname:*");
		lblNachname.setBounds(10, 36, 121, 14);
		panel_Student.add(lblNachname);
		
		JLabel lblMatrikelnummer_1 = new JLabel("Matrikelnummer:*");
		lblMatrikelnummer_1.setBounds(10, 61, 121, 14);
		panel_Student.add(lblMatrikelnummer_1);
		
		JLabel label_3 = new JLabel("Email Adresse:");
		label_3.setBounds(10, 86, 121, 14);
		panel_Student.add(label_3);
		
		JLabel label_4 = new JLabel("Fakultaet:");
		label_4.setBounds(10, 111, 121, 14);
		panel_Student.add(label_4);
		
		JLabel label_5 = new JLabel("Fachbereich:");
		label_5.setBounds(251, 11, 99, 14);
		panel_Student.add(label_5);
		
		JLabel label_6 = new JLabel("Geburtsdatum:");
		label_6.setBounds(251, 36, 99, 14);
		panel_Student.add(label_6);
		
		JLabel label_7 = new JLabel("Geschlecht:");
		label_7.setBounds(251, 61, 99, 14);
		panel_Student.add(label_7);
		
		JLabel label_8 = new JLabel("Klasse:");
		label_8.setBounds(251, 86, 99, 14);
		panel_Student.add(label_8);
		
		JLabel label_9 = new JLabel("Telefonnummer:");
		label_9.setBounds(251, 111, 99, 14);
		panel_Student.add(label_9);
		
		final Label lb_Mesaj = new Label("");
		lb_Mesaj.setForeground(Color.RED);
		lb_Mesaj.setBounds(10, 134, 567, 20);
		panel_Student.add(lb_Mesaj);
		
		JLabel label = new JLabel("Matrikelnummer:*");
		label.setBounds(10, 266, 121, 14);
		panel_Student.add(label);
		
		final Label lb_stuSuchen_lva = new Label("");
		lb_stuSuchen_lva.setForeground(Color.BLACK);
		lb_stuSuchen_lva.setBounds(251, 261, 326, 53);
		panel_Student.add(lb_stuSuchen_lva);
		
		tF_name = new JTextField();
		tF_name.setColumns(10);
		tF_name.setBounds(141, 8, 86, 20);
		panel_Student.add(tF_name);
		
		tF_nachname = new JTextField();
		tF_nachname.setColumns(10);
		tF_nachname.setBounds(141, 33, 86, 20);
		panel_Student.add(tF_nachname);
		
		tF_matrikel = new JTextField();
		tF_matrikel.setColumns(10);
		tF_matrikel.setBounds(141, 58, 86, 20);
		panel_Student.add(tF_matrikel);
		
		tF_email = new JTextField();
		tF_email.setColumns(10);
		tF_email.setBounds(141, 83, 86, 20);
		panel_Student.add(tF_email);
		
		tF_fakultaet = new JTextField();
		tF_fakultaet.setColumns(10);
		tF_fakultaet.setBounds(141, 108, 86, 20);
		panel_Student.add(tF_fakultaet);
		
		tF_fachbereich = new JTextField();
		tF_fachbereich.setColumns(10);
		tF_fachbereich.setBounds(360, 8, 86, 20);
		panel_Student.add(tF_fachbereich);
		
		tF_geburtsdatum = new JTextField();
		tF_geburtsdatum.setColumns(10);
		tF_geburtsdatum.setBounds(360, 33, 86, 20);
		panel_Student.add(tF_geburtsdatum);
		
		tF_geschlecht = new JTextField();
		tF_geschlecht.setColumns(10);
		tF_geschlecht.setBounds(360, 58, 86, 20);
		panel_Student.add(tF_geschlecht);
		
		tF_klasse = new JTextField();
		tF_klasse.setColumns(10);
		tF_klasse.setBounds(360, 83, 86, 20);
		panel_Student.add(tF_klasse);
		
		tF_telefon = new JTextField();
		tF_telefon.setColumns(10);
		tF_telefon.setBounds(360, 108, 86, 20);
		panel_Student.add(tF_telefon);
		
		tF_matrikel1 = new JTextField();
		tF_matrikel1.setColumns(10);
		tF_matrikel1.setBounds(141, 263, 86, 20);
		panel_Student.add(tF_matrikel1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 160, 587, 95);
		panel_Student.add(scrollPane);
		
		table_Students = new JTable();
		scrollPane.setViewportView(table_Students);
		table_Students.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_Students.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_Students.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Nachname", "Matrikelnummer", "Email", "Fakultaet", "Fachbereich", "Geburtsdatum", "Geschlecht", "Klasse", "Telefonnummer"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_Students.getColumnModel().getColumn(0).setPreferredWidth(52);
		table_Students.getColumnModel().getColumn(1).setPreferredWidth(67);
		table_Students.getColumnModel().getColumn(2).setPreferredWidth(89);
		table_Students.getColumnModel().getColumn(3).setPreferredWidth(41);
		table_Students.getColumnModel().getColumn(4).setPreferredWidth(53);
		table_Students.getColumnModel().getColumn(6).setPreferredWidth(88);
		table_Students.getColumnModel().getColumn(7).setPreferredWidth(66);
		table_Students.getColumnModel().getColumn(8).setPreferredWidth(47);
		table_Students.getColumnModel().getColumn(9).setPreferredWidth(85);
		
		JButton btn_addStu = new JButton("Hinzufuegen");
		btn_addStu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean checks = false;
        		while(!checks){
        		   	if(Student.checkmatrkl(tF_matrikel.getText()) == true && tF_name.getText().isEmpty() == false && tF_nachname.getText().isEmpty() == false){
        		   		if(uni.addStudent(tF_matrikel.getText(),tF_name.getText(),tF_nachname.getText(),tF_email.getText(),tF_fakultaet.getText(),
        				tF_fachbereich.getText(),tF_geburtsdatum.getText(),tF_geschlecht.getText(),tF_klasse.getText(),tF_telefon.getText()) == false){
        		   			lb_Mesaj.setText("Student existiert.");
        		   		}else{
        		   			String[] ss = new String[10];
        		   			ss[0] = tF_name.getText();
        		   			ss[1] = tF_nachname.getText();
        		   			ss[2] = tF_matrikel.getText();
        		   			ss[3] = tF_email.getText();
        		   			ss[4] = tF_fakultaet.getText();
        		   			ss[5] = tF_fachbereich.getText();
        		   			ss[6] = tF_geburtsdatum.getText();
        		   			ss[7] = tF_geschlecht.getText();
        		   			ss[8] = tF_klasse.getText();
        		   			ss[9] = tF_telefon.getText();
        		   			DefaultTableModel dtm = (DefaultTableModel) table_Students.getModel();
        		   			dtm.addRow(ss);
        		   			lb_Mesaj.setText("Student erfolgreich hinzugefügt.");
        		   			tF_matrikel.setText("");
        		   			tF_name.setText("");
        		   			tF_nachname.setText("");
        		   			tF_email.setText("");
        		   			tF_fakultaet.setText("");
        		   			tF_fachbereich.setText("");
        		   			tF_geburtsdatum.setText("");
        		   			tF_geschlecht.setText("");
        		   			tF_klasse.setText("");
        		   			tF_telefon.setText("");
        		   		}
        	 			checks = true;
        	 		}else{
        	 			lb_Mesaj.setText("Fehler bei der Matrikelnummer, Name oder Nachname! Versuchen Sie es nochmal.");
        	 			break;
        		    }
        		}
			}
		});
		btn_addStu.setBounds(456, 7, 121, 23);
		panel_Student.add(btn_addStu);
		
		JButton btn_aktStu = new JButton("Aktualisieren");
		btn_aktStu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_Students.getSelectedRow();
				if(i>=0){
					if(Student.checkmatrkl(tF_matrikel.getText()) == true && tF_name.getText().trim().isEmpty() == false && tF_nachname.getText().trim().isEmpty() == false){
						if(((String)table_Students.getModel().getValueAt(i,2)).equals(tF_matrikel.getText())){
							Student s = uni.students.get(i);
        		   			s.setName(tF_name.getText());
        		   			s.setNachname(tF_nachname.getText());
        		   			s.setMatrikelnummer(tF_matrikel.getText());
        		   			s.setEmailadresse(tF_email.getText());
        		   			s.setFakultaet(tF_fakultaet.getText());
        		   			s.setFachbereich(tF_fachbereich.getText());
							s.setGeburtsdatum(tF_geburtsdatum.getText());
							s.setGeschlecht(tF_geschlecht.getText());
							s.setKlasse(tF_klasse.getText());
							s.setTelefonnummer(tF_telefon.getText());
							table_Students.getModel().setValueAt(s.getName(), i, 0);
							table_Students.getModel().setValueAt(s.getNachname(), i, 1);
							table_Students.getModel().setValueAt(s.getMatrikelnummer(), i, 2);
							table_Students.getModel().setValueAt(s.getEmailadresse(), i, 3);
							table_Students.getModel().setValueAt(s.getFakultaet(), i, 4);
							table_Students.getModel().setValueAt(s.getFachbereich(), i, 5);
							table_Students.getModel().setValueAt(s.getGeburtsdatum(), i, 6);
							table_Students.getModel().setValueAt(s.getGeschlecht(), i, 7);
							table_Students.getModel().setValueAt(s.getKlasse(), i, 8);
							table_Students.getModel().setValueAt(s.getTelefonnummer(), i, 9);
							lb_Mesaj.setText("Student erfolgreich Aktualisiert.");
        		   		}else if(uni.addStudent(tF_matrikel.getText(),tF_name.getText(),tF_nachname.getText(),tF_email.getText(),tF_fakultaet.getText(),
        				tF_fachbereich.getText(),tF_geburtsdatum.getText(),tF_geschlecht.getText(),tF_klasse.getText(),tF_telefon.getText()) == false){
        		   			lb_Mesaj.setText("Student existiert.");
        		   		}else{
        		   			Student s = uni.students.get(i);
        		   			s.setName(tF_name.getText());
        		   			s.setNachname(tF_nachname.getText());
        		   			s.setMatrikelnummer(tF_matrikel.getText());
        		   			s.setEmailadresse(tF_email.getText());
        		   			s.setFakultaet(tF_fakultaet.getText());
        		   			s.setFachbereich(tF_fachbereich.getText());
							s.setGeburtsdatum(tF_geburtsdatum.getText());
							s.setGeschlecht(tF_geschlecht.getText());
							s.setKlasse(tF_klasse.getText());
							s.setTelefonnummer(tF_telefon.getText());
							table_Students.getModel().setValueAt(s.getName(), i, 0);
							table_Students.getModel().setValueAt(s.getNachname(), i, 1);
							table_Students.getModel().setValueAt(s.getMatrikelnummer(), i, 2);
							table_Students.getModel().setValueAt(s.getEmailadresse(), i, 3);
							table_Students.getModel().setValueAt(s.getFakultaet(), i, 4);
							table_Students.getModel().setValueAt(s.getFachbereich(), i, 5);
							table_Students.getModel().setValueAt(s.getGeburtsdatum(), i, 6);
							table_Students.getModel().setValueAt(s.getGeschlecht(), i, 7);
							table_Students.getModel().setValueAt(s.getKlasse(), i, 8);
							table_Students.getModel().setValueAt(s.getTelefonnummer(), i, 9);
							lb_Mesaj.setText("Student erfolgreich Aktualisiert.");
        		   		}
        		   	}else{
        	 			lb_Mesaj.setText("Fehler bei der Matrikelnummer, Name oder Nachname! Versuchen Sie es nochmal.");
        		   	}
				}
			}
		});
		btn_aktStu.setBounds(456, 32, 121, 23);
		panel_Student.add(btn_aktStu);
		
		JButton btn_removeStu = new JButton("Loeschen");
		btn_removeStu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_Students.getSelectedRow();
				if(i>=0){
					uni.students.remove(i);
					DefaultTableModel dtm = (DefaultTableModel) table_Students.getModel();
					dtm.removeRow(i);
					lb_Mesaj.setText("Student erfolgreich geloescht.");
					tF_matrikel.setText("");
		   			tF_name.setText("");
		   			tF_nachname.setText("");
		   			tF_email.setText("");
		   			tF_fakultaet.setText("");
		   			tF_fachbereich.setText("");
		   			tF_geburtsdatum.setText("");
		   			tF_geschlecht.setText("");
		   			tF_klasse.setText("");
		   			tF_telefon.setText("");
				}
			}
		});
		btn_removeStu.setBounds(456, 57, 121, 23);
		panel_Student.add(btn_removeStu);
		
		JButton btnSuchen = new JButton("Suchen");
		btnSuchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb_stuSuchen_lva.setText(uni.stuSuchen(tF_matrikel1.getText()));
			}
		});
		btnSuchen.setBounds(10, 291, 111, 23);
		panel_Student.add(btnSuchen);
		
		JButton btnLvaListen = new JButton("LVA Listen");
		btnLvaListen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb_stuSuchen_lva.setText(uni.listStuCourses(tF_matrikel1.getText()));
			}
		});
		btnLvaListen.setBounds(130, 291, 111, 23);
		panel_Student.add(btnLvaListen);
		
		table_Students.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				int i = table_Students.getSelectedRow();
				if(i>=0){
					tF_name.setText((String) table_Students.getModel().getValueAt(i,0));
					tF_nachname.setText((String) table_Students.getModel().getValueAt(i,1));
					tF_matrikel.setText((String) table_Students.getModel().getValueAt(i,2));
					tF_email.setText((String) table_Students.getModel().getValueAt(i,3));
					tF_fakultaet.setText((String) table_Students.getModel().getValueAt(i,4));
					tF_fachbereich.setText((String) table_Students.getModel().getValueAt(i,5));
					tF_geburtsdatum.setText((String) table_Students.getModel().getValueAt(i,6));
					tF_geschlecht.setText((String) table_Students.getModel().getValueAt(i,7));
					tF_klasse.setText((String) table_Students.getModel().getValueAt(i,8));
					tF_telefon.setText((String) table_Students.getModel().getValueAt(i,9));
				}
			}
		});
		
		JPanel panel_Dozent = new JPanel();
		tabbedPane.addTab("Dozent", null, panel_Dozent, null);
		panel_Dozent.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name:*");
		lblName_1.setBounds(10, 12, 121, 14);
		panel_Dozent.add(lblName_1);
		
		JLabel lblNachname_1 = new JLabel("Nachname:*");
		lblNachname_1.setBounds(10, 37, 121, 14);
		panel_Dozent.add(lblNachname_1);
		
		JLabel lblTcnummer = new JLabel("TC-Nummer:*");
		lblTcnummer.setBounds(10, 61, 121, 14);
		panel_Dozent.add(lblTcnummer);
		
		JLabel label_13 = new JLabel("Email Adresse:");
		label_13.setBounds(251, 12, 121, 14);
		panel_Dozent.add(label_13);
		
		JLabel label_16 = new JLabel("Geburtsdatum:");
		label_16.setBounds(251, 61, 103, 14);
		panel_Dozent.add(label_16);
		
		JLabel label_17 = new JLabel("Geschlecht:");
		label_17.setBounds(251, 87, 103, 14);
		panel_Dozent.add(label_17);
		
		JLabel label_19 = new JLabel("Telefonnummer:");
		label_19.setBounds(251, 37, 103, 14);
		panel_Dozent.add(label_19);
		
		final Label lb_Mesaj_1 = new Label("");
		lb_Mesaj_1.setForeground(Color.RED);
		lb_Mesaj_1.setBounds(10, 107, 567, 20);
		panel_Dozent.add(lb_Mesaj_1);
		
		JLabel label_1 = new JLabel("TC-Nummer:*");
		label_1.setBounds(10, 254, 92, 14);
		panel_Dozent.add(label_1);
		
		final Label lb_dozSuchen_lva = new Label("");
		lb_dozSuchen_lva.setForeground(Color.BLACK);
		lb_dozSuchen_lva.setBounds(251, 246, 327, 56);
		panel_Dozent.add(lb_dozSuchen_lva);
		
		tF_name_1 = new JTextField();
		tF_name_1.setColumns(10);
		tF_name_1.setBounds(141, 8, 86, 20);
		panel_Dozent.add(tF_name_1);
		
		tF_nachname_1 = new JTextField();
		tF_nachname_1.setColumns(10);
		tF_nachname_1.setBounds(141, 33, 86, 20);
		panel_Dozent.add(tF_nachname_1);
		
		tF_tcnummer = new JTextField();
		tF_tcnummer.setBounds(141, 58, 86, 20);
		tF_tcnummer.setColumns(10);
		panel_Dozent.add(tF_tcnummer);
		
		tF_geburtsdatum_1 = new JTextField();
		tF_geburtsdatum_1.setBounds(364, 58, 86, 20);
		tF_geburtsdatum_1.setColumns(10);
		panel_Dozent.add(tF_geburtsdatum_1);
		
		tF_geschlecht_1 = new JTextField();
		tF_geschlecht_1.setBounds(364, 84, 86, 20);
		tF_geschlecht_1.setColumns(10);
		panel_Dozent.add(tF_geschlecht_1);
		
		tF_telefon_1 = new JTextField();
		tF_telefon_1.setBounds(364, 34, 86, 20);
		tF_telefon_1.setColumns(10);
		panel_Dozent.add(tF_telefon_1);
		
		tF_email_1 = new JTextField();
		tF_email_1.setBounds(364, 9, 86, 20);
		tF_email_1.setColumns(10);
		panel_Dozent.add(tF_email_1);
		
		JButton bt_addDoz = new JButton("Hinzufuegen");
		bt_addDoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean checkd = false;
        		while(!checkd){
        		   	if(Dozent.checkTC(tF_tcnummer.getText()) == true && tF_name_1.getText().isEmpty() == false && tF_nachname_1.getText().isEmpty() == false){
        		   		if(uni.addDozent(tF_tcnummer.getText(),tF_name_1.getText(),tF_nachname_1.getText(),tF_email_1.getText(),tF_geburtsdatum_1.getText(),tF_geschlecht.getText(),tF_telefon_1.getText()) == false){
        		   			lb_Mesaj_1.setText("Dozent existiert.");
        		   		}else{
        		   			String[] dd = new String[7];
        		   			dd[0] = tF_name_1.getText();
        		   			dd[1] = tF_nachname_1.getText();
        		   			dd[2] = tF_tcnummer.getText();
        		   			dd[3] = tF_email_1.getText();
        		   			dd[4] = tF_telefon_1.getText();
        		   			dd[5] = tF_geburtsdatum_1.getText();
        		   			dd[6] = tF_geschlecht_1.getText();
        		   			DefaultTableModel dtm1 = (DefaultTableModel) table_Dozents.getModel();
        		   			dtm1.addRow(dd);
        		   			lb_Mesaj_1.setText("Dozent erfolgreich hinzugefügt.");
        		   			tF_tcnummer.setText("");
        		   			tF_name_1.setText("");
        		   			tF_nachname_1.setText("");
        		   			tF_email_1.setText("");
        		   			tF_geburtsdatum_1.setText("");
        		   			tF_geschlecht_1.setText("");
        		   			tF_telefon.setText("");
        		   		}
    		   			checkd = true;
        	 		}else{
        	 			lb_Mesaj_1.setText("Fehler bei der TC Nummer, Name oder Nachname! Versuchen Sie es nochmal.");
        	 			break;
        		    }
        		}
			}
		});
		
		tF_tcnummer_1 = new JTextField();
		tF_tcnummer_1.setColumns(10);
		tF_tcnummer_1.setBounds(141, 251, 86, 20);
		panel_Dozent.add(tF_tcnummer_1);
		bt_addDoz.setBounds(460, 8, 121, 23);
		panel_Dozent.add(bt_addDoz);
		
		JButton bt_aktDoz = new JButton("Aktualisieren");
		bt_aktDoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_Dozents.getSelectedRow();
				if(i>=0){
					if(Dozent.checkTC(tF_tcnummer.getText()) == true && tF_name_1.getText().isEmpty() == false && tF_nachname_1.getText().isEmpty() == false){
						if(((String)table_Dozents.getModel().getValueAt(i,2)).equals(tF_tcnummer.getText())){
							Dozent d = uni.dozents.get(i);
							d.setName(tF_name_1.getText());
							d.setNachname(tF_nachname_1.getText());
							d.setTCnummer(tF_tcnummer.getText());
							d.setEmailadresse(tF_email_1.getText());
							d.setGeburtsdatum(tF_geburtsdatum_1.getText());
							d.setGeschlecht(tF_geschlecht_1.getText());
							d.setTelefonnummer(tF_telefon_1.getText());
							table_Dozents.getModel().setValueAt(d.getName(), i, 0);
							table_Dozents.getModel().setValueAt(d.getNachname(), i, 1);
							table_Dozents.getModel().setValueAt(d.getTCnummer(), i, 2);
							table_Dozents.getModel().setValueAt(d.getEmailadresse(), i, 3);
							table_Dozents.getModel().setValueAt(d.getTelefonnummer(), i, 4);
							table_Dozents.getModel().setValueAt(d.getGeburtsdatum(), i, 5);
							table_Dozents.getModel().setValueAt(d.getGeschlecht(), i, 6);
							lb_Mesaj_1.setText("Dozent erfolgreich aktualisiert.");
						}else if(uni.addDozent(tF_tcnummer.getText(),tF_name_1.getText(),tF_nachname_1.getText(),tF_email_1.getText(),tF_geburtsdatum_1.getText(),tF_geschlecht.getText(),tF_telefon_1.getText()) == false){
        		   			lb_Mesaj_1.setText("Dozent existiert.");
						}else{
							Dozent d = uni.dozents.get(i);
							d.setName(tF_name_1.getText());
							d.setNachname(tF_nachname_1.getText());
							d.setTCnummer(tF_tcnummer.getText());
							d.setEmailadresse(tF_email_1.getText());
							d.setGeburtsdatum(tF_geburtsdatum_1.getText());
							d.setGeschlecht(tF_geschlecht_1.getText());
							d.setTelefonnummer(tF_telefon_1.getText());
							table_Dozents.getModel().setValueAt(d.getName(), i, 0);
							table_Dozents.getModel().setValueAt(d.getNachname(), i, 1);
							table_Dozents.getModel().setValueAt(d.getTCnummer(), i, 2);
							table_Dozents.getModel().setValueAt(d.getEmailadresse(), i, 3);
							table_Dozents.getModel().setValueAt(d.getTelefonnummer(), i, 4);
							table_Dozents.getModel().setValueAt(d.getGeburtsdatum(), i, 5);
							table_Dozents.getModel().setValueAt(d.getGeschlecht(), i, 6);
							lb_Mesaj_1.setText("Dozent erfolgreich aktualisiert.");
						}
					}else{
        	 			lb_Mesaj_1.setText("Fehler bei der TC Nummer, Name oder Nachname! Versuchen Sie es nochmal.");
					}
				}
			}
		});
		bt_aktDoz.setBounds(460, 32, 121, 23);
		panel_Dozent.add(bt_aktDoz);
		
		JButton bt_removeDoz = new JButton("Loeschen");
		bt_removeDoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_Dozents.getSelectedRow();
				if(i>=0){
					uni.dozents.remove(i);
					DefaultTableModel dtm1 = (DefaultTableModel) table_Dozents.getModel();
					dtm1.removeRow(i);
					lb_Mesaj_1.setText("Dozent erfolgreich geloescht.");
					tF_tcnummer.setText("");
		   			tF_name_1.setText("");
		   			tF_nachname_1.setText("");
		   			tF_email_1.setText("");
		   			tF_geburtsdatum_1.setText("");
		   			tF_geschlecht_1.setText("");
		   			tF_telefon.setText("");
				}
			}
		});
		bt_removeDoz.setBounds(460, 57, 121, 23);
		panel_Dozent.add(bt_removeDoz);
		
		JButton btnSuchen_1 = new JButton("Suchen");
		btnSuchen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb_dozSuchen_lva.setText(uni.dozSuchen(tF_tcnummer_1.getText()));
			}
		});
		btnSuchen_1.setBounds(10, 279, 110, 23);
		panel_Dozent.add(btnSuchen_1);
		
		JButton btnLvaListen_1 = new JButton("LVA Listen");
		btnLvaListen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Dozent.checkTC(tF_tcnummer_1.getText())){
					lb_dozSuchen_lva.setText(uni.listDozCourses(tF_tcnummer_1.getText()));
				}else
					lb_dozSuchen_lva.setText("Falsche Eingabe.");

			}
		});
		btnLvaListen_1.setBounds(130, 279, 110, 23);
		panel_Dozent.add(btnLvaListen_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 135, 587, 108);
		panel_Dozent.add(scrollPane_1);
		
		table_Dozents = new JTable();
		scrollPane_1.setViewportView(table_Dozents);
		table_Dozents.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Nachname", "TC-Nummer", "Email Adresse", "Telefonnummer", "Geburtsdatum", "Geschlecht"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		table_Dozents.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				int i = table_Dozents.getSelectedRow();
				if(i>=0){
					tF_name_1.setText((String) table_Dozents.getModel().getValueAt(i,0));
					tF_nachname_1.setText((String) table_Dozents.getModel().getValueAt(i,1));
					tF_tcnummer.setText((String) table_Dozents.getModel().getValueAt(i,2));
					tF_email_1.setText((String) table_Dozents.getModel().getValueAt(i,3));
					tF_telefon_1.setText((String) table_Dozents.getModel().getValueAt(i,4));
					tF_geburtsdatum_1.setText((String) table_Dozents.getModel().getValueAt(i,5));
					tF_geschlecht_1.setText((String) table_Dozents.getModel().getValueAt(i,6));					
				}
			}
		});
		
		JPanel panel_LVA = new JPanel();
		tabbedPane.addTab("LVA", null, panel_LVA, null);
		panel_LVA.setLayout(null);
		
		JLabel lblLvakuerzel = new JLabel("LVA-Kuerzel:*");
		lblLvakuerzel.setBounds(10, 11, 86, 14);
		panel_LVA.add(lblLvakuerzel);
		
		JLabel lblStunde = new JLabel("Stunde:");
		lblStunde.setBounds(10, 38, 86, 14);
		panel_LVA.add(lblStunde);
		
		final Label lb_Message = new Label("");
		lb_Message.setForeground(Color.RED);
		lb_Message.setBounds(10, 86, 419, 20);
		panel_LVA.add(lb_Message);
		
		JLabel label_2 = new JLabel("LVA-Kuerzel:*");
		label_2.setBounds(10, 246, 86, 14);
		panel_LVA.add(label_2);
		
		final Label lb_lvaSuchen = new Label("");
		lb_lvaSuchen.setBounds(198, 243, 305, 54);
		panel_LVA.add(lb_lvaSuchen);
		
		tF_lva = new JTextField();
		tF_lva.setColumns(10);
		tF_lva.setBounds(106, 8, 86, 20);
		panel_LVA.add(tF_lva);
		
		tF_stunde = new JTextField();
		tF_stunde.setColumns(10);
		tF_stunde.setBounds(106, 35, 86, 20);
		panel_LVA.add(tF_stunde);
		
		JButton bt_addLva = new JButton("Hinzufuegen");
		bt_addLva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean checkl = false;
        		while(!checkl){
        		   	if(LVA.checklva(tF_lva.getText()) == true){
        		   		if(uni.addLVA(tF_lva.getText(),tF_stunde.getText()) == false){
        		   			lb_Message.setText("LVA existiert.");
        		   		}else{
        		   			String[] lv = new String[2];
        		   			lv[0] = tF_lva.getText();
        		   			lv[1] = tF_stunde.getText();
        		   			DefaultTableModel dtm2 = (DefaultTableModel) table_LVAs.getModel();
        		   			dtm2.addRow(lv);
        		   			lb_Message.setText("LVA erfolgreich hinzugefügt.");
        		   			tF_lva.setText("");
        		   			tF_stunde.setText("");
        		   		}
        	 			checkl = true;
        	 		}else{
        	 			lb_Message.setText("Fehler bei der Lehrveranstaltungskuerzel! Versuchen Sie es nochmal.");
        	 			break;
        		    }
        		}
			}
		});
		
		tF_lva_1 = new JTextField();
		tF_lva_1.setColumns(10);
		tF_lva_1.setBounds(106, 243, 86, 20);
		panel_LVA.add(tF_lva_1);
		bt_addLva.setBounds(217, 8, 121, 23);
		panel_LVA.add(bt_addLva);
		
		JButton bt_aktLva = new JButton("Aktualisieren");
		bt_aktLva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_LVAs.getSelectedRow();
				if(i>=0){
					if(LVA.checklva(tF_lva.getText()) == true){
						if(((String)table_LVAs.getModel().getValueAt(i,0)).equals(tF_lva.getText())){
							LVA vl = uni.vorlesungen.get(i);
							vl.setLehrveranstaltungskuerzel(tF_lva.getText());
							vl.setStunde(tF_stunde.getText());
							table_LVAs.getModel().setValueAt(vl.getLehrveranstaltungskuerzel(), i, 0);
							table_LVAs.getModel().setValueAt(vl.getStunde(), i, 1);
							lb_Message.setText("LVA erfolgreich aktualisiert.");
						}else if(uni.addLVA(tF_lva.getText(),tF_stunde.getText()) == false){
        		   			lb_Message.setText("LVA existiert.");
						}else{
							LVA vl = uni.vorlesungen.get(i);
							vl.setLehrveranstaltungskuerzel(tF_lva.getText());
							vl.setStunde(tF_stunde.getText());
							table_LVAs.getModel().setValueAt(vl.getLehrveranstaltungskuerzel(), i, 0);
							table_LVAs.getModel().setValueAt(vl.getStunde(), i, 1);
							lb_Message.setText("LVA erfolgreich aktualisiert.");
						}
					}else{
        	 			lb_Message.setText("Fehler bei der LVA Kuerzel! Versuchen Sie es nochmal.");
					}
				}
			}
		});
		
		bt_aktLva.setBounds(217, 32, 121, 23);
		panel_LVA.add(bt_aktLva);
		
		JButton bt_removeLva = new JButton("Loeschen");
		bt_removeLva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table_LVAs.getSelectedRow();
				if(i>=0){
					uni.vorlesungen.remove(i);
					DefaultTableModel dtm2 = (DefaultTableModel) table_LVAs.getModel();
					dtm2.removeRow(i);
					lb_Message.setText("LVA erfolgreich geloescht.");
		   			tF_lva.setText("");
		   			tF_stunde.setText("");
				}
			}
		});
		bt_removeLva.setBounds(217, 57, 121, 23);
		panel_LVA.add(bt_removeLva);
		
		JButton btnSuchen_2 = new JButton("Suchen");
		btnSuchen_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb_lvaSuchen.setText(uni.lvaSuchen(tF_lva_1.getText()));
			}
		});
		btnSuchen_2.setBounds(41, 274, 107, 23);
		panel_LVA.add(btnSuchen_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 112, 379, 120);
		panel_LVA.add(scrollPane_2);
		
		table_LVAs = new JTable();
		scrollPane_2.setViewportView(table_LVAs);
		table_LVAs.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"LVA Kuerzel", "Stunde"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JPanel panel_einstellung = new JPanel();
		tabbedPane.addTab("LVA Einstellungen", null, panel_einstellung, null);
		panel_einstellung.setLayout(null);
		
		JLabel lblMatrikelnummer = new JLabel("Matrikelnummer:*");
		lblMatrikelnummer.setBounds(51, 39, 103, 14);
		panel_einstellung.add(lblMatrikelnummer);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudent.setBounds(51, 11, 80, 14);
		panel_einstellung.add(lblStudent);
		
		JLabel lblLvaKuerzel = new JLabel("LVA Kuerzel:*");
		lblLvaKuerzel.setBounds(51, 67, 103, 14);
		panel_einstellung.add(lblLvaKuerzel);
		
		JLabel lblDozent = new JLabel("DOZENT");
		lblDozent.setHorizontalAlignment(SwingConstants.LEFT);
		lblDozent.setBounds(340, 11, 237, 14);
		panel_einstellung.add(lblDozent);
		
		JLabel lblTcNummer = new JLabel("TC Nummer:*");
		lblTcNummer.setBounds(340, 39, 103, 14);
		panel_einstellung.add(lblTcNummer);
		
		JLabel lblLvaKuerzel_1 = new JLabel("LVA Kuerzel:*");
		lblLvaKuerzel_1.setBounds(340, 67, 103, 14);
		panel_einstellung.add(lblLvaKuerzel_1);
		
		final Label lb_Mesajstudoz = new Label("");
		lb_Mesajstudoz.setAlignment(Label.CENTER);
		lb_Mesajstudoz.setForeground(Color.RED);
		lb_Mesajstudoz.setBounds(53, 142, 478, 22);
		panel_einstellung.add(lb_Mesajstudoz);
		
		JLabel lblLvaKuerzel_2 = new JLabel("LVA Kuerzel:*");
		lblLvaKuerzel_2.setBounds(51, 188, 103, 14);
		panel_einstellung.add(lblLvaKuerzel_2);
		
		JLabel lblLvaKuerzel_3 = new JLabel("LVA Kuerzel:*");
		lblLvaKuerzel_3.setBounds(340, 188, 103, 14);
		panel_einstellung.add(lblLvaKuerzel_3);
		
		final JLabel lb_StuDozListen = new JLabel("");
		lb_StuDozListen.setHorizontalAlignment(SwingConstants.CENTER);
		lb_StuDozListen.setBounds(0, 247, 587, 59);
		panel_einstellung.add(lb_StuDozListen);
		
		tF_mtrkl = new JTextField();
		tF_mtrkl.setColumns(10);
		tF_mtrkl.setBounds(163, 36, 86, 20);
		panel_einstellung.add(tF_mtrkl);
		
		tF_lvastu = new JTextField();
		tF_lvastu.setColumns(10);
		tF_lvastu.setBounds(163, 64, 86, 20);
		panel_einstellung.add(tF_lvastu);
		
		tF_tc = new JTextField();
		tF_tc.setColumns(10);
		tF_tc.setBounds(453, 36, 86, 20);
		panel_einstellung.add(tF_tc);
		
		tF_lvadoz = new JTextField();
		tF_lvadoz.setColumns(10);
		tF_lvadoz.setBounds(453, 64, 86, 20);
		panel_einstellung.add(tF_lvadoz);
		
		JButton bt_anmelden = new JButton("Anmelden");
		bt_anmelden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean bool = 	uni.addCourse(tF_mtrkl.getText(),tF_lvastu.getText());
				if(bool){
					lb_Mesajstudoz.setText("Student erfolgreich Angemeldet.");
				}else
					lb_Mesajstudoz.setText("Falsche Eingabe/Student existiert nicht/Student existiert in diser LVA.");
			}
		});
		
		tF_lvastulist = new JTextField();
		tF_lvastulist.setColumns(10);
		tF_lvastulist.setBounds(163, 185, 86, 20);
		panel_einstellung.add(tF_lvastulist);
		
		tF_lvadozlist = new JTextField();
		tF_lvadozlist.setColumns(10);
		tF_lvadozlist.setBounds(453, 185, 86, 20);
		panel_einstellung.add(tF_lvadozlist);
		bt_anmelden.setBounds(51, 97, 92, 23);
		panel_einstellung.add(bt_anmelden);
		
		JButton bt_abStu = new JButton("Abmelden");
		bt_abStu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean bool = 	uni.dropCourse(tF_mtrkl.getText(),tF_lvastu.getText());
				if(bool){
					lb_Mesajstudoz.setText("Student erfolgreich Abgemeldet.");
				}else{
					lb_Mesajstudoz.setText("Falsche Eingabe/Student existiert nicht/Student existiert in diser LVA nicht.");
				}
			}
		});
		bt_abStu.setBounds(157, 97, 92, 22);
		panel_einstellung.add(bt_abStu);
		
		JButton bt_zuweisen = new JButton("Zuweisen");
		bt_zuweisen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean bool = 	uni.dozZuweisen(tF_tc.getText(),tF_lvadoz.getText());
				if(bool){
					lb_Mesajstudoz.setText("Dozent erfolgreich Zugewiesen.");
				}else
					lb_Mesajstudoz.setText("Falsche Eingabe/Dozent existiert nicht/Dozent existiert in diser LVA.");
			}
		});
		
		bt_zuweisen.setBounds(340, 97, 92, 23);
		panel_einstellung.add(bt_zuweisen);
		
		JButton bt_abDoz = new JButton("Abmelden");
		bt_abDoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean bool = 	uni.dozDrop(tF_tc.getText(),tF_lvadoz.getText());
				if(bool){
					lb_Mesajstudoz.setText("Dozent erfolgreich Abgemeldet.");
				}else{
					lb_Mesajstudoz.setText("Falsche Eingabe/Dozent existiert nicht/Dozent existiert in diser LVA nicht.");
				}
			}
		});
		
		bt_abDoz.setBounds(447, 97, 92, 23);
		panel_einstellung.add(bt_abDoz);
		
		JButton bt_lvaStuList = new JButton("Studenten Listen");
		bt_lvaStuList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( LVA.checklva(tF_lvastulist.getText())== true){
            		lb_StuDozListen.setText(uni.studentsOfLVA(tF_lvastulist.getText()));
            	}else
            		lb_StuDozListen.setText("Falsche Eingabe.");
			}
		});
		
		bt_lvaStuList.setBounds(51, 213, 137, 23);
		panel_einstellung.add(bt_lvaStuList);
		
		JButton bt_lvaDozList = new JButton("Dozenten Listen");
		bt_lvaDozList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( LVA.checklva(tF_lvadozlist.getText())== true){
            		lb_StuDozListen.setText(uni.dozentsOfLVA(tF_lvadozlist.getText()));
            	}else
            		lb_StuDozListen.setText("Falsche Eingabe.");
			}
		});
		bt_lvaDozList.setBounds(340, 213, 137, 23);
		panel_einstellung.add(bt_lvaDozList);
		
		JLabel lblI = new JLabel("I\r\n");
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		lblI.setFont(new Font("Corbel", Font.PLAIN, 99));
		lblI.setBounds(249, 11, 86, 68);
		panel_einstellung.add(lblI);
		
		JLabel label_12 = new JLabel("I\r\n");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Corbel", Font.PLAIN, 99));
		label_12.setBounds(249, 67, 86, 68);
		panel_einstellung.add(label_12);
		
		JLabel label_14 = new JLabel("I\r\n");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Corbel", Font.PLAIN, 99));
		label_14.setBounds(249, 181, 86, 68);
		panel_einstellung.add(label_14);
		
		table_LVAs.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				int i = table_LVAs.getSelectedRow();
				if(i>=0){
					tF_lva.setText((String) table_LVAs.getModel().getValueAt(i,0));
					tF_stunde.setText((String) table_LVAs.getModel().getValueAt(i,1));
				}
			}
		});
	}	
}
