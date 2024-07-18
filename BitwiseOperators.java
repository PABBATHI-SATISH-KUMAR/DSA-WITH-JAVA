//1) Single Number
// 2) Power of two(2)




class BitwiseOperators {
    public static void main(String[] args) {
        
        BitwiseOperators ob = new BitwiseOperators();
        // int nums[] ={2,2,1};
        // System.out.println(ob.singleNumber(nums));
        int n= 16;
        System.out.println(ob.isPowerOfTwo(n));
    }


    //1) Single Number
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int n:nums){
            unique ^= n;
        }
        return unique;
    }

// 2) Power of two(2)
    public boolean isPowerOfTwo(int n) {
        // if(n==0) return false;
        //  while(n>0){
        //     if(n==1)return true;
        //     if(n %2 !=0)break;
        //     n /=2;
        // }
        // return false;
         if(n <= 0) return false;
         return (n & (n - 1)) == 0;
        
    }
   
}