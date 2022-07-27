package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US09_PatientDBStepDefs {
    @Given("US09 user connects to the database")
    public void US09_user_connects_to_the_database() {
        DBUtils.getConnection();
    }

    @Given("US09 user gets the {string} from {string} table")
    public void US09_user_gets_the_from_table(String column, String table) {
        String query = "select * from patient";
        DBUtils.executeQuery(query);
    }
    @Given("US09 user reads all of the {string} column data")
    public void US09_user_reads_all_of_the_column_data(String column) throws SQLException {

        int counter = 0;
        while (DBUtils.getResultset().next()) {
            Object columnData1 = DBUtils.getResultset().getObject("id");
            counter++;
        }
        System.out.println("Total Patient = " + counter);
//        Assert.assertEquals(3059,counter);
    }
    @Then("US09 verify {string} table {string} column contains {string} data")
    public void US09_verify_table_column_contains_data(String table, String column, String data) throws SQLException {

        DBUtils.getResultset().next();
        List<Object> allColumnData09 = DBUtils.getColumnData("select * from patient", "first_name");
        System.out.println(allColumnData09);

        List<Object> expectedData09 = new ArrayList<>();
        expectedData09.add(data);
        Assert.assertTrue(allColumnData09.contains("Cara"));
    }
    @Then("US09 close the database connection")
    public void US09_close_the_database_connection() {
        DBUtils.closeConnection();

    }
}



