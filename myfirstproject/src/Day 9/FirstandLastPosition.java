class FirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstnum(nums,target);
        int second = secondnum(nums,target);
        return new int[]{first,second};
    }

    public static int firstnum(int[]nums,int target){
        int l = 0;
        int h = nums.length-1;
        int result=-1;
        while(h>=l){
            int mid = l+(h-l)/2;

            if(nums[mid] == target){
                result = mid;
                h = mid-1;
            }
            else if(nums[mid]>target){
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
    return result;
    }

 public static  int secondnum(int[]nums,int target){
        int l = 0;
        int h = nums.length-1;
        int result=-1;
        while(h>=l){
            int mid = l+(h-l)/2;

            if(nums[mid] == target){
                result = mid;
                l = mid+1;
            }
            else if(nums[mid]>target){
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int []result = searchRange(arr,8);
        int i=0;
        while( i<result.length){
        System.out.print(result[i]+" ");
        i++;

        }
    }
}
