package TemplateMethod;

public class ChocolateCookie extends CookieTemplate {
    @Override
    void decorate() {
        System.out.println("초콜릿 장식하기");
    }
}
