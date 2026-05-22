package javanotes.algorithm.sort;

/**
 * @author 杨渡翔
 */
public final class QuickSort {
    private QuickSort() {
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int x = arr[(l + r) >> 1], i = l - 1, j = r + 1;
        while (j > i) {
            do { i++; } while (arr[i] < x);
            do { j--; } while (arr[j] > x);
            if (j > i) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        quickSort(arr, l, j);
        quickSort(arr, j + 1, r);
    }

    /**   实际上就是遍历一颗多叉树，只不过这棵树的Node比较复杂
    public static void backTracking(参数){
        if(终止条件){  递归结束
            存放结果;
            return ;
        }
        for(选择: 本层集合中元素){
            处理节点;
            backTracking(路径，选择列表);
            回撤结果
        }
    }*/
    public static void main(String[] args) {

    }
}
