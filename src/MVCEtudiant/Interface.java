package MVCEtudiant;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Interface extends JFrame{

	public static void main(String[] args) {

		JFrame frame = new JFrame("Exemple de gestion des étudiants");
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		/* le panel initiale qui sera diviser en 5 parties*/
		JPanel panelInitiale = new JPanel();
		panelInitiale.setLayout(new BorderLayout());
		
		
		
		/*____________________________________________________________________________________________________________________________________*/
	   /*____________________________________________________________________________________________________________________________________*/
	  /*____________________________________________________________________________________________________________________________________*/
	 /*______________________________________________________ pour centre  ________________________________________________________________*/
    /*____________________________________________________________________________________________________________________________________*/
   /*____________________________________________________________________________________________________________________________________*/
  /*____________________________________________________________________________________________________________________________________*/	
		
		
		 /* panel central */
	    JPanel panelCenter = new JPanel();
	    panelCenter.setLayout(new GridLayout(1,2));
	    /* les sous panel du panel central gauche et droite*/
	    JPanel panelCenterGauche = new JPanel();
	    panelCenterGauche.setLayout(new GridLayout(5,2)); // gauche avec 5 ligne et 2 colonnes
	    JPanel panelCenterDroite = new JPanel();
	    panelCenterDroite.setLayout(new GridLayout(3,1)); // droite avec 3 lignes et 1 seule colonne
	    /*ajouter les sous panels gauche et droite au panel centrale*/
	    panelCenter.add(panelCenterGauche);
	    panelCenter.add(panelCenterDroite);
	    /* déclaration des labels*/
	    JLabel id = new JLabel("ID : ");
	    JLabel nom = new JLabel("Nom : ");
	    JLabel prenom = new JLabel("Prénom : ");
	    JLabel dateDeNaissance = new JLabel("Date De Naissance : ");
	    /* déclaration des text field*/
	    JTextField idTxt = new JTextField();
	    JTextField nomTxt = new JTextField();
	    JTextField prenomTxt = new JTextField();
	    JTextField dateDeNaissanceTxt = new JTextField();
	    /*____________________________________________________________________________________________________*/
	    /*_____________________________________________ pour id _____________________________________________*/	
	    /*__________________________________________________________________________________________________*/
	    /* pour label du id*/
	    JPanel panelCenterGauche1 = new JPanel();
	    JLabel vide11 = new JLabel(" ");
	    JLabel vide12 = new JLabel(" ");
	    JLabel vide13 = new JLabel(" ");
	    panelCenterGauche1.setLayout(new GridLayout(3,2));
	    panelCenterGauche1.add(vide11);
	    panelCenterGauche1.add(vide12);
	    panelCenterGauche1.add(vide13);
	    panelCenterGauche1.add(id);
	    /* pour textBox du id */
	    JPanel panelCenterGauche2 = new JPanel();
	    JLabel vide2 = new JLabel(" ");
	    panelCenterGauche2.setLayout(new GridLayout(3,1));
	    panelCenterGauche2.add(vide2);
	    panelCenterGauche2.add(idTxt);
	    /*____________________________________________________________________________________________________*/
	    /*_____________________________________________ pour nom ____________________________________________*/	
	    /*__________________________________________________________________________________________________*/
	    /* pour label du id*/
	    JPanel panelCenterGauche3 = new JPanel();
	    JLabel vide31 = new JLabel(" ");
	    JLabel vide32 = new JLabel(" ");
	    JLabel vide33 = new JLabel(" ");
	    panelCenterGauche3.setLayout(new GridLayout(3,2));
	    panelCenterGauche3.add(vide31);
	    panelCenterGauche3.add(vide32);
	    panelCenterGauche3.add(vide33);
	    panelCenterGauche3.add(nom);
	    /* pour textBox du id */
	    JPanel panelCenterGauche4 = new JPanel();
	    JLabel vide3 = new JLabel(" ");
	    panelCenterGauche4.setLayout(new GridLayout(3,1));
	    panelCenterGauche4.add(vide3);
	    panelCenterGauche4.add(nomTxt);
	    /*____________________________________________________________________________________________________*/
	    /*_____________________________________________ pour prenom ____________________________________________*/	
	    /*__________________________________________________________________________________________________*/
	    /* pour label du id*/
	    JPanel panelCenterGauche5 = new JPanel();
	    JLabel vide51 = new JLabel(" ");
	    JLabel vide52 = new JLabel(" ");
	    JLabel vide53 = new JLabel(" ");
	    panelCenterGauche5.setLayout(new GridLayout(3,2));
	    panelCenterGauche5.add(vide51);
	    panelCenterGauche5.add(vide52);
	    panelCenterGauche5.add(vide53);
	    panelCenterGauche5.add(prenom);
	    /* pour textBox du id */
	    JPanel panelCenterGauche6 = new JPanel();
	    JLabel vide6 = new JLabel(" ");
	    panelCenterGauche6.setLayout(new GridLayout(3,1));
	    panelCenterGauche6.add(vide6);
	    panelCenterGauche6.add(prenomTxt);
	    
	    /*____________________________________________________________________________________________________*/
	    /*________________________________________ pour date De Naissance ___________________________________*/	
	    /*__________________________________________________________________________________________________*/
	    /* pour label du id*/
	    JPanel panelCenterGauche7 = new JPanel();
	    JLabel vide71 = new JLabel(" ");
	    JLabel vide72 = new JLabel(" ");
	    JLabel vide73 = new JLabel(" ");
	    panelCenterGauche7.setLayout(new GridLayout(3,2));
	    panelCenterGauche7.add(vide71);
	    panelCenterGauche7.add(vide72);
	    panelCenterGauche7.add(vide73);
	    panelCenterGauche7.add(dateDeNaissance);
	    /* pour textBox du id */
	    JPanel panelCenterGauche8 = new JPanel();
	    JLabel vide8 = new JLabel(" ");
	    panelCenterGauche8.setLayout(new GridLayout(3,1));
	    panelCenterGauche8.add(vide8);
	    panelCenterGauche8.add(dateDeNaissanceTxt);
	    
	    
	    JPanel panelCenterGauche9 = new JPanel();
	    /*____________________________________________________________________________________________________*/
	    /*_____________________________________________ pour le sexe ________________________________________*/	
	    /*__________________________________________________________________________________________________*/
	    
	    JPanel panelCenterGauche10 = new JPanel();
	    ButtonGroup group = new ButtonGroup();
	    
	    JRadioButton homme = new JRadioButton("Homme");
	    JRadioButton femme = new JRadioButton("Femme");
	    homme.setActionCommand("Homme");
	    femme.setActionCommand("Femme");
	    group.add(homme);
	    group.add(femme);
	    panelCenterGauche10.add(homme);
	    panelCenterGauche10.add(femme);
	    panelCenterGauche10.setBorder(BorderFactory.createTitledBorder("Sexe"));
	    
	    
	    /* ajouter les labels dans le panel gauche */
	    panelCenterGauche.add(panelCenterGauche1);
	    panelCenterGauche.add(panelCenterGauche2);
	    panelCenterGauche.add(panelCenterGauche3);
	    panelCenterGauche.add(panelCenterGauche4);
	    panelCenterGauche.add(panelCenterGauche5);
	    panelCenterGauche.add(panelCenterGauche6);
	    panelCenterGauche.add(panelCenterGauche7);
	    panelCenterGauche.add(panelCenterGauche8);
	    panelCenterGauche.add(panelCenterGauche9);
	    panelCenterGauche.add(panelCenterGauche10);
	    
/*____________________________________________________________________________________________________________________________________*/
/*_____________________________________________________ pour la partie droite _______________________________________________________*/
/*__________________________________________________________________________________________________________________________________*/
	    
	    /*_____________________________________________ Comobobox _____________________________________________ */
	   JPanel panelCenterDroite1 = new JPanel();
	   panelCenterDroite1.setLayout(new GridLayout(3,3));
	   JLabel videDroite11 = new JLabel(" ");
	   JLabel videDroite12 = new JLabel(" ");
	   JLabel videDroite13 = new JLabel(" ");
	   JLabel videDroite14 = new JLabel(" ");
	   JLabel videDroite15 = new JLabel(" ");
	   JLabel videDroite16 = new JLabel(" ");
	   JLabel videDroite17 = new JLabel(" ");
	   JLabel videDroite18 = new JLabel(" ");
	   JLabel videDroite19 = new JLabel(" ");
	  String[] petStrings = { "Fenetre", "Choix 1", "Choix 2", "Choix 3", "Choix 4" };
	  //Create the combo box, select item at index 4.
	  //Indices start at 0, so 4 specifies the pig.
	  JComboBox petList = new JComboBox(petStrings);
	  petList.setSelectedIndex(0);
	  panelCenterDroite1.add(videDroite11);
	  panelCenterDroite1.add(videDroite12);
	  panelCenterDroite1.add(videDroite13);
	  panelCenterDroite1.add(videDroite14);
	  panelCenterDroite1.add(videDroite15);
	  panelCenterDroite1.add(videDroite16);
	  panelCenterDroite1.add(videDroite17);
	  panelCenterDroite1.add(petList);
	  panelCenterDroite1.add(videDroite18);
	  panelCenterDroite.add(panelCenterDroite1);
	  
	  /*_____________________________________________ jtextArea _____________________________________________ */
	  
	   JPanel panelCenterDroite2 = new JPanel();
	   //panelCenterDroite2.setLayout(new GridLayout(1,3));
	   panelCenterDroite2.setLayout(new BorderLayout());
	   JLabel videDroite21 = new JLabel("                           ");
	   JLabel videDroite22 = new JLabel("                           ");
	   JLabel videDroite23 = new JLabel("                           ");
	   JLabel videDroite24 = new JLabel("                           ");
	  JTextArea textArea = new JTextArea(10,10);
	  JScrollPane scrollBar = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	  //scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	  panelCenterDroite2.add(videDroite21,BorderLayout.NORTH);
	  panelCenterDroite2.add(videDroite23,BorderLayout.SOUTH);
	  panelCenterDroite2.add(videDroite24,BorderLayout.EAST);
	  panelCenterDroite2.add(scrollBar);
	  panelCenterDroite2.add(textArea,BorderLayout.CENTER);
	  panelCenterDroite2.add(videDroite22,BorderLayout.WEST);
	  panelCenterDroite.add(panelCenterDroite2);
	  
		
		
	 /*____________________________________________________________________________________________________________________________________*/
    /*____________________________________________________________________________________________________________________________________*/
   /*____________________________________________________________________________________________________________________________________*/
  /*____________________________________________________________________________________________________________________________________*/
 /*____________________________________________________________________________________________________________________________________*/
/*____________________________________________________________________________________________________________________________________*/		
		
		
		
		
		
		/*____________________________________________________________________________________________________________________________________*/
	   /*____________________________________________________________________________________________________________________________________*/
	  /*____________________________________________________________________________________________________________________________________*/
	 /*______________________________________________________ pour footer  ________________________________________________________________*/
    /*____________________________________________________________________________________________________________________________________*/
   /*____________________________________________________________________________________________________________________________________*/
  /*____________________________________________________________________________________________________________________________________*/
		JPanel panelFooter = new JPanel();
		panelFooter.setLayout(new FlowLayout());
		JLabel espaceButton1 = new JLabel("                           ");
		JLabel espaceButton2 = new JLabel("                           ");
		JLabel espaceButton3 = new JLabel("                           ");
		JButton ajouter = new JButton("ajouter");
		JButton vider = new JButton("vider");
		JButton Quitter = new JButton("Quitter");
		
		panelFooter.add(ajouter);
		panelFooter.add(espaceButton1);
		panelFooter.add(vider);
		panelFooter.add(espaceButton2);
		panelFooter.add(Quitter);
		 /*________________________________________________________________________________________*/ 
		/*_________________ les événements pour les clique de bouton (Quitter)____________________*/
	   /*________________________________________________________________________________________*/
		Quitter.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			  frame.setVisible(false);
			  System.out.println("la fenetre doit être fermer");
		  }
		});
		
		/*__________________________________________________________________________________________*/ 
		/*_________________ les événements pour les clique de bouton (Ajouter) ____________________*/
	   /*_________________________________________________________________________________________*/
		ajouter.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			 
			  System.out.println("l'étudiant doit être ajouté");
			  String nom,prenom,dateDeNaissance,sexe;
			  nom = nomTxt.getText();
			  prenom = prenomTxt.getText();
			  dateDeNaissance = dateDeNaissanceTxt.getText();
			  sexe = group.getSelection().getActionCommand();
			  textArea.append("Id : "+idTxt.getText()+"; nom : "+ nom + " ; prénom : "+prenom+ "; Date de Naissance : "+ dateDeNaissance+"; Sexe : "+ sexe+"\n");
			  System.out.println("Id : "+idTxt.getText()+"; nom : "+ nom + " ; prénom : "+prenom+ "; Date de Naissance : "+ dateDeNaissance+"; Sexe : "+ sexe);
		  }
		});
		 /*_________________________________________________________________________________________*/ 
		/*_________________ les événements pour les clique de bouton (Ajouter) ____________________*/
	   /*_________________________________________________________________________________________*/
		vider.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			
			  textArea.setText(" ");
			  System.out.println("c'est vidé avec succes");
		  }
		});
		
				/*____________________________________________________________________________________________________________________________________*/
			   /*____________________________________________________________________________________________________________________________________*/
			  /*____________________________________________________________________________________________________________________________________*/
		     /*____________________________________________________________________________________________________________________________________*/
			/*____________________________________________________________________________________________________________________________________*/
		   /*____________________________________________________________________________________________________________________________________*/
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* pour chaque partie on crée  une fonction qui s'occupe de créer les éléments */
		panelInitiale.add(creerMenu(), BorderLayout.NORTH);
		panelInitiale.add(panelFooter, BorderLayout.SOUTH);
		panelInitiale.add(panelCenter, BorderLayout.CENTER);
		
		frame.add(panelInitiale);
		frame.setVisible(true);
		
	

	}


		/*_________________________ la fonction du menu en hait _________________________*/ 
		private static Component creerMenu() {
			
			/*  création du menu global*/
			JMenuBar menuBar = new JMenuBar();
			/*création des éléments du menu*/
			 JMenu test1 = new JMenu("Fichier");
			 JMenu test2 = new JMenu("Help");
			 /* création des sous partie de chacune des éléments*/
			 JMenuItem item1 = new JMenuItem("ouvrir");
			 JMenuItem item2= new JMenuItem("online help");
			 /* ajouter un sous élément dans un élément*/
			 test1.add(item1);
			 test2.add(item2);
			 menuBar.add(test1);
			 menuBar.add(test2);
			 
			return menuBar;

	}
		/*_________________________ la fonction du menu en bas _________________________*/ 
		private static Component creeFooter() {
			JPanel panelFooter = new JPanel();
			panelFooter.setLayout(new FlowLayout());
			
			JButton ajouter = new JButton("ajouter");
			JButton vider = new JButton("vider");
			JButton Quitter = new JButton("Quitter");
			
			panelFooter.add(ajouter);
			panelFooter.add(vider);
			panelFooter.add(Quitter);
		 /*_______________________________________________________________________________*/ 
		/*_________________ les événements pour les clique de bouton ____________________*/
	   /*_______________________________________________________________________________*/
			Quitter.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  
				  System.out.println("la fenetre doit être fermer");
			  }
			});
			
		return panelFooter;
	}
		
	/*_________________________ la fonction du menu en bas _________________________*/ 
	   private static Component CreerCentre() {
		   /* panel central */
		    JPanel panelCenter = new JPanel();
		    panelCenter.setLayout(new GridLayout(1,2));
		    /* les sous panel du panel central gauche et droite*/
		    JPanel panelCenterGauche = new JPanel();
		    panelCenterGauche.setLayout(new GridLayout(5,2)); // gauche avec 5 ligne et 2 colonnes
		    JPanel panelCenterDroite = new JPanel();
		    panelCenterDroite.setLayout(new GridLayout(3,1)); // droite avec 3 lignes et 1 seule colonne
		    /*ajouter les sous panels gauche et droite au panel centrale*/
		    panelCenter.add(panelCenterGauche);
		    panelCenter.add(panelCenterDroite);
		    /* déclaration des labels*/
		    JLabel id = new JLabel("ID : ");
		    JLabel nom = new JLabel("Nom : ");
		    JLabel prenom = new JLabel("Prénom : ");
		    JLabel dateDeNaissance = new JLabel("Date De Naissance : ");
		    /* déclaration des text field*/
		    JTextField idTxt = new JTextField();
		    JTextField nomTxt = new JTextField();
		    JTextField prenomTxt = new JTextField();
		    JTextField dateDeNaissanceTxt = new JTextField();
		    /*____________________________________________________________________________________________________*/
		    /*_____________________________________________ pour id _____________________________________________*/	
		    /*__________________________________________________________________________________________________*/
		    /* pour label du id*/
		    JPanel panelCenterGauche1 = new JPanel();
		    JLabel vide11 = new JLabel(" ");
		    JLabel vide12 = new JLabel(" ");
		    JLabel vide13 = new JLabel(" ");
		    panelCenterGauche1.setLayout(new GridLayout(3,2));
		    panelCenterGauche1.add(vide11);
		    panelCenterGauche1.add(vide12);
		    panelCenterGauche1.add(vide13);
		    panelCenterGauche1.add(id);
		    /* pour textBox du id */
		    JPanel panelCenterGauche2 = new JPanel();
		    JLabel vide2 = new JLabel(" ");
		    panelCenterGauche2.setLayout(new GridLayout(3,1));
		    panelCenterGauche2.add(vide2);
		    panelCenterGauche2.add(idTxt);
		    /*____________________________________________________________________________________________________*/
		    /*_____________________________________________ pour nom ____________________________________________*/	
		    /*__________________________________________________________________________________________________*/
		    /* pour label du id*/
		    JPanel panelCenterGauche3 = new JPanel();
		    JLabel vide31 = new JLabel(" ");
		    JLabel vide32 = new JLabel(" ");
		    JLabel vide33 = new JLabel(" ");
		    panelCenterGauche3.setLayout(new GridLayout(3,2));
		    panelCenterGauche3.add(vide31);
		    panelCenterGauche3.add(vide32);
		    panelCenterGauche3.add(vide33);
		    panelCenterGauche3.add(nom);
		    /* pour textBox du id */
		    JPanel panelCenterGauche4 = new JPanel();
		    JLabel vide3 = new JLabel(" ");
		    panelCenterGauche4.setLayout(new GridLayout(3,1));
		    panelCenterGauche4.add(vide3);
		    panelCenterGauche4.add(nomTxt);
		    /*____________________________________________________________________________________________________*/
		    /*_____________________________________________ pour prenom ____________________________________________*/	
		    /*__________________________________________________________________________________________________*/
		    /* pour label du id*/
		    JPanel panelCenterGauche5 = new JPanel();
		    JLabel vide51 = new JLabel(" ");
		    JLabel vide52 = new JLabel(" ");
		    JLabel vide53 = new JLabel(" ");
		    panelCenterGauche5.setLayout(new GridLayout(3,2));
		    panelCenterGauche5.add(vide51);
		    panelCenterGauche5.add(vide52);
		    panelCenterGauche5.add(vide53);
		    panelCenterGauche5.add(prenom);
		    /* pour textBox du id */
		    JPanel panelCenterGauche6 = new JPanel();
		    JLabel vide6 = new JLabel(" ");
		    panelCenterGauche6.setLayout(new GridLayout(3,1));
		    panelCenterGauche6.add(vide6);
		    panelCenterGauche6.add(prenomTxt);
		    
		    /*____________________________________________________________________________________________________*/
		    /*________________________________________ pour date De Naissance ___________________________________*/	
		    /*__________________________________________________________________________________________________*/
		    /* pour label du id*/
		    JPanel panelCenterGauche7 = new JPanel();
		    JLabel vide71 = new JLabel(" ");
		    JLabel vide72 = new JLabel(" ");
		    JLabel vide73 = new JLabel(" ");
		    panelCenterGauche7.setLayout(new GridLayout(3,2));
		    panelCenterGauche7.add(vide71);
		    panelCenterGauche7.add(vide72);
		    panelCenterGauche7.add(vide73);
		    panelCenterGauche7.add(dateDeNaissance);
		    /* pour textBox du id */
		    JPanel panelCenterGauche8 = new JPanel();
		    JLabel vide8 = new JLabel(" ");
		    panelCenterGauche8.setLayout(new GridLayout(3,1));
		    panelCenterGauche8.add(vide8);
		    panelCenterGauche8.add(dateDeNaissanceTxt);
		    
		    
		    JPanel panelCenterGauche9 = new JPanel();
		    /*____________________________________________________________________________________________________*/
		    /*_____________________________________________ pour le sexe ________________________________________*/	
		    /*__________________________________________________________________________________________________*/
		    
		    JPanel panelCenterGauche10 = new JPanel();
		    ButtonGroup group = new ButtonGroup();
		    
		    JRadioButton homme = new JRadioButton("Homme");
		    JRadioButton femme = new JRadioButton("Femme");
		    group.add(homme);
		    group.add(femme);
		    panelCenterGauche10.add(homme);
		    panelCenterGauche10.add(femme);
		    panelCenterGauche10.setBorder(BorderFactory.createTitledBorder("Sexe"));
		    
		    
		    /* ajouter les labels dans le panel gauche */
		    panelCenterGauche.add(panelCenterGauche1);
		    panelCenterGauche.add(panelCenterGauche2);
		    panelCenterGauche.add(panelCenterGauche3);
		    panelCenterGauche.add(panelCenterGauche4);
		    panelCenterGauche.add(panelCenterGauche5);
		    panelCenterGauche.add(panelCenterGauche6);
		    panelCenterGauche.add(panelCenterGauche7);
		    panelCenterGauche.add(panelCenterGauche8);
		    panelCenterGauche.add(panelCenterGauche9);
		    panelCenterGauche.add(panelCenterGauche10);
		    
/*____________________________________________________________________________________________________________________________________*/
/*_____________________________________________________ pour la partie droite _______________________________________________________*/
/*__________________________________________________________________________________________________________________________________*/
		    
		    /*_____________________________________________ Comobobox _____________________________________________ */
		   JPanel panelCenterDroite1 = new JPanel();
		   panelCenterDroite1.setLayout(new GridLayout(3,3));
		   JLabel videDroite11 = new JLabel(" ");
		   JLabel videDroite12 = new JLabel(" ");
		   JLabel videDroite13 = new JLabel(" ");
		   JLabel videDroite14 = new JLabel(" ");
		   JLabel videDroite15 = new JLabel(" ");
		   JLabel videDroite16 = new JLabel(" ");
		   JLabel videDroite17 = new JLabel(" ");
		   JLabel videDroite18 = new JLabel(" ");
		   JLabel videDroite19 = new JLabel(" ");
		  String[] petStrings = { "Fenetre", "Choix 1", "Choix 2", "Choix 3", "Choix 4" };
		  //Create the combo box, select item at index 4.
		  //Indices start at 0, so 4 specifies the pig.
		  JComboBox petList = new JComboBox(petStrings);
		  petList.setSelectedIndex(0);
		  panelCenterDroite1.add(videDroite11);
		  panelCenterDroite1.add(videDroite12);
		  panelCenterDroite1.add(videDroite13);
		  panelCenterDroite1.add(videDroite14);
		  panelCenterDroite1.add(videDroite15);
		  panelCenterDroite1.add(videDroite16);
		  panelCenterDroite1.add(videDroite17);
		  panelCenterDroite1.add(petList);
		  panelCenterDroite1.add(videDroite18);
		  panelCenterDroite.add(panelCenterDroite1);
		  
		  /*_____________________________________________ jtextArea _____________________________________________ */
		  
		   JPanel panelCenterDroite2 = new JPanel();
		   //panelCenterDroite2.setLayout(new GridLayout(1,3));
		   panelCenterDroite2.setLayout(new BorderLayout());
		   JLabel videDroite21 = new JLabel(" ");
		   JLabel videDroite22 = new JLabel(" ");
		   JLabel videDroite23 = new JLabel(" ");
		   JLabel videDroite24 = new JLabel(" ");
		  JTextArea textArea = new JTextArea();
		  panelCenterDroite2.add(videDroite21,BorderLayout.NORTH);
		  panelCenterDroite2.add(videDroite23,BorderLayout.SOUTH);
		  panelCenterDroite2.add(videDroite24,BorderLayout.EAST);
		  panelCenterDroite2.add(textArea,BorderLayout.CENTER);
		  panelCenterDroite2.add(videDroite22,BorderLayout.WEST);
		  panelCenterDroite.add(panelCenterDroite2);
		  
		return panelCenter;
	}

}