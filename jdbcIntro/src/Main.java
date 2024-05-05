import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        selectDemo();
        insertData();
        updateData();
        deleteData();
    }

    public static void deleteData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            //System.out.println("Connection is successful.");

            String sql = "delete from city where id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 100);

            int i = preparedStatement.executeUpdate();

            System.out.println("The data deleted successfully.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            //System.out.println("Connection is successful.");

            String sql = "update city set population = 987836, district = 'Spain' where id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 656);

            int i = preparedStatement.executeUpdate();

            System.out.println("The data updated successfully.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            //System.out.println("Connection is successful.");

            String sql = "insert into city (Name, CountryCode, District, Population) values(?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "İzmit");
            preparedStatement.setString(2, "TUR");
            preparedStatement.setString(3, "Turkey");
            preparedStatement.setInt(4, 2000000);

            int i = preparedStatement.executeUpdate();

            System.out.println("The data added successfully.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;

        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            //System.out.println("Connection is successful.");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select Code, Name, Continent, Region from Country");

            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}