package com.qmm.chapter1;


import java.util.Iterator;

/**
 *
 * @author qinmengmei
 * @date 2018/10/24
 */
//编写一个类ResizingArrayQueueOfStrings使用定长数组实现队列的抽象,
//然后扩展实现,使用调整数组的方法突破数组大小的限制
public class ResizingArrayQueueOfStrings<Item> implements Iterable<Item> {
    private Item[] a=(Item[])new Object[1];
    int head=0;        //指向队列的开头的索引
    int tail=0;        //指向队列的结尾的索引
    int N;            //数组中装填的元素数量

    public boolean isEmpty() {
        return N==0;
    }
    public int size() {
        return N;
    }
    public void add(Item item) {
        if(N==a.length) resize(a.length*2);//N增加至数组容量的时候,动态扩展数组的大小
        a[tail++]=item;        //从tail(尾部)索引处获取元素.
        if(tail==a.length) tail=0;    //如果tail索引增加到了数组的长度,那么重新置0
        N++;                //增加N.
    }
    public Item remove() {
        Item item=a[head];    //从队列头移除元素
        a[head++]=null;        //将队列头的元素设为null,避免对象游离
        N--;                //将N减一
        if(head==a.length) head=0;    //如果head索引增加到了数组的长度,重新置0
        if(N<a.length/4) resize(a.length/2);
        return item;    //返回队列头部的元素.
    }
    public void resize(int n) /*动态调整数组大小的方法*/{
        //将数组引用指向一个更大的数组
        Item[] items=(Item[])new Object[n];
        for(int i=0;i<N;i++) {
            items[i]=a[(i+head)%a.length];    //从头元素开始赋值给新的元素.
        }
        a=items;
        //将头元素和尾部元素分别置位.
        head=0;
        tail=N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<Item> {
        int i=0;
        @Override
        public boolean hasNext() {
            return i<N;
        }

        @Override
        public Item next() {
            Item item=a[(i+head)%a.length];    //从头元素开始获取元素.
            i++;
            return item;
        }

    }
}
