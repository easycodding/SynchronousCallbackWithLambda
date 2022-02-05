public class Main {
    interface OnSuccessListener{ void onSuccess(int sum);}
    interface OnFailListener{ void onFail();}

    public static void findSum(int number1, int number2, OnSuccessListener sL, OnFailListener fL){
        int sum;
        try{
            sum = number1 + number2;
            sL.onSuccess(sum);
        }
        catch (Exception e){
            fL.onFail();
        }


    }

    public static void main(String args[]){
        int n1=19, n2=99;
        findSum(n1,n2,sum -> {
            System.out.println("sum is " + sum);
            },()->{
            System.out.println("fail");
        });
    }

}
