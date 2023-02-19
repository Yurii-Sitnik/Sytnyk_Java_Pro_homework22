public class WorkWithLambdas {
    public static void main(String[] args) {
        WorkWithLambdas workWithLambdas = new WorkWithLambdas();
        PerformOperation operation;
        boolean result;

        int num1 = 9;
        operation = workWithLambdas.isOdd();
        result = workWithLambdas.check(operation,num1);
        System.out.println(result);

        int num2 = 8;
        operation = workWithLambdas.isPrime();
        result = workWithLambdas.check(operation,num2);
        System.out.println(result);

        int num3 = 123321;
        operation = workWithLambdas.isPalindrome();
        result = workWithLambdas.check(operation,num3);
        System.out.println(result);
    }
    public boolean check(PerformOperation po, int num) {
        return po.check(num);
    }
    public PerformOperation isOdd() {
        return number -> number % 2 != 0;
    }
    public PerformOperation isPrime() {
        return (a) -> {
            for(int i=2; i<=a/2; i++)
            {
                if(a % i == 0)
                {
                    return false;
                }
            }
            return true;
        };
    }
    public PerformOperation isPalindrome()
    {
        return (a) -> {
            int reverse = 0;
            int lastDigit = 0;
            int num = a;
            while(num != 0)
            {
                lastDigit = num % 10;
                reverse = (reverse * 10) + lastDigit;
                num /= 10;
            }
            return reverse == a;
        };
    }
}

