import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.security.SecureRandom;
import java.net.HttpURLConnection;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.RandomStringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.HttpsURLConnection;

public class SMSGlobalUtil {

	/** Constants */
	public static final String HASH_ALGORITHM = "HmacSHA256";

	private Mac mac;

	public SMSGlobalUtil(String secret) {
		try {
			mac = Mac.getInstance(HASH_ALGORITHM);
				mac.init(new SecretKeySpec(secret.getBytes(), mac.getAlgorithm()));
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method constructs the complete URL.
	 *
	 * @param protocol the protocol
	 * @param host the host
	 * @param port the port
	 * @param version the version
	 * @param uri the uri
	 * @return the string
	 */
	public String constructURL(String protocol, String host, int port, String version, String uri) {
		StringBuilder url = new StringBuilder();

		url.append(protocol);
		url.append("://");
		url.append(host);
		url.append(":");
		url.append(port);
		url.append(version);
		url.append(uri);

		return url.toString();
	}

	/**
	 * returns authorization header.
	 *
	 * @param apiKey the api key
	 * @param method the method
	 * @param requestUri the request uri
	 * @param host the host
	 * @param port the port
	 * @param extraData the extra data
	 * @return the authorization header
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getAuthorizationHeader(String apiKey,
			String method, String requestUri, String host, int port,
			String extraData) throws SMSGlobalRestClientException {

		StringBuilder header = new StringBuilder();
		String nonce = "";
		String randomString = "";
		String hash = "";
		String data = "";


		//create a random string to be part of the HMAC
		randomString = RandomStringUtils.random(15);

		//get timestamp in seconds
		long timestamp = System.currentTimeMillis() / 1000;

		try {
			nonce = getMD5Value(randomString);
			data = getData(timestamp, nonce,method, requestUri, host, port, extraData);

			hash = getHash(data);
			header.append("MAC ");
			header.append("id=\"" + apiKey);
			header.append("\",ts=\"" + timestamp);
			header.append("\",nonce=\"" + nonce);
			header.append("\",mac=\"" + hash);
			header.append("\"");

		} catch (InvalidKeyException e) {
			e.printStackTrace();
			throw new SMSGlobalRestClientException(e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new SMSGlobalRestClientException(e);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new SMSGlobalRestClientException(e);
		}

		return header.toString();
	}

	/**
	 * Method concatenate the string in the required format.
	 *
	 * @param timestamp the timestamp
	 * @param nonce the nonce
	 * @param method the method
	 * @param requestUri the request uri
	 * @param host the host
	 * @param port the port
	 * @param extraData the extra data
	 * @return the data
	 */
	private String getData(long timestamp, String nonce, String method,
			String requestUri, String host, int port, String extraData) {

		StringBuilder sb = new StringBuilder();
		sb.append(timestamp);
		sb.append("\n");

		sb.append(nonce);
		sb.append("\n");

		sb.append(method);
		sb.append("\n");

		sb.append(requestUri);
		sb.append("\n");

		sb.append(host);
		sb.append("\n");

		sb.append(port);
		sb.append("\n");

		sb.append(extraData);
		sb.append("\n");

		return sb.toString();

	}

	/**
	 * Returns MD5 value.
	 *
	 * @param data the data
	 * @return the m d5 value
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	private String getMD5Value(String data) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(data.getBytes());
		byte byteData[] = md.digest();

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16)
					.substring(1));
		}

		return sb.toString();
	}

	/**
	 * returns Base64 encoded value of computed HMAC of data.
	 *
	 * @param data the data
	 * @return the hash
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws InvalidKeyException the invalid key exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	private String getHash(String data)
			throws NoSuchAlgorithmException, InvalidKeyException,
			UnsupportedEncodingException {

		return Base64.encodeBase64String(mac.doFinal(data.getBytes()));
	}
    
    /**
     * While not recommended, you can also disable SSL cert validation alltogether:
     */
    public static void disableCertificateValidation() {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] { 
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() { 
                    return new X509Certificate[0]; 
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {}
                public void checkServerTrusted(X509Certificate[] certs, String authType) {}
            }};
        
        // Ignore differences between given hostname and certificate hostname
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) { return true; }
        };
        
        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
        } catch (Exception e) {}
    }    

}
