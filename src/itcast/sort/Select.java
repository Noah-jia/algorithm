package itcast.sort;

import java.util.Arrays;

/**
 * @author Ellenjia
 */
public class Select {
    public static void main(String[] args) {
        Integer[] a={4,5,6,3,1,9,7,12,8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    /**
     对数组元素进行排序
     **/
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length-1 ; i++) {
          int minIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if(greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exch(a,minIndex,i);
        }
    }

    /**
     * 判断v是否大于w
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /**
     * 交换a数组中，索引i和j处的值
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
