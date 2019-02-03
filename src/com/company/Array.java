package com.company;

/**
 * @Date: 2019/2/2 0002 11:55
 * @Author: Luck
 */
public class Array<E> {

    private E[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data=(E[]) new Object[capacity];
        size=0;
    }

    //无参构造函数，默认capacity为10
    public Array(){
        this(10);
    }

    //获取数组中元素的个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //判断数组是否为空
    public Boolean isEmpty(){
        return size==0;
    }

    //向所有数组后添加元素
    public void addLast(E e){
//        if(size==data.length){
//           throw new  IllegalArgumentException("addLast failed, the Array is full!");
//        }
//        data[size]=e;
//        size++;
        add(e,size);
    }


    //在所有元素前添加元素e
    public void addFirst(E e){
        add(e,0);
    }
    //在index位置插入元素e
    public void add(E e,int index){

        if(index<0||index>size){
            throw new  IllegalArgumentException("addLast failed, index<0||index>size!");
        }

        if(size==data.length){
         //扩容
            resize(2*data.length);
        }


        for(int i=size-1; i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }


    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(String.format("Array : size=%d,capacity=%d  ",size,data.length));
        stringBuilder.append("[");
        for (int i=0;i<size;i++){
            stringBuilder.append(data[i]);
            if(i!=size-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    //获取index位置的元素
    E get(int index){

        if(index<0||index>size){
            throw new  IllegalArgumentException("get failed, index<0||index>size!");
        }

        return data[index];
    }

    //修改index位置的元素为e
    public void set(int index,E e){
        if(index<0||index>size){
            throw new  IllegalArgumentException("set failed, index<0||index>size!");
        }
        data[index]=e;
    }


    //查找数组中是否含有e
    public Boolean contains(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    //查找元素e的索引,如果不存在返回-1
    public int find(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //删除数组中的某一元素
    public E remove(int index){



        E res=data[index];

        if(index<0||index>size){
            throw new  IllegalArgumentException("dd failed, index<0||index>size!");
        }

        for(int i=index+1;i<size;i++){
            data[i-1]=data[i];
        }
        size--;
        data[size]=null;
        if(size==data.length/4&&data.length/2!=0){
            resize(data.length/2);
        }
        return res;
    }


    //删除数组中的第一个元素
    public E removeFirst(int index){
        return remove(0);
    }

    //删除数组中的最后一个元素
    public E removeLast(int index){
        return remove(size-1);
    }

    //删除某个元素
    public void  removeElement(E e){
        int index=find(e);
        if(index!=-1){
            remove(index);
        }
    }

    private void resize(int newCapacity){
        E[] newData= (E[])new Object[newCapacity];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
    }
}
