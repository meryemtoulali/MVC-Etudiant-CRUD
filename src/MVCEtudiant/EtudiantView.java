package MVCEtudiant;
import java.lang.String;
import java.util.List;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;

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
	    frame.setSize(1200,600);
	    frame.getContentPane().setBackground(new java.awt.Color(255, 255, 255));

	    JLabel lTitre = new JLabel("Gestion des étudiants");
	    lTitre.setFont(new Font("Segoe UI", Font.PLAIN, 25));
	    lTitre.setBounds(50, 50, 300, 30);
	    JLabel lId = new JLabel("Id :");
	    lId.setBounds(50, 100, 80, 30);
	    JLabel lCNE = new JLabel("CNE :");
	    lCNE.setBounds(50, 140, 80, 30);
	    JLabel lNom = new JLabel("Nom :");
	    lNom.setBounds(50, 180, 80, 30);
	    JLabel lNote = new JLabel("Note :");
	    lNote.setBounds(50, 220, 80, 30);
	    JLabel lTelephone = new JLabel("Telephone :");
	    lTelephone.setBounds(50, 260, 80, 30);
	    
	    tfId = new JTextField();
	    tfId.setBounds(160, 100, 210, 30);
	    tfCNE = new JTextField();
	    tfCNE.setBounds(160, 140, 210, 30);
	    tfNom = new JTextField();
	    tfNom.setBounds(160, 180, 210, 30);
	    tfNote = new JTextField();
	    tfNote.setBounds(160, 220, 210, 30);
	    tfTelephone = new JTextField();
	    tfTelephone.setBounds(160, 260, 210, 30);
	    
	    
	    
	    // buttons
	    
	    bAjouter = new JButton("Ajouter");
	    bAjouter.setBounds(50, 340, 100, 40);
	    bAjouter.setBackground(Color.blue);
	    bAjouter.setBackground(new java.awt.Color(53, 129, 200));
	    bAjouter.setForeground(Color.white);
//	    bAjouter.setBorderPainted(false);
//	    bAjouter.setFocusPainted(false);
//	    bAjouter.setBorder(BorderFactory.createLineBorder(Color.red));
	   

	    //bModifier = new JButton("Modifier");
	    //bModifier.setBounds(160, 300, 100, 40);
	    bSupprimer = new JButton("Supprimer");
	    bSupprimer.setBounds(160, 340, 100, 40);
	    bSupprimer.setBackground(new java.awt.Color(235, 105, 45));
	    bSupprimer.setForeground(Color.white);
	    bClear = new JButton("Effacer");
	    bClear.setBounds(270, 340, 100, 40);
	    bClear.setBackground(new java.awt.Color(235, 244, 247));
	    
	    
	    // button click events
	    bAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bAjouterAction(e);
            }
        });
//	    bModifier.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            	bModifierAction(e);
//            }
//        });
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
	    table.getModel().addTableModelListener(new TableModelListener() {
	    	@Override
	    	public void tableChanged(TableModelEvent e) {
    		  int row = e.getFirstRow();
    		  int column = e.getColumn();
    		  TableModel model = (TableModel)e.getSource();
    		  //Object data = model.getValueAt(row, column);
    		  Etudiant etudiant = new Etudiant((int) model.getValueAt(row, 0), //id
    				  (String) model.getValueAt(row, 1), // cne
    				  (String) model.getValueAt(row, 2), //nom
    				  (double) model.getValueAt(row, 3), //note
    				  (String) model.getValueAt(row, 4)); //telephone
    			controller.updateEtudiant(etudiant);
    			clear();
    			setListeEtudiants(controller.listEtudiants());
    			afficher();
    			refreshTable();
    		}
        });
	    
	    // table search
	    
	    final TableRowSorter<TableModel> rowSorter
	    = new TableRowSorter<>((TableModel)table.getModel());
		
		final JTextField tfFilter = new JTextField();
		tfFilter.setBounds(550, 50, 250, 30);
		JLabel lbFilter = new JLabel("Rechercher :");
		lbFilter.setBounds(450,50,100,30);

	    //JButton bFilter = new JButton("Recherche");
		//bFilter.setBounds(630, 50, 100, 30);


	    table.setRowSorter(rowSorter);
	    
	    tfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = tfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
	    
	    //table style
	    table.setRowHeight(25);
	    table.setShowGrid(true);
	    table.setGridColor(Color.lightGray);
	    table.setSelectionBackground(new java.awt.Color(188, 218, 245));
        table.setSelectionForeground(Color.BLACK);
        




	    
	    
	    
	    JScrollPane scrol = new JScrollPane(table);
	    scrol.setBounds(450,100,700,400);
	    
	    	    
	    //table selection shenanigans
	    ListSelectionModel cellSelectionModel = table.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
	        public void valueChanged(ListSelectionEvent e) {
	          //String selectedData = null;

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
	    frame.add(lTitre);
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
	    //frame.add(bModifier);
	    frame.add(bSupprimer);
	    frame.add(bClear);
	    
	    //add search
	    frame.add(tfFilter);
	    //frame.add(bFilter);
	    frame.add(lbFilter);
	    
	    
	    
	    
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
	    table.getModel().addTableModelListener(new TableModelListener() {
	    	@Override
	    	public void tableChanged(TableModelEvent e) {
    		  int row = e.getFirstRow();
    		  int column = e.getColumn();
    		  TableModel model = (TableModel)e.getSource();
    		  //Object data = model.getValueAt(row, column);
    		  Etudiant etudiant = new Etudiant((int) model.getValueAt(row, 0), //id
    				  (String) model.getValueAt(row, 1), // cne
    				  (String) model.getValueAt(row, 2), //nom
    				  (double) model.getValueAt(row, 3), //note
    				  (String) model.getValueAt(row, 4)); //telephone
    			controller.updateEtudiant(etudiant);
    			clear();
    			setListeEtudiants(controller.listEtudiants());
    			afficher();
    			refreshTable();
    		}
        });
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
	
	
	
//	private void bModifierAction(ActionEvent e) {
//		int id = Integer.parseInt(tfId.getText());
//		String CNE = tfCNE.getText();
//		String nom = tfNom.getText();
//		double note = Double.parseDouble(tfNote.getText());
//		String telephone = tfTelephone.getText();
//		Etudiant etudiant = new Etudiant(id, CNE, nom, note, telephone);
//		controller.updateEtudiant(etudiant);
//		clear();
//		setListeEtudiants(controller.listEtudiants());
//		afficher();
//		refreshTable();
//	}
	
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
