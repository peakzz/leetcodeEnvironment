class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int bit = res[i + j + 1]+ (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
                res[i + j + 1] = bit % 10;
                res[i + j] +=  bit/10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < res.length - 1 && res[index] == 0){
        }
            while (index < res.length) {
                sb.append(res[index++]);
            }
        return sb.toString();

    }
}