class Solution {
    public String intToRoman(int num) {
      int[] counts = new int[4];
      int[] values = {10000, 1000, 100, 10, 1};
      for (int i = 0; i < 4; i++) {
        counts[i] = num % values[i] / values[i + 1];
      }

      StringBuffer sb = new StringBuffer();
      //               0    1    2    3    4     5   6
      char[] romans = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
      // 1000의 자리, num 은 최대 3999
      sb.append("M".repeat(Math.max(0, counts[0])));
      for (int i = 1; i < 4; i++) {
        if (counts[i] == 9) {  //1 - 900: CM,2- 90: XC,3 - 9: IX
          sb.append(romans[i * 2]);
          sb.append(romans[(i - 1) * 2]);
        } else if (counts[i] == 4) { // 1 - 400: CD, 2 - 40: XL, 3 - 4: IV
          sb.append(romans[i * 2]);
          sb.append(romans[i * 2 - 1]);
        } else {
          if (counts[i] >= 5) {
            sb.append(romans[i * 2 - 1]);
            counts[i] -= 5;
          }
            sb.append(String.valueOf(romans[i * 2]).repeat(counts[i]));
        }
      }
      return sb.toString();
    }
}