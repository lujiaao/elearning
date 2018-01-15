package cn.uc.ele.Exception;

/**
 * 数据访问错误类
 * @author ucai
 *
 */
@SuppressWarnings("all")
public class DaoException extends Exception{
	/**
	 * 存储错误信息
	 */
	String mess;

	public DaoException(String mess) {
		super();
		this.mess = mess;
	}

	@Override
	public String getMessage() {
		return mess;
	}
	
	
}
