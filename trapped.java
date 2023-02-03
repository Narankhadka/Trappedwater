import java.util.function.LongFunction;
import java.util.*;

public class trapped{
    public static int trappedwater(int height[])
    {
        int n =height.length;
        //calculate left max boundary _ array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);

        }
        //calculate right max boundary_array
        int rightMax[]=new int[n];
           rightMax[n-1]=height[n-1];
           for(int i=n-2;i>=0;i--)
           {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
           }
           int TrapeedWater=0;

           //
           for(int i=0;i<n;i++)
           {
            //water level= Math.min(leftmax boundary , rightmax boundary)
                int water_level=Math.min(leftMax[i], rightMax[i]);
                //trapped water=water level-height[i]
                TrapeedWater+=water_level-height[i];
           }
           return TrapeedWater;
    }

public static void main(String[] args) {

int height[]={4,2,0,6,3,2,5};
System.out.println("trapped water is " +trappedwater(height) );
    
}
}