package MVCEtudiant;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//?
	List<Etudiant> listeEtudiants;
	String headerList[] = new String[]{"Id", "CNE","Nom","Note","Telephone"};
	Class[] columnClass = new Class[] {
	        Integer.class, String.class, String.class, Double.class, String.class
	    };
	
	public TableModel(List<Etudiant> liste){
		this.listeEtudiants = liste;
	}

	@Override
	public int getColumnCount() {
		return 5;
	}
	
	//display the name of columns
	@Override
	public String getColumnName(int col) {
		return headerList[col];
	}
	
	@Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }
		
		
	@Override
	public int getRowCount(){
		return listeEtudiants.size();
	}

	// this method is called to set the value of each cell
	@Override
	public Object getValueAt(int row, int column) {
		Etudiant entity = listeEtudiants.get(row);
		switch (column) {
			case 0:
				return entity.getId();
			case 1:
				return entity.getCNE();
			case 2:
				return entity.getNom();
			case 3:
				return entity.getNote();
			case 4:
				return entity.getTelephone();
		}
		return null;
	}
	
	
}
