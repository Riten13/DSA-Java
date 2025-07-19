package Learning;

public class recursion {
    public static void TOH(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer Disk:"+n+" from "+src+" to "+dest);
            return;
        }
        TOH(n-1,src,dest,helper);
        System.out.println("Transfer Disk:"+n+" from "+src+" to "+dest);
        TOH(n-1, helper, src, dest);
    }
    public static void strrev(String str,int n){
        if(n==0){
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        strrev(str, n-1);
    }
    public static int first =-1;
    public static int last =-1;

    public static void FirstOccurenceAndLastOccurance(String str,int i, char a) {
        if(i == str.length()){
            System.out.print("first index: "+first+" Last Index: "+last);
            return;
        }
        if(str.charAt(i) == a){
            if (first == -1) {
                first = i;
            }else{
                last = i;
            }
        }
        FirstOccurenceAndLastOccurance(str, i+1, a);
    }
    public static boolean flag = true;
    public static boolean strictArr(int[] arr,int i){
        if (arr.length-1 == i) {
            return flag;
        }
        if(arr[i+1] <= arr[i]){
            flag = false;
        }
        strictArr(arr, i+1);
        return flag;
    }
    public static void main(String[] args) {
        // int n=3;
        // TOH(n, "S", "H", "D");
        // strrev("Riten", 4);
        // FirstOccurenceAndLastOccurance("abaacdaefaah", 0,'a');
        int[] arr = {1,4,2,3,4,5};
        boolean str = strictArr(arr, 0);
        System.out.println(str);
    }
}
