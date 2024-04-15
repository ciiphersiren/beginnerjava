public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int originalNum = number;
        String num = Integer.toString(number);
        int exponent = num.length();
        int result = 0;
        while(number>0){
            int adder = number%10;
            result += Math.pow(adder, exponent);
            number /= 10;
        }
        if(result == originalNum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(2563));
    }
}
