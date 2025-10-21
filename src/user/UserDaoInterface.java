/**
 * 
 */
package user;

import model.User;

/** insertar un conjunto de usuarios en la base de datos 
 * @author marcos 16 oct 2025
 */
public interface UserDaoInterface {
	public int insetAll(User[] users);
}
