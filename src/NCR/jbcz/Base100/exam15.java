package NCR.jbcz.Base100;

/**
 * Created by dell on 2018/4/15.
 * 定义一个长度为50的一维数组,并且分别将1-50赋值给数组中的各个元素,最后输出元素对应的值
 */
public class exam15 {
    public static void main(String[] args) {
        int []arr;
        arr=new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
