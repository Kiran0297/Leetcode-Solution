class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
       int j=0;
        
       for(j=0;j<nums.length;j++){

         if(nums[j]!=0){
           nums[i]=nums[j];
           i++;
         }
       }

         for( i=i;i<nums.length;i++){
            nums [i]=0;
         }
         } 
    }

