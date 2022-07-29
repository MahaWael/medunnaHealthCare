package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_07_DBStepDef {
    List<Long> actualAppData = new ArrayList<>();
    List<Long> expectedAppData = new ArrayList();

    @Given("US07 user connects to the database")
    public void US07_user_connects_to_the_database() {
        DBUtils.getConnection();
    }

    @Then("US07 gets appointment data from database and verify appointments")
    public void US07_gets_appointment_data_from_database_and_verify_appointments() throws SQLException {
        String query = "select * from appointment where patient_id = 101349";
        DBUtils.executeQuery(query);
        while (DBUtils.getResultset().next()) {
            Object columnAppID = DBUtils.getResultset().getObject("id");
            actualAppData.add((Long) columnAppID);
            System.out.println(columnAppID.toString());
        }

        expectedAppData.add(Long.valueOf(126607));
        expectedAppData.add(Long.valueOf(126608));
        expectedAppData.add(Long.valueOf(126609));
        System.out.println(actualAppData);
        System.out.println(expectedAppData);

        //Assert.assertTrue(actualAppData.containsAll(expectedAppData));


    }


    @Then("US07 close the database connection")
    public void US07_close_the_database_connection() throws SQLException {
        DBUtils.closeConnection();
    }



}
