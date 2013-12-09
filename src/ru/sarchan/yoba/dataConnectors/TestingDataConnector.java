/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sarchan.yoba.dataConnectors;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import ru.sarchan.yoba.entity.Visitor;

/**
 *
 * @author void
 */
public class TestingDataConnector implements DataConnectable{

    @Override
    public ArrayList<Visitor> getData() {
        ArrayList a = new ArrayList();
        a.add(new Visitor(new Time(52200),new Time(54000), 0));
        return a;
    }
}
