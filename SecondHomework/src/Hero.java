public class Hero{
    String Name;
    int Damage;
    int Defense;
    int Blood;
    //设置英雄属性
    public void setName(String Name){
        this.Name = Name;
    }
    public void setDamage(int Damage){
        this.Damage = Damage;
    }
    public void setDefense(int Defense){
        this.Defense = Defense;
    }
    public void setBlood(int Blood){
        this.Blood = Blood;
    }
    public void getAll(){
        //获得英雄的属性
        System.out.println("Name: " + Name);
        System.out.println("Damage: " + Damage);
        System.out.println("Defense: " + Defense);
        System.out.println("Blood: " + Blood);
    }
    public void getSkill(){
        System.out.println("选择你的装备");
        System.out.println("1.狂徒铠甲 血量+1000  " + "2.三项之力  攻击力+200  " + "3.亡者的板甲  防御+200");
    }
    public void improveAttribute(Hero x,int y){//选择装备，提升属性
        switch (y){
            case (1): x.Blood += 1000; break;
            case (2): x.Damage += 200; break;
            case (3): x.Defense += 200; break;
            default: System.out.println("不选择装备"); break;
        }
    }
}
