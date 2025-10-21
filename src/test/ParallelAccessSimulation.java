/**
 * 
 */
package test;

import java.util.ArrayList;

import user.Userdao;

/**
 * @author marcos 21 oct 2025
 */
public class ParallelAccessSimulation {
	public static void main(String[] args) {
		Userdao userDao = new Userdao();
		long fromUserId = 2;
		long toUserId = 1;
		ArrayList<Thread> threads = new ArrayList<Thread>(100);
		System.out.println(threads.size());
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(() -> {
				userDao.transfer(fromUserId, toUserId, 1);
			});
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.start();
			
		}
	}
}
