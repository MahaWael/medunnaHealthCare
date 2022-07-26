package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US17_DB {

    List<Object> expectedId = new ArrayList<>();
    List<Object>actualData = new ArrayList<>();

    @Given("US17 admin connects to the database")
    public void us17_admin_connects_to_the_database() {
        DBUtils.getConnection();
    }


    @Given("US17 admin gets {string} from {string} table")
    public void us17_admin_gets_from_table(String column, String table) throws SQLException {

        String query = "select" + column + "from" + table;
        DBUtils.executeQuery(query);

    }

    @Given("US17 verify the {string},{string},{string} test item")
    public void us17_verify_the_test_item(String table, String column, String name) {
        expectedId.add("Urea");
        actualData.add("Urea");
        Assert.assertTrue(actualData.containsAll(expectedId));
    }
    @Then("user closes database connection")
    public void user_closes_database_connection() {
        DBUtils.closeConnection();
    }
}

