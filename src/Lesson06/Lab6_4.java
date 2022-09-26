package Lesson06;


public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://google.com.vn";

        System.out.println("SSL Cetificate: " + getSSL(url));
        System.out.println("Domain Name: " + getDomain(url));
        System.out.println("Extension: " + getDomainExtension(url));
    }

    private static String getDomainExtension(String url) {
        int getExtension = url.indexOf("google");
        String urlExtension = url.substring(getExtension + "google".length());
        return urlExtension;
    }

    private static String getDomain(String url) {
        int getTheSlash = url.indexOf("/");
        String domain = url.substring(getTheSlash + 2);
        return domain;
    }

    private static String getSSL(String url) {
        int getTheColon = url.indexOf(":");
        if (url.substring(0, getTheColon).equals("https")) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
