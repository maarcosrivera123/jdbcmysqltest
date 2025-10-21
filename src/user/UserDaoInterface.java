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
	public int insertAll(User[] users);
	/**
	 * Transferir dinero de un usuario a otro
	 * @param fromUserId  id del enviador
	 * @param toUserId	 id del receptor
	 * @param amount	 la cantidad mandada
	 * @return			 true si se ejecuta correctamente
	 */
	public boolean transfer(long fromUserId, long toUserId, float amount);
	/**
	 * Transferir dinero de un usuario a otro
	 * @param fromUserId  id del enviador
	 * @param toUserId	 id del receptor
	 * @param amount	 la cantidad mandada
	 * @return			 true si se ejecuta correctamente
	 */
	public boolean transferWithBatch(long fromUserId, long toUserId, float amount);
	
}



