import java.util.Scanner;

public class InsertSort {
    public  static int[] Merge(int[] a,int[] b) {
        int len1 = a.length, len2 = b.length;
        int[] c  = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == len1) {
            while (j < len2) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == len2) {
            while (i < len1) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        return c;
    }
    public static void main(String[] args) {

        System.out.print("输入一串数字：");
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        String[] a = x.split(",");
        int[] array1 = new int[a.length];
        for(int i=0; i< a.length; i++)
        {
            array1[i]=Integer.parseInt(a[i]);
        }
        System.out.print("待排序数组为：");
        for(int i=0; i< a.length; i++)
        {
            System.out.print(array1[i]+" ");
        }
        System.out.print("\n");
        int length = array1.length;
        //插入排序
        for (int i = 1; i < length; i++) {
            int insertNum = array1[i];
            int j = i - 1;//已经排序好的序列元素个数
            while (j >= 0 && array1[j] > insertNum) {//序列从后到前循环，将大于insertNum的数向后移动一格
                array1[j + 1] = array1[j];//元素移动一格
                j--;
            }
            array1[j + 1] = insertNum;//将需要插入的数放在要插入的位置。
        }
        System.out.print("排序结果：");
        for(int i=0; i< a.length; i++)
        {
            System.out.print(array1[i]+" ");
        }
        System.out.print("\n");

        System.out.print("继续输入一串数字：");
        Scanner sc = new Scanner(System.in);
        String y = sc.next();
        String[] b = y.split(",");
        int[] array2 = new int[b.length];
        for(int i=0; i< b.length; i++)
        {
            array2[i]=Integer.parseInt(b[i]);
        }
        length = array2.length;
        //插入排序
        for (int i = 1; i < length; i++) {
            int insertNum = array2[i];
            int j = i - 1;//已经排序好的序列元素个数
            while (j >= 0 && array2[j] > insertNum) {//序列从后到前循环，将大于insertNum的数向后移动一格
                array2[j + 1] = array2[j];//元素移动一格
                j--;
            }
            array2[j + 1] = insertNum;//将需要插入的数放在要插入的位置。
        }
        //合并两数组
        int[] array3 = Merge(array1,array2);
        System.out.println("结果为：");
        for(int i=0; i< array3.length; i++)
        {
            System.out.print(array3[i]+" ");
        }
    }
}

