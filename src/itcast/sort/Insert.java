package itcast.sort;

import java.util.Arrays;

public class Insert {
    public static void sort(Comparable[] a){
        //第一个是已排序的  从第二个元素开始是未排序的 遍历未排序
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0; j--) {
                //比较j和j-1的值，如果j处值比j-1处值小，则交换数据，否则找到位置了
                if(!greater(a[j],a[j-1])){
                    exchange(a,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    /*
      比较大小
     */
    /*卧槽*/
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    /*
      比较大小
     */
    /*卧槽*/
    private static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        Integer[] a={4,5,6,3,1,7,12,8,2,9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
