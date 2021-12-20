// 找房子左右两侧最小距离中的最大距离

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int pos = 0;
        for(int house : houses) {
            while(pos < heaters.length && heaters[pos] < house)
                ++pos;
            if(pos == 0) 
                radius = Math.max(radius, heaters[pos] - house);
            else if(pos == heaters.length)
                radius = Math.max(radius, houses[houses.length - 1] - heaters[pos - 1]);
            else 
                radius = Math.max(radius, Math.min(house - heaters[pos - 1], heaters[pos] - house));
        }

        return radius;
    }
}
