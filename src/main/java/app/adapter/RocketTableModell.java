package app.adapter;

import com.oozinoz.firework.Rocket;

import javax.swing.table.AbstractTableModel;

/**
 * Created by zhenbin.lzb on 2016/4/8.
 */
public class RocketTableModell extends AbstractTableModel {

    protected Rocket[] rockets;
    protected String[] columnNames = new String[]{"name", "price", "Apogee"};

    public RocketTableModell(Rocket[] rockets) {
        this.rockets = rockets;
    }

    public int getRowCount() {
        return rockets.length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int i) {
        return columnNames[i];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rockets[rowIndex].getName();
            case 1:
                return rockets[rowIndex].getPrice();
            case 2:
                return (Double) rockets[rowIndex].getApogee();
            default:
                return null;
        }
    }
}
