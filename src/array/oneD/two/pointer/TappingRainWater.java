package array.oneD.two.pointer;

public class TappingRainWater {
    public static void main(String[] args) {
        int[] a = {4,2,0,5,2,6,2,3};
//        int waterLabel = waterFIlled(a, a.length);
//        System.out.println(waterLabel);
        int waterLabel1 = findingWaterFillWithoutExtraSpace(a, a.length);
        System.out.println(waterLabel1);
    }

    //TC = O(n)
    //SC = O(n)
    private static int waterFIlled(int[] a, int length) {

        int waterSum = 0;
        //find max prefix sum
        int[] maxPrefix = new int[length];
        maxPrefix[0] = 0;
        for(int i=1;i<length;i++){
            maxPrefix[i] = Math.max(maxPrefix[i-1], a[i-1]);
        }
        int[] maxSuffix = new int[length];
        maxSuffix[length-1] = 0;
        for(int i=length-2;i>=0;i--){
            maxSuffix[i] = Math.max(maxSuffix[i+1], a[i+1]);
        }
        for(int i=0;i<length;i++){
            int min = Math.min(maxSuffix[i], maxSuffix[i]);
            if(min - a[i] > 0){
                waterSum +=(min - a[i]);
            }
        }

        return waterSum;
    }

    //TC = O(n)
    //SC = O(1)
    //4,2,0,5,2,6,2,3
    private static int findingWaterFillWithoutExtraSpace(int[] a,int length){
        int waterSum = 0;
        int maxPrefix = 0;
        int maxSuffix = 0;
        int start = 0;
        int end = length-1;
        while(start < end){
            maxPrefix = Math.max(maxPrefix, a[start]);
            maxSuffix = Math.max(maxSuffix, a[end]);

            int diff = Math.min(maxSuffix, maxPrefix);
            if(diff > 0){
                waterSum +=diff;
            }

            start++;
            end--;
        }

        return waterSum;
    }
}
