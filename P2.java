public class P2 {
    public static void main(String[] args) {
        int sum = 0;
        int currNum = 0;
        int lastNum = 1;
        while (currNum < 4000000) {
            currNum = currNum + lastNum;
            lastNum = currNum - lastNum;
            if (currNum % 2 == 0) {
                sum += currNum;
            }
        }
        System.out.println(sum);
    }
}