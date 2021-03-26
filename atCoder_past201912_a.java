import java.util.*;

class myatcodertest{
    private static int[] numChecker(){              //数字かどうかを判断するメソッド
        Scanner sc = new Scanner( System.in );      //入力受け取り
        String[] moji = sc.nextLine().split("");    //１文字ずつに分割
        int[] ans = new int[3];                     
        for(int i=0;i<3;i++){
            try{                                    //数字なら数値に,そうでなければ例外処理
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
            System.out.println("error");            //例外処理の場合
        }else{
            System.out.println(nums[0] * 200 + nums[1] * 20 + nums[2] * 2);
                                                    //元の数を二倍にして出力
        }
    }
}

