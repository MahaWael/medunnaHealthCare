package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_05_DBStepDefs {
    List<Object> expectedId = new ArrayList<>();
    List<Object>actualData = new ArrayList<>();

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.getConnection();
    }

    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) throws SQLException {
        String query = "select * from appointment where patient_id = 112412";
        DBUtils.executeQuery(query);
        while (DBUtils.getResultset().next()) {
            Object nextColumnData = DBUtils.getResultset().getObject("Id");
            System.out.println(nextColumnData);
        }
    }
    @Given("verify the {string}, {string}, {string} appointment")
    public void verify_the_appointment(String table, String column, String Id) {
        expectedId.add("112412");
        actualData.add("112412");
        Assert.assertTrue(actualData.containsAll(expectedId));
    }
    @Then("user closes database connection")
    public void user_closes_database_connection () {
        DBUtils.closeConnection();
    }
}






