import java.util.List;
import java.util.ArrayList;

public class Main {
    public class BST<T extends Comparable>{
        //对集合进行操作
        //冒泡排序
        public <T extends Number> T[] bubbel(T[] a){
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=0;j<a.length-1-i;j++)
                {
                    if((int) a[j]>(int) a[j+1])
                    {
                        T temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.println("从小到大排序后的结果是:");
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
            return a;
        }
        //插入特定地址下的元素
        public void  insert(List<T> x,int t,T y){
            x.add(t,y);
        }
        //删除特定地址下元素
        public void delete(List<T> x,int t){
            x.remove(t);
        }
        //清空集合
        public void clear(List<T> x){
            x.clear();
        }
        //对树操作
        //插入左子树
        public void insertLeft(TreeNode<T> x, TreeNode<T> t){
            x.left = t;
        }
        //插入右子树
        public void insertRight(TreeNode<T> x, TreeNode<T> t){
            x.right = t;
        }
        //遍历树
        public class solution{
            public List<T> list = new ArrayList<>();
            //前序遍历
            public void preorder(TreeNode root){
                if(root != null){
                    list.add((T) root.value);
                    preorder(root.left);
                    preorder(root.right);
                }
                System.out.println(list);
            }

            //中序遍历
            public void inorder(TreeNode root){
                if(root != null){
                    inorder(root.left);
                    list.add((T)root.value);
                    inorder(root.right);
                }
                System.out.println(list);
            }
            //后序遍历
            public void backorder(TreeNode root){
                if(root != null){
                    backorder(root.left);
                    backorder(root.right);
                    list.add((T)root.value);
                }
                System.out.println(list);
            }
        }

    }
}
