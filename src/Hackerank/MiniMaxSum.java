package Hackerank;

public class MiniMaxSum {
    public static void main(String[] args) {
        int min, max = 0;
        int [] num = new int[5];
        num= new int[]{9,2,6,3,5};
        min =num[0];
        for(int i =0; i<5; i++){
            if (max<num[i]){
                max=num[i];
            }else if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
