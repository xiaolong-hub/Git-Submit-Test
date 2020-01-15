public class Client {
    public static void main(String[] args) {
        MyElement obj1,obj2,obj3, obj4;
        Plant plant1,plant2,plant3;

        obj1=new Apple();
        obj2=new Apple();
        obj3=new Pear();
        obj4 = new Pear();

        plant1=new Plant();
        plant2=new Plant();
        plant3=new Plant();

        plant1.add(obj1);
        plant1.add(obj2);

        plant2.add(obj3);
        plant2.add(obj4);


        plant3.list.add(plant1);
        plant3.list.add(plant2) ;
        plant3.eat();
    }

}
