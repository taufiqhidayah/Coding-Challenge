package Implemen;

public class MamalInt implements Mamal {
    public  void  eat(){
        System.out.println("haha");
    }
    public  void  travel(){
        System.out.println("hihi");
    }

    public static void main(String[] args) {
        MamalInt mamalInt = new MamalInt();
        mamalInt.eat();
        mamalInt.travel();
    }
}
