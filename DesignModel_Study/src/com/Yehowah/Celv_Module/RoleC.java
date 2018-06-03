package com.Yehowah.Celv_Module;

/**
 * Created by VULCAN on 2018/6/3.
 */
public class RoleC extends Role{
    public RoleC(String name){
        this.name = name;
    }
    @Override
    protected void display() {
        System.out.println("苗条淑女");//从RoleA中copy
    }

    @Override
    protected void run() {
        System.out.println("烟雾弹");
    }

    @Override
    protected void attack() {
        System.out.println("降龙十八掌");
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫");//从RoleB中copy
    }
}
