/**
 * The Class SMSGlobalRestClientException.
 */
public class SMSGlobalRestClientException extends Exception {

	/**
	 * Instantiates a new rest client exception.
	 */
	public SMSGlobalRestClientException() {
	}

	/**
	 * Instantiates a new rest client exception.
	 *
	 * @param msg the msg
	 */
	public SMSGlobalRestClientException(String msg) {
		super(msg);
	}

	/**
	 * Instantiates a new rest client exception.
	 *
	 * @param cause the cause
	 */
	public SMSGlobalRestClientException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new rest client exception.
	 *
	 * @param msg the msg
	 * @param cause the cause
	 */
	public SMSGlobalRestClientException(String msg, Throwable cause) {
		super(msg, cause);
	}
}