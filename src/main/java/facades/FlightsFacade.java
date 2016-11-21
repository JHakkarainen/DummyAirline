/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Flights;
import java.sql.Date;

/**
 *
 * @author jarmo
 */
public class FlightsFacade implements IFlights {

    @Override
    public Flights getWithAll(String origin, String dest, Date date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Flights getWithTwo(String origin, String dest) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Flights getWithDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Flights getWithOrigin(String origin, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
