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
	
	public void setListeEtudiants(List<Etudiant> liste) {
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

	// this method is called to get the value of each cell
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
	
	@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
		Etudiant row = listeEtudiants.get(rowIndex);
        if(0 == columnIndex) {
            row.setId((Integer) aValue);
        }
        else if(1 == columnIndex) {
            row.setCNE((String) aValue);
        }
        else if(2 == columnIndex) {
            row.setNom((String) aValue);
        }
        else if(3 == columnIndex) {
            row.setNote((double) aValue);
        }
        else if(4 == columnIndex) {
            row.setTelephone((String) aValue);
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);

    }
	
	
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		return true;
	}
	
	
}
