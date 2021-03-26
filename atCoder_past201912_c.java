import java.util.*;

class atCoder_past201912_c{
    private static int[] numChecker(){              //入力を処理するメソッド
        Scanner sc = new Scanner( System.in );      //入力受け取り
        String[] moji = sc.nextLine().split(" ");    //空白文字での分割
        int[] ans = new int[6];                  
        for(int i=0;i<6;i++){
            try{                                    //数字を数値へ変換
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

        for(int i=1;i<4;i++){                   //昇順バブルソートを半分だけ行う
            for(int j=0;j<6-i;j++){
                if(nums[j]>nums[j+1]){
                    int tab = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tab;
                }
            }
        }

        System.out.println(nums[3]);            //三番目に大きい数値を出力
    }
}

