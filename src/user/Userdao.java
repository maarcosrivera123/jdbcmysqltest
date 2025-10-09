/**
 *
 */
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.User;

/**
 * data access object for user table
 *
 * @author marcos 25 sept 2025
 */
public class Userdao {
    public void insert(int id, String name, boolean isVip) {
        String insertSQL = "INSERT INTO users VALUES (?, '?', '?', ?, ?)";
        Connection connection = DBHelper.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setBoolean(3, isVip);

            // cierra la conexion con la base de datos
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

    /**
     * Método para eliminar un usuario por su id.
     *
     * @param id el id de un usuario
     */
    public void delete(int id) {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        Connection conn = DBHelper.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(deleteSQL);
            ps.setInt(1, id); // Sustituir el primer placeholder con el valor del id

            int result = ps.executeUpdate();
            System.out.println("We have deleted " + result + " rows.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public User[] Findall() {
        String selectSQLS = "select * from users where username = 'Marcos'";
        User[] Users;
        ArrayList<User> userList = new ArrayList<User>();
        Connection conn = DBHelper.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSQLS);

            ResultSet resultSet = ps.executeQuery();
            System.out.println("total rows is" + resultSet.last());
            System.out.println("rows =" + resultSet.getFetchSize());
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                boolean isVIP = resultSet.getBoolean("isVIP");
                String psw = resultSet.getString("psw");
                Float balance = resultSet.getFloat("balance");

                System.out.println("record > id = " + id + " username = " + name + " isVIP = " + isVIP);
                userList.add(new User(name, id, psw, isVIP, balance));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

}
