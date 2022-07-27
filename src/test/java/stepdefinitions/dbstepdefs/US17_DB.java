package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US17_DB {

    @Given("US17 admin connects to the database")
    public void us17_admin_connects_to_the_database() {
      DBUtils.getConnection();
    }
    @Given("US17 admin gets {string} from {string} table")
    public void us17_admin_gets_from_table(String column, String table) {
        String query = " select " + column + " from " + table;
        DBUtils.executeQuery(query);

    }
    @Then("US17 admin verify {string} table {string} column contains {string}")
    public void us17_admin_verify_table_column_contains(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData(" select * from " + table,column);
        System.out.println(allColumnData);

        Assert.assertTrue(allColumnData.contains(data));

    }
    @Then("US17 close the connection")
    public void us17_close_the_connection() {
        DBUtils.closeConnection();
    }




}

