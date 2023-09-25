public class Base {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public boolean isPalindrome(int x) {
        String c = "" + x;
        String p = "";
        for (int i = c.length(); i > 0; i--) {
            p += c.charAt(i - 1);
        }
        return p.equals(c);
    }

    public int romanToInt(String s) {
        int romInputSize = s.length();
        char[] r = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] n = {1, 5, 10, 50, 100, 500, 1000};
        int suma = 0;
        int aux = 0;
        int aux1 = 0;
        char be;
        char ne;
        int romValSize = n.length;
        boolean nextVal = false;
        boolean nextVal1 = false;
        for (int i = 0; i < romInputSize; i++) {
            for (int j = 0; j < romValSize; j++) {
                be = s.charAt(i);
                if (be == r[j]) {
                    ne = (i + 1) < romInputSize ? s.charAt(i + 1) : s.charAt(i);
                    nextVal = (j + 1) < romValSize;
                    nextVal1 = (j + 2) < romValSize;
                    aux = nextVal ? (j + 1) : j;
                    aux1 = nextVal1 ? (j + 2) : j;
                    if (ne == r[aux] && nextVal) {
                        suma += n[aux] - n[j];
                        i += 1;
                        break;
                    } else if (ne == r[aux1] && nextVal1) {
                        suma += n[aux1] - n[j];
                        i += 1;
                        break;
                    } else {
                        suma += n[j];
                        break;
                    }
                }
            }
        }
        return suma;
    }

    public String longestCommonPrefix(String[] strs) {
        int aux = 0;
        String res = "";
        int strlen = strs.length;
        boolean validar = false;
        if(strlen == 1){
            res = strs[0];
        }else {

                for (int i = 0; i < strs[0].length(); i++) {
                    for (int i = 0; i < strlen; i++) {
                }
            }
        }
        return res;
    }
}
