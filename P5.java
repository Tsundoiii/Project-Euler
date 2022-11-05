class P5 {
    public static boolean divis(int number) {
        boolean divisible = true;
            for (int i = 1; i < 21; i++) {
            if (number % i != 0) {
                divisible = false;
            }
        }
        return divisible;
    }
  
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (divis(i)) {
                System.out.println("Number: " + i);
                break;
            }
            i++;
        }   
    }
}