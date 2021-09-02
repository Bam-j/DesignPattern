package Decorator;

public class CustomCakeShop {
    public static void main(String[] args) {
        System.out.println("==1번 손님==");
        Cakesheet cake1 = new Sponge();
        System.out.println(cake1.getDescription() + "는 " + cake1.cost() + "원");
        System.out.println("----------------");

        System.out.println("==2번 손님==");
        Cakesheet cake2 = new Sponge();
        cake2 = new WhippingCream(cake2);
        System.out.println(cake2.getDescription() + "는 " + cake2.cost() + "원");
        System.out.println("----------------");

        System.out.println("==3번 손님==");
        Cakesheet cake3 = new Sponge();
        cake3 = new WhippingCream(cake3);
        cake3 = new Mocha(cake3);
        System.out.println(cake3.getDescription() + "는 " + cake3.cost() + "원");
        System.out.println("----------------");

        System.out.println("==4번 손님==");
        Cakesheet cake4 = new Chiffon();
        cake4 = new WhippingCream(cake4);
        cake4 = new Mocha(cake4);
        System.out.println(cake4.getDescription() + "는 " + cake4.cost() + "원");
        System.out.println("----------------");
    }
}
