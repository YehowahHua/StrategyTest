package com.Yehowah.Celv2_Module;

import com.Yehowah.Celv2_Module.interface_behavior.IAttackBehavior;
import com.Yehowah.Celv2_Module.interface_behavior.IDefendBehavior;
import com.Yehowah.Celv2_Module.interface_behavior.IDisplayBehavior;
import com.Yehowah.Celv2_Module.interface_behavior.IRunBehavior;

/**
 * Created by VULCAN on 2018/6/3.
 */
public abstract class Role {
    public String name;
    private IDefendBehavior defendBehavior;
    private IDisplayBehavior displayBehavior;
    private IRunBehavior runBehavior;
    private IAttackBehavior attackBehavior;

    public Role setDefendBehavior(IDefendBehavior defendBehavior){
        this.defendBehavior = defendBehavior;
        return this;
    }
    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {//用接口作为参数，传参过来具体
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public void display() {
        displayBehavior.display();
    }

    public void run() {
        runBehavior.run();
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void defend() {
        defendBehavior.defend();
    }
}
