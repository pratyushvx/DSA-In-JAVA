//House Robbery 
class Dp_06{
    public static int start(int nums[],int index){
        if(index==0) return nums[0];
        if(index<0) return 0;
        int rob=nums[index]+start(nums,index-2);
        int notrob=0+start(nums,index-1);
        return Math.max(rob,notrob);
        }
    public static int rob(int[] nums){
    System.out.println(start(nums,nums.length-1));
    return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
    rob(nums);
    }
}