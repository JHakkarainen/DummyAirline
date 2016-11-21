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
public interface IFlights {
    public Flights getWithAll(String origin, String dest, Date date);
    public Flights getWithTwo(String origin, String dest);
    public Flights getWithDate(Date date);
    public Flights getWithOrigin(String origin, Date date);
}
