package com.clsmagent.pojo.info;

import java.util.ArrayList;
import java.util.List;

public class Grad {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;
    private int subject6;
    private int subject7;
    private int subject8;
    private int subject9;

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public int getSubject4() {
        return subject4;
    }

    public void setSubject4(int subject4) {
        this.subject4 = subject4;
    }

    public int getSubject5() {
        return subject5;
    }

    public void setSubject5(int subject5) {
        this.subject5 = subject5;
    }

    public int getSubject6() {
        return subject6;
    }

    public void setSubject6(int subject6) {
        this.subject6 = subject6;
    }

    public int getSubject7() {
        return subject7;
    }

    public void setSubject7(int subject7) {
        this.subject7 = subject7;
    }

    public int getSubject8() {
        return subject8;
    }

    public void setSubject8(int subject8) {
        this.subject8 = subject8;
    }

    public int getSubject9() {
        return subject9;
    }

    public void setSubject9(int subject9) {
        this.subject9 = subject9;
    }

    public List<Integer> getList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(this.subject1);
        list.add(this.subject2);
        list.add(this.subject3);
        list.add(this.subject4);
        list.add(this.subject5);
        list.add(this.subject6);
        list.add(this.subject7);
        list.add(this.subject8);
        list.add(this.subject9);
        return list;
    }
}
