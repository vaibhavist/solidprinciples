package solid.SingleResponsibility.good;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {

    public void save(Employee employee) throws SQLException{

        ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
        connectionDAO.setDbms("mysql");
        connectionDAO.setServerName("localhost");
        connectionDAO.setPortNumber("8080");
        connectionDAO.setDbName("mock");

        try (Connection connection = connectionDAO.createConnection();
             Statement stmt = connection.createStatement();) {

            String sql = "insert into employee (id, name, salary) values (" + employee.getId() + "," +
                    employee.getName() + "," + employee.getSalary() + ")";
            int rs = stmt.executeUpdate(sql);

            if (rs == 1){
                System.out.println("Successfully inserted Employee - id:" + employee.getId());
            }
        } catch (SQLException e) {
            System.err.println(("No employee inserted." + e));
        }
    }

}
