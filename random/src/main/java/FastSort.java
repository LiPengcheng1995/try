/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/3
 * @Time: 15:51
 * @Description:
 */
public class FastSort extends AbstractSort {
    private Integer times = 0;

    @Override
    void sort() {
        doSort(0, data.size());
    }

    public void doSort(int leftIndex, int rightIndex) {
        // 边界判断，当然可以放在这里，也可以在最下面递归调用前通过
        // baseIndex,nextSwapIndex-1 判断是否递归来做边界判断
        if (leftIndex < 0 || rightIndex >= data.size() || leftIndex >= rightIndex) {
            return;
        }
        int baseIndex = leftIndex;
        int nextSwapIndex = leftIndex + 1;

        for (int i = baseIndex + 1; i <= rightIndex; i++) {
            if (smaller(baseIndex, i)) {
                swap(nextSwapIndex, i);
                nextSwapIndex++;
            }
        }
        if (nextSwapIndex != baseIndex + 1) {
            // 有需要移动到左边的
            swap(baseIndex, nextSwapIndex - 1);
        }
        String mesage = "处理%s次,left:%s,right:%s,nextSwapIndex:%s,data:%s";
        mesage = String.format(mesage, times, leftIndex, rightIndex, nextSwapIndex, data);
        times++;
        System.out.println(mesage);
        doSort(leftIndex, nextSwapIndex - 2);
        doSort(nextSwapIndex, rightIndex);
    }

}
