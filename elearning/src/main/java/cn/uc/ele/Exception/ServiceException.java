package cn.uc.ele.Exception;

/**
 * 收集业务层错误类
 * @author ucai
 *
 */
@SuppressWarnings("all")
public class ServiceException extends Exception {
	/**
	 * 错误信息
	 */
	String mess;

	public ServiceException(String mess) {
		super();
		this.mess = mess;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return mess;
	}
	
}
