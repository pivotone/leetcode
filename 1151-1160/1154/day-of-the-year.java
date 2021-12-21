// 简单爆破

class Solution {
    public int dayOfYear(String date) {
        // int year = Integer.valueOf(date.substring(0, 4));
        // int month = Integer.valueOf(date.substring(5,7));
        // int day = Integer.valueOf(date.substring(8));
        int year = (date.charAt(0) - '0')*1000 + (date.charAt(1) - '0')*100 + (date.charAt(2) - '0')*10 + (date.charAt(3) - '0');
        int month = (date.charAt(5) - '0')*10 + (date.charAt(6) - '0');
        int day = (date.charAt(8) - '0')*10 + (date.charAt(9) - '0');
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
            days[2] = 29;
        int result = 0;
        for(int i = 1; i < month; ++i)
            result += days[i];
        result += day;

        return result;
    }
}
