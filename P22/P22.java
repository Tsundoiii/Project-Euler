package P22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class P22 {
    static int stringValue(String s) {
        int value = 0;
        for (char c : s.toCharArray()) {
            value += c - 64;
        }
        return value;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("P22.txt"));
            String[] names = br.readLine().split(",");
            for (int i = 0; i < names.length; i++) {
                names[i] = names[i].replace("\"", "");
            }
            Arrays.sort(names);
            int sum = 0;
            for (int j = 1; j <= names.length; j++) {
                sum += j * stringValue(names[j - 1]);
            }
            System.out.println(sum);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}