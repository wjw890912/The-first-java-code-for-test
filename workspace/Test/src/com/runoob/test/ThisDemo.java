package com.runoob.test;

public class ThisDemo {  
    String name="Mick";
    public void print(String name){
        System.out.println("���е����� name="+this.name);
        System.out.println("�ֲ����ε�����="+name);
    }   
    public static void main(String[] args) {
        ThisDemo tt=new ThisDemo();
        tt.print("Orson");
    }
}
