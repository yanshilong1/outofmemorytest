package stackoutofmemory;

/**
 * @Author: yanshilong
 * @Date: 18-11-20 上午10:04
 * @Version 1.0
 */

//循环创建线程使得线程栈溢出
public class threadoutofmemory {
    public void dostop(){
        while(true){

        }

    }



    public void statckleakthread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dostop();

                }
            });

            thread.start();

        }
    }

    public static void main(String[] args) {
        threadoutofmemory t=new threadoutofmemory();
        t.statckleakthread();
    }
}
