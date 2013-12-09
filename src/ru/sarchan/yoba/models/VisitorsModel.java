/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sarchan.yoba.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import ru.sarchan.yoba.dataConnectors.DataConnectable;
import ru.sarchan.yoba.dataConnectors.TestingDataConnector;

/**
 *
 * @author void
 */
public class VisitorsModel {
    private DataConnectable connector;
    private ArrayList visitors;
    
    public VisitorsModel() {
        connector =  new TestingDataConnector(this);
    }
}
