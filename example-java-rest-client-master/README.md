JAVA example client for SMS Global REST API
========================

Requirements
----------------
 - Java 1.5 or above
 - Jar files in the dependency folder


Preparation & Compile
--------------------------------
 - Download & Install Maven at http://maven.apache.org/download.cgi
 - Using your commandline console, type the following commands 

~~~
/> mvn dependency:copy-dependencies
/> mvn package
~~~

The jar file will be available under 'dependency' folder and can be included into your project. However please do it at your own risks as this mini project only serves as a sole example.

Run the example Main class
--------------------------------
This class show a few call
~~~
/> java -cp "target/*:target/dependency/*" SMSGlobalRESTClientMain <APIKey> <Secret> <SSL> <Debug>
~~~
Usage:
 * \<APIKey\> : String (required) [1]
 * \<Secret\> : String (required) [1]
 * \<SSL\> : true or false (optional) [2]
 * \<Debug\> : true or false (optional)

Notes:
 * [1] Find your \<APIKey\> and \<Secret\> from within MXT at http://mxt.smsglobal.com/api-key .
 * [2] We're bypassing SSL certificate verification for ease of development. Please disable the static method SMSGlobalUtil.disableCertificateValidation in Production environment.

The result would look like this 
~~~
    java -cp "target/*:target/dependency/*" SMSGlobalRESTClientMain 80d249a9eecc9232fb6ed0f843e7f230 6239e342d7abb35c853ad33e65931f64 false true
    == Balance ==
    1 * Client out-bound request
    1 > GET HTTP://api.smsglobal.com:80/v1/balance
    1 > Content-Type: application/json
    1 > Accept: application/json
    1 > Authorization: MAC id="80d249a9eecc9232fb6ed0f843e7f230",ts="1371782780",nonce="a33068e74b8ee7f9d9daf72f0e358a01",mac="4nf49wcSoMpdvAr9/2giQJN7O0vvgROaHaJPte7ksmw="
    1 * Client in-bound response
    1 < 200
    1 < Date: Fri, 21 Jun 2013 02:46:20 GMT
    1 < Content-Length: 107
    1 < X-UA-Compatible: IE=Edge,chrome=1
    1 < Set-Cookie: NSC_MC_203.89.193.162=ffffffffc3a00f3045525d5f4f58455e445a4a423660;expires=Fri, 21-Jun-2013 12:46:20 GMT;path=/;httponly
    1 < Content-Type: application/json
    1 < Connection: keep-alive
    1 < Server: nginx
    1 < Cache-Control: private
    1 < 
    {"balance":5.744,"countryCode":"AU","costPerSms":0.1,"costPerMms":0.38,"smsAvailable":56,"mmsAvailable":15}
    Credits: null
    Country Code: AU
    Credits Per MMS: null
    Credits Per SMS: null
    MMS Available: 15
    SMS Available: 56
~~~
