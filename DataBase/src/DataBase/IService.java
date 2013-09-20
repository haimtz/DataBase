package DataBase;

public interface IService {
	
	/**
	 * Create register in the DataBase
	 * @param obj
	 * @return last Id (if Need)
	 */
	<T> int Create(T t);
	
	/**
	 * Receive all rows form table
	 * @return
	 */
	<T> Iterable<T> SelectAll();
	
	/**
	 * update the register row 
	 * @param id identify value
	 * @param t new value 
	 */
	<T> void Update(int id, T t);
	
	/**
	 * Delete register from dataBase
	 * @param id id identify value
	 * @param t new value
	 */
	<T> void Delete(int id, T t);
	
	/**
	 * Single register value 
	 * @param id
	 * @return
	 */
	<T> T Get(int id);
}
