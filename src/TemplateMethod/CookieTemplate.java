package TemplateMethod;

public abstract class CookieTemplate {
    void prepareCookies() {
        knead();
        baking();
        decorate();
        packageCookies();
    }
    public void knead(){
        System.out.println("쿠키 도우 반죽");
    }

    public void baking() {
        System.out.println("쿠키 굽는 중");
    }

    abstract void decorate();

    public void packageCookies(){
        System.out.println("쿠키 포장하기");
    }
}
