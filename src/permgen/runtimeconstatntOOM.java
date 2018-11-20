package permgen;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yanshilong
 * @Date: 18-11-20 上午10:11
 * @Version 1.0
 */

//方法区--运行时常量池溢出

public class runtimeconstatntOOM {
    public static void main(String[] args) {
        List list=new ArrayList();
        int i=1;
        while (true){
            list.add(String.valueOf(i++).intern());

        }
    }

}
