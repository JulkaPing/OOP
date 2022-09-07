package secure;

public class SslSecure {

    private final String DOMAIN = ".com";
    private final int DOMAIN_LENGTH = DOMAIN.length();
    private final String PROTOCOL = "http";

    public String[] urlWebSites(String[] urls) {
        for (int i = 0; i < urls.length; i ++) {
            urls[i] = (urls[i].replace(PROTOCOL,"https" )).toString();
            int count = (urls[i].indexOf(DOMAIN));
            urls[i] = (urls[i].substring(0, count + DOMAIN_LENGTH + 1)).toString();
        }
        return urls;
    }
}