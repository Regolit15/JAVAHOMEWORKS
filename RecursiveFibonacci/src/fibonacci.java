public class fibonacci {
    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        System.out.print(fib(2));

    }

    /*
    f(1)=1
    f(2)=1
    **
    **
    f(n)=f(n-1)+f(n-2)
    f(6)=f(5)+f(5)
    f(5)=f(4)+f(3)
    f(4)=f(3)+f(2)
    f(3)= f(2)+f(1)
     */




}
