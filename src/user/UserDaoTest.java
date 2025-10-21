/**
 * 
 */
package user;

import java.util.ArrayList;

import model.User;

public class UserDaoTest {

    public static void main(String[] args) {
        Userdao userDao = new Userdao();

        // Insertar un usuario
        // userDao.insert(0, null, null, false, 34);

        // Eliminar un usuario con su id
        // userDao.delete(1);

        ArrayList<User> users = userDao.Findall();
        System.out.println("rows =");
    }
}
