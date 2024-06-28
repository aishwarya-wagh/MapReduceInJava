public class Main {
    public static void main(String[] args) {
        System.out.println("Map reduce job to calculate the average");
int []a={89,62,70,58,47,47,46,76,100,70};
int[] b = dailyTemperatures(a);
for(int ab: b)
System.out.println(ab);


    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int left=0;
        int right=0;
        int tempDiff =0;
        int[] ans = new int[temperatures.length];
        ans[temperatures.length-1]=0;

        for(int i=0; i< temperatures.length-1; i++){
            right=i+1;
            left=i;

            tempDiff=temperatures[right]- temperatures[left];
            System.out.println("left: "+temperatures[left]+" right: "+temperatures[right]+" diff: "+tempDiff);
            while(tempDiff < 0 && right < temperatures.length-1){
                right++;
                tempDiff = temperatures[right]- temperatures[left];
            }
            if(tempDiff >=  1) {
                ans[i] = right - left;
            }

        }
        return ans;
    }
}