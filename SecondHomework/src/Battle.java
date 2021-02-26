import java.util.Random;

public class Battle {
    public void round(Hero x,Enemy[] y,int z){
        int rd = 0;
        Random random = new Random();
        for(int i=1;i<=z;i++){
            System.out.println("Round " + i);
            int j = random.nextInt(3);
            if (y[j].Blood <= 0) {//随机选择一个敌人，当敌人已经死亡就继续选择，直到选择有血的敌人
                do {
                    j = random.nextInt(3);
                } while (y[j].Blood <= 0);
            }
            int a = x.Damage;
            int b = x.Defense - y[j].Damage;
            if(b>0) b = -1;
            //英雄先对敌人造成伤害
            y[j].Blood = y[j].Blood - a;
            System.out.println(x.Name + "对" + y[j].Name + "造成伤害" + a);
            System.out.println(y[j].Name + "剩余血量" + y[j].Blood);
            //判定胜利条件
            if(y[0].Blood <= 0 && y[1].Blood <= 0 && y[2].Blood <= 0){
                System.out.println("--------------------------");
                System.out.println("Victory");
                System.out.println("掉落屠龙宝刀一刀999");
                System.out.println("攻击力+999");
                x.Damage = x.Damage + 999;
                x.getAll();
                break;
            }
            //敌人反击
            x.Blood = x.Blood + b;
            //判定英雄是否死亡
            if(x.Blood <= 0){
                //英雄能力
                if(rd == 0) {
                    System.out.println("觉醒血脉");
                    x.Damage = x.Damage + 100;
                    System.out.println("五回合内不死之身 同时攻击力+100");
                }
                rd ++;
            }
            System.out.println(y[j].Name+ "对" + x.Name + "造成伤害" + -b);
            System.out.println(x.Name + "剩余血量" + x.Blood);
            if (rd >= 5){
                System.out.println("Defeat");
                break;
            }
            //判断敌人是否死亡
            if (y[j].Blood <= 0) System.out.println(y[j].Name + " died");
            System.out.println("--------------------------");
        }
    }
}
