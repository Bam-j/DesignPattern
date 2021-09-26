package TemplateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        ChocolateCookie chocolateCookie = new ChocolateCookie();
        chocolateCookie.prepareCookies();

        System.out.println("=========================");

        CinnamonCookie cinnamonCookie = new CinnamonCookie();
        cinnamonCookie.prepareCookies();
    }
}