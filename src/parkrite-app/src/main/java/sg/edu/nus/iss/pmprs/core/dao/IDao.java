package sg.edu.nus.iss.pmprs.core.dao;

import java.util.List;
import java.util.Map;

public interface IDao {

	public abstract boolean create(Object o);
	public abstract CommonEntity get(String id);
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#update(java.lang.Object)
	 */
	public abstract boolean update(Object o);

	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#delete(java.lang.Object)
	 */
	public abstract boolean delete(Object o);

	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#getList(java.lang.Class)
	 */
	public abstract List getList(Class clazz);

	public abstract CommonEntity getSingleQuery(String query,
			Map<String, Object> params);

	public abstract List queryResults(String query, Map<String, Object> params);

	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#closeConnection()
	 */
	public abstract void closeConnection();

	public abstract List queryResults(String query, Map<String, Object> params,
			int max);

	public abstract List queryResults(String query);

	public abstract int executeNonQuery(String query);

}