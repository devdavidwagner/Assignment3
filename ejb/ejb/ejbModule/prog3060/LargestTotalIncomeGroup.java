package prog3060;

import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import db.DBHandler;
import model.CensusYear;
import model.GeographicArea;

/**
 * Session Bean implementation class LargestTotalIncomeGroup
 */
@Stateful
public class LargestTotalIncomeGroup {

    /**
     * Default constructor. 
     */
    public LargestTotalIncomeGroup() {
        // TODO Auto-generated constructor stub
    }
    
    public String getLargestTotalIncomeGroup(GeographicArea ga, CensusYear cy) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
    	String result = "";
    	
    	DBHandler db = new DBHandler();
    	db.createConnection();
    	
    	result = db.getHighestNumberHouseholdsTotalIncomeGroup(ga,cy);
    	
    	return result;
    	
    }
    
    


}
