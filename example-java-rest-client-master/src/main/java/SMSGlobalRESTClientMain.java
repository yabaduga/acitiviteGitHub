/* We're using json-lib for deserialising JSON data */
import net.sf.json.*;

public class SMSGlobalRESTClientMain
{
    public static void main(String[] args) throws Exception
    {
        if(args.length < 2) {
            System.out.println("Please enter at least API Key and Secret String obtained from your MXT Account."); 
            System.exit(0);
        }
        
        String apiKey = args[0];
        String secret = args[1];
        String extraData = "";
        String host = "api.smsglobal.com";
        String protocol = (args.length > 2 && args[2].equalsIgnoreCase("true")) ? "HTTPS" : "HTTP";        
        int port = (args.length > 2 && args[2].equalsIgnoreCase("true")) ? 443 : 80;        
        boolean isDebug = (args.length > 3 && args[3].equalsIgnoreCase("true")) ? true : false;
        
        SMSGlobalRESTClient restClient = new SMSGlobalRESTClient(apiKey, secret, extraData, protocol, host, port, isDebug);

        /** Get Balance **/
        try {
            /** Child Accounts **/
            System.out.println("== Child Accounts ==\n" + restClient.getChildAccounts() + "\n");

	        /** Contacts **/        
            System.out.println("== Contacts ==\n " + restClient.getContacts() + "\n");
        
            /** Dedicated Numbers **/                
            System.out.println("== Dedicated Numbers ==\n" + restClient.getDedicatedNumbers() + "\n");
        
            /** Groups **/        
            System.out.println("== Groups ==\n" + restClient.getGroups() + "\n");
        
            /** Lookup Number **/        
            System.out.println("== Look Up Number ==\n" + restClient.getLookups() + "\n");
        } catch (SMSGlobalRestClientException e) {
            System.out.println("Error communicating with API server. " + e.getMessage() + "\n");
        } catch (JSONException e) { 
            System.out.println("Error decoding server returned data. " + e.getMessage() + "\n");
        } catch (Exception e) {
            System.out.println("Unknown Error while trying to get the balance. " + e.getMessage() + "\n");
        } finally {
            System.exit(0);
        }
        return;
    }
}