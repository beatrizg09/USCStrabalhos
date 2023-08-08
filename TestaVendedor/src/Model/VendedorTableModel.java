
package Model;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendedorTableModel extends AbstractTableModel {
    
    private List<Vendedor2> dados = new ArrayList<>();
    private String[] colunas = {"Nome","CPF","Telefone","ID"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    

    @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas. length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1: 
                return dados.get(linha).getCpf();
            case 2:
                return dados.get(linha).getTelefone();
            case 3: 
                return dados.get(linha).getID();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
       
        switch(coluna){
            case 0:
               dados.get(linha).setNome((String)valor);
               break;
            case 1: 
               dados.get(linha).setCpf((String)valor);
               break;
            case 2:
               dados.get(linha).setTelefone((String)valor);
               break;
            case 3: 
               dados.get(linha).setID(Integer.parseInt((String)valor));
               break;
        
    }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    
    
    
     public void addRow(Vendedor2 v){
        this.dados.add(v);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
          
}
