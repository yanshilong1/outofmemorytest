import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: yanshilong
 * @Date: 18-11-20 上午10:15
 * @Version 1.0
 */
public class directmemory {
    private static final int  _1M=1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafefield=Unsafe.class.getDeclaredFields()[0];
        unsafefield.setAccessible(true);
        Unsafe unsafe= (Unsafe) unsafefield.get(null);
        while (true){
            unsafe.allocateMemory(_1M);
        }
    }
}
