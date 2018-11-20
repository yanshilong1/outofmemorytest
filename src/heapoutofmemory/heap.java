package heapoutofmemory;

import java.util.ArrayList;

/**
 * @Author: yanshilong
 * @Date: 18-11-19 下午12:11
 * @Version 1.0
 *
 *
 */
//java堆内存溢出测试
public class heap {
    static class  OOMobject{
      // String name;
    }

    public static void main(String[] args) {
    // int i=0;

        ArrayList<OOMobject> arrayList=new ArrayList();

        while (true){
            arrayList.add(new OOMobject());
            //System.out.println(i++);
        }
}


}
