public class Main {
    public static void main(String[] args) {
        int last =factorial(5);
        System.out.println(last);

    }


    public static int factorial (int n){
        if(n==0){
            return 1;
        }
        else{
        return n* factorial(n-1);
        }
    }
}

