import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;

/**
 * RestClient which uses Jersey to communicate with SMSGlobal REST API.
 */
public class SMSGlobalRESTClient {

	/** The api key. */
	private String apiKey;

	/** The secret. */
	private String secret;

	/** The extra data. */
	private String extraData;

	/** The protocol. */
	private String protocol;

	/** The host. */
	private String host;

	/** The port. */
	private int port;

	/** The api version. */
	private String apiVersion;

	/** The is debug. */
	private boolean isDebug;

	/** The smsglobal util. */
	private final SMSGlobalUtil smsglobalUtil;

	/** The Constant SMS_URI_PREFIX. */
	private static final String SMS_URI_PREFIX = "/sms";

	/** The Constant INCOMING_URI_PREFIX. */
	private static final String INCOMING_URI_PREFIX = "/sms-incoming";

	/** The Constant BALANCE_URI_PREFIX. */
	private static final String BALANCE_URI_PREFIX = "/balance";

	/** The Constant CONTACT_URI_PREFIX. */
	private static final String CONTACT_URI_PREFIX = "/contact";

	/** The Constant GROUP_URI_PREFIX. */
	private static final String GROUP_URI_PREFIX = "/group";

	/** The Constant GROUP_URI_PREFIX. */
	private static final String LOOKUP_URI_PREFIX = "/lookup";

	/** The Constant SCHEDULED_URI_PREFIX. */
	private static final String SCHEDULED_URI_PREFIX = "/sms-scheduled";

	/** The Constant DEDICATED_URI_PREFIX. */
	private static final String DEDICATED_URI_PREFIX = "/dedicated-number";

	/** The Constant CHILD_ACCOUNT_URI_PREFIX. */
	private static final String CHILD_ACCOUNT_URI_PREFIX = "/child-account";

	/** The Constant TEMPLATE_URI_PREFIX. */
	private static final String TEMPLATE_URI_PREFIX = "/sms-template";

	/** The Constant HTTP_POST_METHOD. */
	private static final String HTTP_POST_METHOD = "POST";

	/** The Constant HTTP_GET_METHOD. */
	private static final String HTTP_GET_METHOD = "GET";

	/** The Constant HTTP_DELETE_METHOD. */
	private static final String HTTP_DELETE_METHOD = "DELETE";

	private ClientConfig config = new DefaultClientConfig();
	private Client client = Client.create(config);

	/**
	 * Constructor to initialize with Api key details.
	 *
	 * @param apiKey the api key
	 * @param secret the secret
	 * @param extraData the extra data
	 * @param protocol the protocol
	 * @param host the host
	 * @param port the port
	 * @param apiVersion the api version
	 * @param isDebug the is debug
	 */
	public SMSGlobalRESTClient(String apiKey, String secret, String extraData, String protocol, String host, int port, String apiVersion, boolean isDebug) {
		this.apiKey = apiKey;
		this.secret = secret;
		this.extraData = extraData;
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.apiVersion = apiVersion;
		this.isDebug = isDebug;

		this.smsglobalUtil = new SMSGlobalUtil(secret);
	}

	/**
	 * Constructor to initialize with Api key details, with version defaulted to v1.
	 *
	 * @param apiKey the api key
	 * @param secret the secret
	 * @param extraData the extra data
	 * @param protocol the protocol
	 * @param host the host
	 * @param port the port
	 * @param isDebug the is debug
	 */
	public SMSGlobalRESTClient(String apiKey, String secret, String extraData, String protocol, String host, int port, boolean isDebug) {
		this.apiKey = apiKey;
		this.secret = secret;
		this.extraData = extraData;
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.apiVersion = "/v1";
		this.isDebug = isDebug;

		this.smsglobalUtil = new SMSGlobalUtil(secret);
	}

	/**
	 * Sends SMS to SMSGlobal URL.
	 *
	 * @param input - SMS content in json string format
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String sendSMS(String input) throws SMSGlobalRestClientException{

		return this.postData(SMS_URI_PREFIX, input);
	}

	/**
	 * Gets all SMS.
	 *
	 * @return the sms
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getSMS() throws SMSGlobalRestClientException {

		return this.getData(SMS_URI_PREFIX);
	}

	/**
	 * Gets a SMS matching the message id.
	 *
	 * @param messageId the message id
	 * @return the sms
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getSMS(String messageId) throws SMSGlobalRestClientException {

		return this.getData(SMS_URI_PREFIX, messageId);
	}

	/**
	 * Deletes a SMS matching the message id.
	 *
	 * @param messageId the message id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public void deleteSMS(String messageId) throws SMSGlobalRestClientException {

		deleteData(SMS_URI_PREFIX, messageId);
	}

	/**
	 * Gets all incoming SMS.
	 *
	 * @return the incoming sms
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getIncomingSMS() throws SMSGlobalRestClientException {

		return this.getData(INCOMING_URI_PREFIX);

	}

	/**
	 * Gets a incoming SMS.
	 *
	 * @param id the id
	 * @return the incoming sms
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getIncomingSMS(String id) throws SMSGlobalRestClientException {

		return this.getData(INCOMING_URI_PREFIX, id);
	}

	/**
	 * Deletes an incoming SMS matching the id.
	 *
	 * @param id the id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public void deleteIncomingSMS(String id) throws SMSGlobalRestClientException {

		deleteData(INCOMING_URI_PREFIX, id);
	}

	/**
	 * Returns all contacts.
	 *
	 * @return the contacts
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getContacts() throws  SMSGlobalRestClientException {
		return this.getData(CONTACT_URI_PREFIX);
	}

	/**
	 * Return a contact.
	 *
	 * @param id the id
	 * @return the contact
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getContact(String id) throws  SMSGlobalRestClientException {
		return this.getData(CONTACT_URI_PREFIX, id);
	}

	/**
	 * Adds a contact.
	 *
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String addContact(String input) throws  SMSGlobalRestClientException {
		return this.postData(CONTACT_URI_PREFIX, input);
	}

	/**
	 * Returns all groups.
	 *
	 * @return the groups
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getGroups() throws  SMSGlobalRestClientException {
		return this.getData(GROUP_URI_PREFIX);
	}

	/**
	 * Return a group.
	 *
	 * @param id the id
	 * @return the group
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getGroup(String id) throws  SMSGlobalRestClientException {
		return this.getData(GROUP_URI_PREFIX, id);
	}

	/**
	 * Adds a group.
	 *
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String addGroup(String input) throws  SMSGlobalRestClientException {
		return this.postData(GROUP_URI_PREFIX, input);
	}

	/**
	 * Returns all scheduled messages.
	 *
	 * @return the scheduled messages
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getScheduledMessages() throws  SMSGlobalRestClientException {
		return this.getData(SCHEDULED_URI_PREFIX);
	}

	/**
	 * Return a scheduled message.
	 *
	 * @param id the id
	 * @return the scheduled message
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getScheduledMessage(String id) throws  SMSGlobalRestClientException {
		return this.getData(SCHEDULED_URI_PREFIX, id);
	}

	/**
	 * Adds a scheduled message.
	 *
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String addScheduledMessage(String input) throws  SMSGlobalRestClientException {
		return this.postData(SCHEDULED_URI_PREFIX, input);
	}

	/**
	 * Deletes a scheduled message.
	 *
	 * @param id the id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public void deleteScheduledMessage(String id) throws  SMSGlobalRestClientException {
		this.deleteData(SCHEDULED_URI_PREFIX, id);
	}

	/**
	 * Returns all dedicated numbers.
	 *
	 * @return the dedicated numbers
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getDedicatedNumbers() throws  SMSGlobalRestClientException {
		return this.getData(DEDICATED_URI_PREFIX);
	}

	/**
	 * Returns a dedicated number.
	 *
	 * @param id the id
	 * @return the dedicated number
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getDedicatedNumber(String id) throws  SMSGlobalRestClientException {
		return this.getData(DEDICATED_URI_PREFIX, id);
	}

    /**
     * Returns a list of previous lookup entries.
     *
     * @return the previous lookup entries
     * @throws SMSGlobalRestClientException the rest client exception
     */
    public String getLookups() throws SMSGlobalRestClientException {

		return this.getData(LOOKUP_URI_PREFIX);

	}

	/**
	 * Gets a previous lookup entry.
	 *
	 * @param id the id
	 * @return a previous lookup entry
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getLookup(String id) throws SMSGlobalRestClientException {

		return getData(LOOKUP_URI_PREFIX, id);
	}

	/**
	 * Deletes a previous lookup entry.
	 *
	 * @param id the id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public void deleteLookup(String id) throws SMSGlobalRestClientException {

		deleteData(LOOKUP_URI_PREFIX, id);
	}


	/**
	 * Returns all child accounts.
	 *
	 * @return the child accounts
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getChildAccounts() throws  SMSGlobalRestClientException {
		return this.getData(CHILD_ACCOUNT_URI_PREFIX);
	}

	/**
	 * Returns a child account.
	 *
	 * @param id the id
	 * @return the child account
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getChildAccount(String id) throws  SMSGlobalRestClientException {
		return this.getData(CHILD_ACCOUNT_URI_PREFIX, id);
	}

	/**
	 * Creates a child account.
	 *
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String createChildAccount(String input) throws  SMSGlobalRestClientException {
		return this.postData(CHILD_ACCOUNT_URI_PREFIX, input);
	}

	/**
	 * Returns all templates.
	 *
	 * @return the templates
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getTemplates() throws  SMSGlobalRestClientException {
		return this.getData(TEMPLATE_URI_PREFIX);
	}

	/**
	 * Returns a template.
	 *
	 * @param id the id
	 * @return the template
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getTemplate(String id) throws  SMSGlobalRestClientException {
		return this.getData(TEMPLATE_URI_PREFIX, id);
	}

	/**
	 * Creates a template.
	 *
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String createTemplate(String input) throws  SMSGlobalRestClientException {
		return this.postData(TEMPLATE_URI_PREFIX, input);
	}

	/**
	 * Returns balance.
	 *
	 * @return the balance
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getBalance() throws SMSGlobalRestClientException {
		return this.getData(BALANCE_URI_PREFIX);
	}

	/**
	 * Gets the balance for a given Country Code.
	 *
	 * @param countryCode the country code
	 * @return the balance
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	public String getBalance(String countryCode) throws SMSGlobalRestClientException 
    {
		return this.getData(BALANCE_URI_PREFIX+"?countryCode="+countryCode);
	}

	/**
	 * Post given data for a given URI.
	 *
	 * @param uri the uri
	 * @param input the input
	 * @return the string
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private String postData(String uri, String input) throws  SMSGlobalRestClientException 
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = smsglobalUtil.constructURL(this.protocol, this.host, this.port, this.apiVersion, uri);

		requestUri = this.apiVersion + uri;

		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_POST_METHOD, requestUri, this.host, this.port, this.extraData);
		response = this.post(urlString, header, input);

		if (response.getStatus() != Response.Status.CREATED.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}

		return response.getEntity(String.class);
	}


	/**
	 * Returns data from SMSGlobal REST API for the given URI.
	 *
	 * @param uri the uri
	 * @return the data
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private String getData(String uri) throws  SMSGlobalRestClientException 
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = smsglobalUtil.constructURL(this.protocol, this.host, this.port, this.apiVersion, uri);

		requestUri = this.apiVersion + uri + "/";


		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_GET_METHOD, requestUri, this.host, this.port, this.extraData);
		response = this.get(urlString, header);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}


		return response.getEntity(String.class);

	}

	/**
	 * Returns data from SMSGlobal REST API for the given URI and id.
	 *
	 * @param uri the uri
	 * @param id the id
	 * @return the data
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private String getData(String uri, String id) throws  SMSGlobalRestClientException
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = smsglobalUtil.constructURL(this.protocol, this.host, this.port, this.apiVersion, uri) + "/" + id + "/";
		requestUri = this.apiVersion + uri + "/" + id + "/";

		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_GET_METHOD, requestUri, this.host, this.port, this.extraData);

		response = this.get(urlString, header);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}

		return response.getEntity(String.class);
	}

	/**
	 * Returns data from SMSGlobal REST API for the given URI and id.
	 *
	 * @param uri the uri
	 * @param id the id
	 * @return the data
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private String getData(String uri, int id) throws  SMSGlobalRestClientException 
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = smsglobalUtil.constructURL(this.protocol, this.host, this.port, this.apiVersion, uri) + "/" + id + "/";
		requestUri = this.apiVersion + uri + "/" + id + "/";

		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_GET_METHOD, requestUri, this.host, this.port, this.extraData);

		response = this.get(urlString, header);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}

		return response.getEntity(String.class);
	}


	/**
	 * Deletes a given id for a given URI.
	 *
	 * @param uri the uri
	 * @param id the id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private void deleteData(String uri, String id) throws  SMSGlobalRestClientException  
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = smsglobalUtil.constructURL(this.protocol, this.host, this.port, apiVersion, uri) + "/" + id + "/";
		requestUri = this.apiVersion + uri + "/" + id + "/";

		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_DELETE_METHOD, requestUri, this.host, this.port, this.extraData);

		response = this.delete(urlString, header);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}
	}

	/**
	 * Deletes a given id for a given URI.
	 *
	 * @param uri the uri
	 * @param id the id
	 * @throws SMSGlobalRestClientException the rest client exception
	 */
	private void deleteData(String uri, int id) throws SMSGlobalRestClientException  
    {
		String urlString = "";
		String header = "";
		String requestUri = "";

		ClientResponse response = null;

		urlString = this.smsglobalUtil.constructURL(this.protocol, this.host, this.port, this.apiVersion, uri) + "/" +id;
		requestUri = this.apiVersion + uri + "/" + id + "/";

		header = smsglobalUtil.getAuthorizationHeader(this.apiKey, HTTP_DELETE_METHOD, requestUri, this.host, this.port, this.extraData);

		response = this.delete(urlString, header);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new SMSGlobalRestClientException("Failed : HTTP error code : "+ response.getStatus());
		}
	}

	/**
	 * Gets data from URL.
	 *
	 * @param urlString the url string
	 * @param header the header
	 * @return the client response
	 */
	private ClientResponse get(String urlString, String header) 
    {
        if (this.protocol.equalsIgnoreCase("HTTPS")) {
            // WARNING THIS SHOULD NOT BE USED IN PRODUCTION
            SMSGlobalUtil.disableCertificateValidation();    
        }

		ClientResponse response = null;
		if(this.isDebug) {
			client.addFilter(new LoggingFilter(System.out));
        }

		WebResource webResource = client.resource(UriBuilder.fromUri(urlString).build());
		response = webResource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, header).get(ClientResponse.class);

		return response;
	}

	/**
	 * Posts data to url.
	 *
	 * @param urlString the url string
	 * @param header the header
	 * @param input the input
	 * @return the client response
	 */
	private ClientResponse post(String urlString, String header, String input) 
    {      
        if (this.protocol.equalsIgnoreCase("HTTPS")) {
            // WARNING THIS SHOULD NOT BE USED IN PRODUCTION
            SMSGlobalUtil.disableCertificateValidation();    
        }

		ClientResponse response = null;
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);

		if(this.isDebug) {
			client.addFilter(new LoggingFilter(System.out));
        }

		WebResource webResource = client.resource(UriBuilder.fromUri(urlString).build());
		response = webResource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, header).post(ClientResponse.class, input);

		return response;
	}

	/**
	 * Sends delete request to the server.
	 *
	 * @param urlString the url string
	 * @param header the header
	 * @return the client response
	 */
	private ClientResponse delete(String urlString, String header) 
    {
        if (this.protocol.equalsIgnoreCase("HTTPS")) {
            // WARNING THIS SHOULD NOT BE USED IN PRODUCTION
            SMSGlobalUtil.disableCertificateValidation();    
        }

		ClientResponse response = null;
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);

		if(this.isDebug) {
			client.addFilter(new LoggingFilter(System.out));
        }
        
		WebResource webResource = client.resource(UriBuilder.fromUri(urlString).build());
		response = webResource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, header).delete(ClientResponse.class);

		return response;
	}
}
