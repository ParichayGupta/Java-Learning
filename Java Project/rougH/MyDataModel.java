import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
 
public class MyDataModel extends AbstractTableModel implements TableColumnModelListener {
     
    int rowCount = 1; 
    static int columnCount = 5;
     
    Object[][] data = {
            { "Mary", "Campione", "Snowboarding", new Integer(5),
                    new Boolean(false) } };
     
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return rowCount;
    }
 
    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnCount;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        System.out.println("columncount = " + columnCount);
        if (columnIndex > 4) {
            System.out.println("argh for GetValueAt " + rowIndex + " " + columnIndex);
            return "argh";
        }
        System.out.println(data[rowIndex][columnIndex] + " for GetValueAt " + rowIndex + " " + columnIndex);
        return data[rowIndex][columnIndex];
    }
 
    @Override
    public void columnAdded(TableColumnModelEvent e) {
        System.out.println("DATAMODEL found a columnAddedEvent!");
        columnCount++;
        System.out.println("columnCount now " + columnCount);
        this.fireTableChanged(new TableModelEvent(this));   
    }
 
    @Override
    public void columnRemoved(TableColumnModelEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void columnMoved(TableColumnModelEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void columnMarginChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void columnSelectionChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
         
    }
 
}