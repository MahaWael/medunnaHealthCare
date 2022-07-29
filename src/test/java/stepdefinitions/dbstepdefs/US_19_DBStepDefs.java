package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_19_DBStepDefs {

    @Given("US19 User connects to the database")
    public void us19_user_connects_to_the_database() {
        DBUtils.getConnection();
    }
    @Given("US19 User can get {string} from {string} table")
    public void us19_user_can_get_from_table(String table, String column) {
        String query = "select * from staff";
        DBUtils.executeQuery(query);
    }
    @Then("US19 User can read all of {string} column data")
    public void us19_user_can_read_all_of_column_data(String first_name) throws SQLException {
        DBUtils.getResultset().next();
        List<Object> allColumnData19 = DBUtils.getColumnData("select * from staff", "first_name");
        System.out.println(allColumnData19);
    }
    @Then("US19 verify that  {string} table {string} contains {string} data")
    public void us19_verify_that_table_contains_data(String table, String column, String data) {
        List<Object> allColumndataUs19 = new ArrayList<>();
        allColumndataUs19.add(data);
        Assert.assertTrue(allColumndataUs19.contains("team89"));
    }
    @Then("US19 close the database connection")
    public void us19_close_the_database_connection() {
        DBUtils.closeConnection();
    }
}
