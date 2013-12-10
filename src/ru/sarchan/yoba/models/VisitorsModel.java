/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sarchan.yoba.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import ru.sarchan.yoba.dataConnectors.DataConnectable;
import ru.sarchan.yoba.dataConnectors.TestingDataConnector;
import ru.sarchan.yoba.entity.Visitor;

/**
 *
 * @author void
 */
public class VisitorsModel extends AbstractModel{
    private ArrayList<Visitor> visitors;
    
    public VisitorsModel() {
        connector =  new TestingDataConnector(this);
        refresh();
    }
    
    public void refresh() {
        visitors = connector.getData();
    }
    
    public ArrayList<Visitor> getData() {
        return visitors;
    }
    
    public double calculate() {
        return 1.7;
    }
}
