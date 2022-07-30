package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class US_10_DBStepDefs {
    @Given("doctor connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.getConnection();
    }
    @Given("doctor gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
        String query = "select * from appointment where physician_id=94211";
//      String query = "select "+column+" from "+table;
        DBUtils.executeQuery(query);

    }
    @Given("doctor reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {
        int counter= 0;
        while (DBUtils.getResultset().next()) {
            Object columnData1 = DBUtils.getResultset().getObject("id");
            counter++;
//        Object columnData1 =  DBUtils.getResultset().getObject("id");
        }
        System.out.println("Total Patient ="+counter);

    }

    @Given("doctor verify appointment")
    public void doctor_verify_appointment() {
        String query = "select * from appointment where physician_id=94211";
        List<Object> appointmentID =DBUtils.getColumnData(query,"id");
        String controlD = appointmentID.toString();
        System.out.println(controlD);

        boolean flag=false;
        if (appointmentID.contains("108574")){
            flag=true;
        }
        Assert.assertEquals("108574","108574");



    }
    @Then("close the database connection")
    public void close_the_database_connection () {
        DBUtils.closeConnection();

    }


}