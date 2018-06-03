package com.Yehowah;

import com.Yehowah.Celv2_Module.*;
import com.Yehowah.Celv2_Module.interface_behavior.Bean_A.AttackJY;
import com.Yehowah.Celv2_Module.interface_behavior.Bean_A.DefendTBS;
import com.Yehowah.Celv2_Module.interface_behavior.Bean_A.DisplayA;
import com.Yehowah.Celv2_Module.interface_behavior.Bean_A.RunJCCQ;
import com.Yehowah.Celv2_Module.interface_behavior.Bean_B.DisplayB;

//参考https://blog.csdn.net/lmj623565791/article/details/24116745
public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Role roleA  = new RoleA("A");
        roleA.setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new DisplayA())
                .setRunBehavior(new RunJCCQ());


        System.out.println(roleA.name + ":");

        roleA.run();
        roleA.attack();
        roleA.display();
        roleA.attack();

        Role roleB  = new RoleB("B");
        roleB.setDisplayBehavior(new DisplayB())//因为B的方法不一样，所以要重写
                .setRunBehavior(new RunJCCQ());//因为A和B都是相同的run,所以这里只需要重复调用下，而不是重写
        System.out.println(roleB.name + ":");
        roleB.display();
        roleB.run();
    }
}
