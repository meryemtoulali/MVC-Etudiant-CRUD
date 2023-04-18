package MVCEtudiant;
import java.lang.String;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.awt.event.*;

public class EtudiantView {
	private JFrame frame;
	private JButton bAjouter, bModifier, bSupprimer, bClear;
	private JTextField tfId, tfNom, tfCNE, tfNote, tfTelephone;
	private JTable table;
	private AbstractTableModel model;
	private EtudiantController controller;
	private List<Etudiant> listeEtudiants;
	
//	void printEtudiant(String CNE, int no, String nom, double note, String telephone) {
//		System.out.println("Etudiant : \n");
//		System.out.println("CNE : " + CNE);
//		System.out.println("Numero : " + no);
//		System.out.println("Nom : " + nom);
//		System.out.println("Note : " + note);
//		System.out.println("Telephone : " + telephone);
//	}
	
	public EtudiantView(EtudiantController controller) {
		this.controller = controller;
	}
	
	private void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}
	
	public void start() {
		frame = new JFrame("My First GUI");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(900,500);
	    
	    JLabel lId = new JLabel("Id :");
	    lId.setBounds(50, 50, 80, 30);
	    JLabel lCNE = new JLabel("CNE :");
	    lCNE.setBounds(50, 90, 80, 30);
	    JLabel lNom = new JLabel("Nom :");
	    lNom.setBounds(50, 130, 80, 30);
	    JLabel lNote = new JLabel("Note :");
	    lNote.setBounds(50, 170, 80, 30);
	    JLabel lTelephone = new JLabel("Telephone :");
	    lTelephone.setBounds(50, 210, 80, 30);
	    
	    tfId = new JTextField();
	    tfId.setBounds(160, 50, 200, 30);
	    tfCNE = new JTextField();
	    tfCNE.setBounds(160, 90, 200, 30);
	    tfNom = new JTextField();
	    tfNom.setBounds(160, 130, 200, 30);
	    tfNote = new JTextField();
	    tfNote.setBounds(160, 170, 200, 30);
	    tfTelephone = new JTextField();
	    tfTelephone.setBounds(160, 210, 200, 30);
	    
	    
	    
	    // buttons
	    
	    bAjouter = new JButton("Ajouter");
	    bAjouter.setBounds(50, 300, 100, 40);
	    bModifier = new JButton("Modifier");
	    bModifier.setBounds(160, 300, 100, 40);
	    bSupprimer = new JButton("Supprimer");
	    bSupprimer.setBounds(270, 300, 100, 40);
	    bClear = new JButton("Clear");
	    bClear.setBounds(50, 350, 100, 40);
	    
	    // button click events
	    bAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bAjouterAction(e);
            }
        });
	    bModifier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bModifierAction(e);
            }
        });
	    bSupprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bSupprimerAction(e);
            }
        });
	    bClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bClearAction(e);
            }
        });
	    
	    
	    //data table
	    setListeEtudiants(controller.listEtudiants());
	    table = new JTable();
	    model = new TableModel(listeEtudiants);
	    table.setModel(model);
	    
	    	    
	    JScrollPane scrol = new JScrollPane(table);
	    scrol.setBounds(400,30,450,400);
	    
	    	    
	    //table selection shenanigans
	    ListSelectionModel cellSelectionModel = table.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
	        public void valueChanged(ListSelectionEvent e) {
	          String selectedData = null;

	          int[] selectedRows = table.getSelectedRows();
	          //int[] selectedColumns = table.getSelectedColumns();
	          
	          if(selectedRows.length > 0) {
	        	  tfId.setText(table.getValueAt(selectedRows[0], 0).toString());
		          tfCNE.setText((String) table.getValueAt(selectedRows[0], 1));
		          tfNom.setText((String) table.getValueAt(selectedRows[0], 2));
		          tfNote.setText(table.getValueAt(selectedRows[0], 3).toString());
		          tfTelephone.setText((String) table.getValueAt(selectedRows[0], 4));
	          }
	          
	          
	          
	          
	          //clear selection
	          //table.getSelectionModel().clearSelection();
	          
//	          for (int i = 0; i < selectedRows.length; i++) {
//	              for (int j = 0; j < selectedColumns.length; j++) {
//	                selectedData = (String) table.getValueAt(selectedRows[i], selectedColumns[j]).toString();
//	              }
//	            }
//	            System.out.println("Selected: " + selectedData);

	          //String value = (String) table.getValueAt(selectedRows[0], selectedColumns[0]);
	          //tfId.setText(value.toString());
	          //System.out.println((String) table.getValueAt(selectedRows[0], 0));
	          
	        }

	      });
	    
	    
	    
	    frame.add(scrol);
	    
	        
	    //add labels to frame
	    frame.add(lId);
	    frame.add(lCNE);
	    frame.add(lNom);
	    frame.add(lNote);
	    frame.add(lTelephone);
	    
	    //add textfields
	    frame.add(tfId);
	    frame.add(tfCNE);
	    frame.add(tfNom);
	    frame.add(tfNote);
	    frame.add(tfTelephone);
	    
	    //add buttons
	    frame.add(bAjouter);
	    frame.add(bModifier);
	    frame.add(bSupprimer);
	    frame.add(bClear);
	    
	    
	    
	    
	    //display
	    frame.setLayout(null);
	    frame.setVisible(true);
	    
	    clear(); //first run

	}
	
	
	private void afficher() {
		for(Etudiant e : listeEtudiants) {
			int id = e.getId();
		    String cne = e.getCNE();
		    String nom = e.getNom();
		    double note = e.getNote();
		    String telephone = e.getTelephone();
		    System.out.println(id + ", " + cne + ", " + nom + ", " + note + ", " + telephone);
		}
	}
	
	private void refreshTable() {
		model = new TableModel(listeEtudiants);
	    table.setModel(model);
	}
	
	private void bAjouterAction(ActionEvent e) {
		int id = -1;
		if(tfId.getText().length() > 0) {
			id = Integer.parseInt(tfId.getText());
		}
		
		String CNE = tfCNE.getText();
		String nom = tfNom.getText();
		double note = Double.parseDouble(tfNote.getText());
		String telephone = tfTelephone.getText();
		Etudiant etudiant = new Etudiant(id, CNE, nom, note, telephone);
		controller.addEtudiant(etudiant);
		clear();
		setListeEtudiants(controller.listEtudiants());
		afficher();
		refreshTable();
	}
	
	
	
	private void bModifierAction(ActionEvent e) {
		int id = Integer.parseInt(tfId.getText());
		String CNE = tfCNE.getText();
		String nom = tfNom.getText();
		double note = Double.parseDouble(tfNote.getText());
		String telephone = tfTelephone.getText();
		Etudiant etudiant = new Etudiant(id, CNE, nom, note, telephone);
		controller.updateEtudiant(etudiant);
		clear();
		setListeEtudiants(controller.listEtudiants());
		afficher();
		refreshTable();
	}
	
	private void bSupprimerAction(ActionEvent e) {
		int id = Integer.parseInt(tfId.getText());
		controller.deleteEtudiant(id);
		clear();
		setListeEtudiants(controller.listEtudiants());
		afficher();
		refreshTable();
	}
	
	private void bClearAction(ActionEvent e) {
		clear();
	}
	
	private void clear() {
		tfId.setText("");
		tfCNE.setText("");
		tfNom.setText("");
		tfNote.setText("");
		tfTelephone.setText("");
				
	}
	
	
	
}
