import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Set your hero");
        //设置英雄属性
        Hero a = new Hero();
        System.out.print("Name: ");
        String Name1 = scan.nextLine();
        System.out.print("Damage: ");
        int Damage1 = scan.nextInt();
        System.out.print("Defense: ");
        int Defense1 = scan.nextInt();
        System.out.print("Blood: ");
        int Blood1 = scan.nextInt();
        a.setName(Name1);
        a.setDamage(Damage1);
        a.setDefense(Defense1);
        a.setBlood(Blood1);
        a.getSkill();
        int y = scan.nextInt();//选择装备，提升属性
        a.improveAttribute(a,y);
        a.getAll();
        Enemy[] b = new Enemy[3];
        System.out.println("Set your enemies");
        //设置敌人属性
        for(int i=0;i<3;i++){
            scan.nextLine();
            System.out.println(i+1);
            System.out.print("Name: ");
            String Name2 = scan.nextLine();
            System.out.print("Damage: ");
            int Damage2 = scan.nextInt();
            System.out.print("Blood: ");
            int Blood2 = scan.nextInt();
            b[i] = new Enemy();
            b[i].setName2(Name2);
            b[i].setDamage2(Damage2);
            b[i].setBlood2(Blood2);
        }
        Battle battle = new Battle();
        System.out.print("设置回合数： ");
        int z = scan.nextInt();
        battle.round(a,b,z);
    }
}