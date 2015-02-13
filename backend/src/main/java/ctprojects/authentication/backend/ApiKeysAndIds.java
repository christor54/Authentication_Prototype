package ctprojects.authentication.backend;

/**
 * Reference
 * https://github.com/GoogleCloudPlatform/solutions-mobile-shopping-assistant-backend-java/blob/master/src/com/google/sample/mobileassistant/ApiKeysAndIds.java
 */
public class ApiKeysAndIds {

    static final String GCM_API_KEY = "!!! ENTER YOUR GCM API KEY HERE !!!";

    static final String ANDROID_CLIENT_ID = "256296234164-2th3h16mjcb9ic2jnriegi1bi2ksoov6.apps.googleusercontent.com";
    static final String WEB_CLIENT_ID ="256296234164-6llpf5b1kvm761b0594kpt0i51d6q2g4.apps.googleusercontent.com";
    static final String AUDIENCE_ID = WEB_CLIENT_ID;

    static final String API_OWNER = "ctprojects";//Original -> google.com
    static final String API_PACKAGE_PATH = "authentication_prototype.ctprojects";//Original -> sample.mobileassistant
    static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
}
