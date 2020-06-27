package com.example.demo.model;

public class ChartModel {
    private int data_1, data_2, data_3, data_4, data_5;

    public ChartModel(){}

    public void setCount(int count){
        switch (count){
            case 1:
                ++data_1;
                break;
            case 2:
                ++data_2;
                break;
            case 3:
                ++data_3;
                break;
            case 4:
                ++data_4;
                break;
            default:
                ++data_5;
        }
    }

    public int getData_1() {
        return data_1;
    }

    public void setData_1(int data_1) {
        this.data_1 = data_1;
    }

    public int getData_2() {
        return data_2;
    }

    public void setData_2(int data_2) {
        this.data_2 = data_2;
    }

    public int getData_3() {
        return data_3;
    }

    public void setData_3(int data_3) {
        this.data_3 = data_3;
    }

    public int getData_4() {
        return data_4;
    }

    public void setData_4(int data_4) {
        this.data_4 = data_4;
    }

    public int getData_5() {
        return data_5;
    }

    public void setData_5(int data_5) {
        this.data_5 = data_5;
    }

    public String getData(){
        return String.format("[%d, %d, %d, %d, %d]", data_1, data_2, data_3, data_4, data_5);
    }

    @Override
    public String toString() {
        return "ChartModel{" +
                "data_1=" + data_1 +
                ", data_2=" + data_2 +
                ", data_3=" + data_3 +
                ", data_4=" + data_4 +
                ", data_5=" + data_5 +
                '}';
    }
}
