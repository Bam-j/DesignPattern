package Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); <- 불가능!!!
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2){
            System.out.println("s1과 s2는 같은 객체입니다.");
        }
        else {
            System.out.println("s1과 s2는 다른 객체입니다.");
        }
    }
}
