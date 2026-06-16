class Solution {
    public String processStr(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                result = result + result;
            }
            else if (ch == '%') {
                result = new StringBuilder(result).reverse().toString();
            }
            else if (ch == '*') {
                if (!result.isEmpty()) {
                    StringBuilder sb = new StringBuilder(result);
                    sb.deleteCharAt(sb.length() - 1);
                    result = sb.toString();
                }
            }
            else {
                result += ch;
            }
        }

        return result;
    }
}