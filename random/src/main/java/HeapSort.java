/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/4
 * @Time: 15:41
 * @Description:
 */
public class HeapSort extends AbstractSort {


    public void sort() {
        doSort();
    }

    public void doSort() {
        buildHeap();
        for (int i = data.size() - 1; i >= 1; i--) {
            removeOneAndAddToNewArray(i);
        }
    }

    public void removeOneAndAddToNewArray(int newArrayStart) {
        swap(0, newArrayStart);
        adjustHeap(0, newArrayStart);
    }

    /**
     * 头节点是新的，需要看一下是不是最大的
     */
    public void adjustHeap(int startIndex, int heapEndNotContained) {
        if (heapEndNotContained == 1) {
            // 堆中只有一个数值，直接返回即可
            return;
        }
        int index = startIndex;
        while (index <= (heapEndNotContained - 2) / 2) {
            int leftChildIndex = index * 2 + 1;
            int rightChildIndex = index * 2 + 2;
            int bigger;

            if (rightChildIndex == heapEndNotContained) {
                // 右边的子节点已经没了
                bigger = leftChildIndex;
            } else {
                // 左右子节点都有，需要比较一下
                if (smaller(leftChildIndex, rightChildIndex)) {
                    bigger = leftChildIndex;
                } else {
                    bigger = rightChildIndex;
                }
            }

            if (smaller(bigger, index)) {
                swap(index, bigger);
                index = bigger;
            } else {
                break;
            }
        }


    }

    public void buildHeap() {
        for (int i = (data.size() - 2) / 2; i >= 0; i--) {
            adjustHeap(i, data.size());
        }
    }

}
