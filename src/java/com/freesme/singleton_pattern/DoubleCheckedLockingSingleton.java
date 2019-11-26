package com.freesme.singleton_pattern;

/**
 * 双检锁 单例
 *  多线程安全
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton singleton;
    private DoubleCheckedLockingSingleton(){}
    public static DoubleCheckedLockingSingleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                singleton = new DoubleCheckedLockingSingleton();
            }
        }
        return singleton;
    }
}
