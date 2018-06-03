package com.Yehowah.Celv_Module;

/**
 * RoleA实现接口
 */
public class RoleA extends Role {
    public RoleA(String name){
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("苗条淑女");
    }

    @Override
    protected void run() {
        System.out.println("金蝉出窍");
    }

    @Override
    protected void attack() {
        System.out.println("九阳神功");
    }

    @Override
    protected void defend() {
        System.out.println("铁头功");
    }
}
