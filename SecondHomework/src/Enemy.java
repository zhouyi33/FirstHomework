public class Enemy {
    String Name;
    int Damage;
    int Blood;
    //设置敌人属性
    public void setName2(String Name){
        this.Name = Name;
    }
    public void setDamage2(int Damage){
        this.Damage = Damage;
    }
    public void setBlood2(int Blood){
        this.Blood = Blood;
    }
    public void getAll2(){
        //获得敌人的属性
        System.out.println("Name: " + Name);
        System.out.println("Damage: " + Damage);
        System.out.println("Blood: " + Blood);
    }
}
