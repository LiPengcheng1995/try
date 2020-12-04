import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/12/3
 * @Time: 15:51
 * @Description:
 */
public class FastSort {

    public static final Integer ARRAY_SIZE = 10;
    public static final boolean BIGGER = true;// 升序

    public List<Integer> data;

    private Integer times = 0;

    public FastSort(List<Integer> data) {
        this.data = data;
    }

    public void sort(int leftIndex, int rightIndex) {
        // 边界判断，当然可以放在这里，也可以在最下面递归调用前通过
        // baseIndex,nextSwapIndex-1 判断是否递归来做边界判断
        if(leftIndex<0||rightIndex>=data.size()||leftIndex>=rightIndex){
            return;
        }
        int baseIndex = leftIndex;
        int nextSwapIndex = leftIndex+1;

        for(int i=baseIndex+1;i<=rightIndex;i++){
            if (needSwap(baseIndex,i)){
                swap(nextSwapIndex,i);
                nextSwapIndex++;
            }
        }
        if (nextSwapIndex != baseIndex+1){
            // 有需要移动到左边的
            swap(baseIndex,nextSwapIndex-1);
        }
        String mesage = "处理%s次,left:%s,right:%s,nextSwapIndex:%s,data:%s";
        mesage = String.format(mesage,times,leftIndex,rightIndex,nextSwapIndex,data);
        times++;
        System.out.println(mesage);
        sort(leftIndex,nextSwapIndex-2);
        sort(nextSwapIndex,rightIndex);
    }

    private void swap(Integer leftIndex,Integer rightIndex){
        Integer temp = data.get(leftIndex);
        data.set(leftIndex,data.get(rightIndex));
        data.set(rightIndex,temp);
    }

    private boolean needSwap(Integer leftIndex,Integer rightIndex){
        Integer left = data.get(leftIndex);
        Integer right = data.get(rightIndex);
        return BIGGER?right-left<0:right-left>0;
    }

    public static void main(String[] args) {
        for (int t=0;t<5;t++){
            System.out.println("=======开始一次计算");
            List<Integer> data = new ArrayList<>();
            for (int i=0;i<ARRAY_SIZE;i++){
                data.add((int) (Math.random()*100));
            }
            System.out.println(data);
            new FastSort(data).sort(0, data.size()-1);
            System.out.println(data);
            System.out.println(">>>>>>完成一次计算");

        }
    }
}
