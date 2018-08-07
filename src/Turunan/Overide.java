package Turunan;

import Implemen.MamalInt;

class Binatang{
    public void Bergerak(){
        System.out.println("Dengan Kaki");
    }
}
class Mamalia extends Binatang{
    public void Bergerak(){
        System.out.println("Dengan Sayap");
    }
}
public class Overide  {
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();

        b.Bergerak();
        m.Bergerak();
    }
}
