package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_27_DBStepDefs {


    @Given("US27 The user connects to DB")
    public void us27_the_user_connects_to_db() {
        DBUtils.createConnection();
    }
    @Given("US27 The user gets {string} columns from {string} table")
    public void us27_the_user_gets_columns_from_table(String column, String table) {
        String query="Select "+column+" from "+table;
        DBUtils.executeQuery(query);

    }
    @Then("US27 The user verifies that {string} table {string} column contains {string}")
    public void us27_the_user_verifies_that_table_column_contains(String table, String column, String data) {
        List<Object> allColumnData=DBUtils.getColumnData("Select*from "+table+"",column);
        Assert.assertTrue(allColumnData.contains(data));
    }
    @Then("US27 The user closes the DB")
    public void us27_the_user_closes_the_db() {
        DBUtils.createConnection();
    }


}