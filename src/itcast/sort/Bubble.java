package itcast.sort;

import java.util.Arrays;

public class Bubble {
    /*
    排序
     */
    public static void sort(Comparable[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                //比较索引j和j+1
                if(greater(a[j],a[j+1])){
                    exchange(a,j,j+1);
                }
            }
        }
    }
    /*
      比较大小
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    /*
        交换
     */
    private static void exchange(Comparable[] a,int i,int j){
          Comparable temp;
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
    }

    public static void main(String[] args) {
        Integer[] a={4,5,6,3,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
