package TemplateMethod;

public class CinnamonCookie extends CookieTemplate {
    @Override
    void decorate() {
        System.out.println("시나몬 장식하기");
    }
}
