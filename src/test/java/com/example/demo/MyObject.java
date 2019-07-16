package com.example.demo;


/**
 * @Author: guokk
 * @Date: 2019/7/9 0009
 * @Version 1.0
 */
public class MyObject {

    public boolean flag = true;
    public int count = 1;

    public synchronized void printNum(){
        while(flag == false){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print(count*2-1);
        System.out.print(count*2);
        flag = false;
        this.notify();
    }

    public synchronized void printA(){
        while(flag == true) {
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print((char)(count+'A'-1));
        flag = true;
        count++;
        this.notify();
    }

}
