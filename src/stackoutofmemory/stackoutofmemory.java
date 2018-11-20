package stackoutofmemory;

/**
 * @Author: yanshilong
 * @Date: 18-11-19 下午12:19
 * @Version 1.0
 */

//栈帧太大导致栈溢出

public class stackoutofmemory {
    private int length=1;
    public void Docreate(){
        length++;
        Docreate();
    }

    public static void main(String[] args) {
        stackoutofmemory s = new stackoutofmemory();

        try {
            s.Docreate();
        } catch (Throwable e) {
            System.out.println("长度: " + s.length);
            throw e;
        }
    }
}
