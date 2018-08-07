package Turunan;

import com.company.Swape;

public class Children extends Parent implements Runnable {
    public  String getNama(){
        return super.getNama();
    }

    @Override
    public Integer getUmur() {
        return super.getUmur();
    }

    public static void main(String[] args) {
        Swape swape = new Swape();
       Integer a = swape.swapp(12,13);
        System.out.println(a);
       Parent children = new Parent(); children.status="nikal";
        System.out.println("dari oublik"+ children.getNama());
        System.out.println("dari protected"+ children.getUmur());
        System.out.println("dari protected"+ children.getJomblo());

    }

    @Override
    public void run() {

    }
}
