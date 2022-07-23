package stepdefinitions.dbstepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_28_DBStepDefs {

    @Given("us28 user connects to the database")
    public void us28_user_connects_to_the_database() {
        DBUtils.getConnection();

    }
    @Given("us28 user gets {string} from {string} table")
    public void us28_user_gets_from_table(String column, String table) {
        String query = "Select " +column+ " from " +table;
        DBUtils.executeQuery(query);

    }
    @Given("us28 user reads all of the {string} column data")
    public void us28_user_reads_all_of_the_column_data(String column) throws SQLException {
    /*DBUtils.getResultset().next();
    Object columnData = DBUtils.getResultset().getObject(column); // tablodaki 1. kullanıcı uzun yol*/

       /* while (DBUtils.getResultset().next()){
            Object eachColumnData =DBUtils.getResultset().getObject(column);
            System.out.println(eachColumnData);
        }*/
    }

    @Given("us28 verify {string} table {string} column contains {string}")
    public void us28_verify_table_column_contains(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from country", "name");
        System.out.println(allColumnData);

        List<Object> expectedData = new ArrayList<>();
        expectedData.add(data);
        Assert.assertTrue(allColumnData.containsAll(expectedData));

    }

    @Given("us28 close the database connection")
    public void us28_close_the_database_connection() {

        DBUtils.closeConnection();
    }
}