package com.example.admin.gymbro;

public class WorkoutItem {
    String name;
    int resId;
    public WorkoutItem(String name,int resId){
        this.name = name;
        this.resId = resId;


    }
    public int getResId(){
        return resId;
    }
    public void setResId(int resId){
        this.resId = resId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name){
        this.name = name;

        }

}
