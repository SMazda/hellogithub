import java.util.*;

class myatcodertest{
    private static int[] numChecker(){
        Scanner sc = new Scanner( System.in );
        String[] moji = sc.nextLine().split("");
        //System.out.println(moji[1]);
        int[] ans = new int[3];
        for(int i=0;i<3;i++){
            try{
                ans[i] = Integer.parseInt(moji[i]);
            }catch ( NumberFormatException ex ){
                return null;
            }
        } 
        return ans;
    }


    public static void main(String[] args){
        int[] nums;
        nums = numChecker();

        if(nums == null){
            System.out.println("error");
        }else{
            System.out.println(nums[0] * 200 + nums[1] * 20 + nums[2] * 2);
        }
    }
}

