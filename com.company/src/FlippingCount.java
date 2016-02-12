/**
 * Created by vivigorkal on 2/12/2016.
 */
public class FlippingCount {

    public static void main(String[] args) {
        String input1 = "10110101101";
        System.out.println(nochange_bits(input1, 3, 4));
    }

    public static int nochange_bits(String input1, int input2, int input3) {
        int count = 0;
        StringBuilder builder = new StringBuilder();
        builder.append(input1);
        if (input2 != 0 || input3 != 0) {
            for (int counter1 = input2; counter1 <= input1.length(); ) {

                char rep = input1.charAt(counter1);
                if (rep == '0') {
                    builder.setCharAt(counter1, '1');
                } else {
                    builder.setCharAt(counter1, '0');
                }
                counter1 = counter1 + input2;
            }
            for (int counter2 = input3; counter2 <= input1.length(); ) {
                char rep = input1.charAt(counter2);
                if (rep == '0') {
                    builder.setCharAt(counter2, '1');
                } else {
                    builder.setCharAt(counter2, '0');
                }
                counter2 += input3;
            }

        } else {
            return -1;
        }

        for (int n = 0; n < input1.length(); n++) {
            if (input1.charAt(n) == builder.charAt(n)) {
                count = count + 1;
            }
        }
        //Write code here
        return count;

    }

}

