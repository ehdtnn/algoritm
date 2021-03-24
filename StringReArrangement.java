package test;

public class StringReArrangement {
    public static void main(String[] args) {
        String input = "K1KA5CB7";
        String result = "";

        int sum = 0;
        int[] alphabet = new int[26];
        for (int i=0; i<input.length(); i++) {
            int c = input.charAt(i);
            System.out.println(c);
            if (c < 57) {
                sum += (c-48);
            } else {
                alphabet[(c-65)]++;
            }
        }

        for (int i=0; i<alphabet.length; i++) {
            int count = alphabet[i];
            for (int j=0; j<count; j++) {
                result += (char) (i+65);
            }
        }

        System.out.println(result + sum);

    }
}
