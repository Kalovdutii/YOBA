/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sarchan.yoba.entity;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author void
 */
public class Visitor {
    public Visitor(Time in, Time out, int id) {
        timeIN = in;
        timeOUT = out;
        cardID = id;
    }
    private Time timeIN;
    private Time timeOUT;
    private int cardID;
    
    public Time getTimeIN() {
        return timeIN;
    }
    public Time getTimeOUT() {
        return timeOUT;
    }
    public int getCardID() {
        return cardID;
    }
}
