package _package;

import java.util.*;

public class Util {
    public static void mySleep(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {}
    }
    
    public static void myWait(Object obj) {
        System.out.println("waiting");
        try {
            obj.wait();
        } catch(InterruptedException e) {}
    }
}
