import java.util.Scanner;

class Animal{
    String name ;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("name:"+name+"\theight="+height+"\tweight="+weight+"\tspeed="+speed);
    }

    double distance(int x, double y){
        double distance = x*y*speed;
        return distance;
    }

    int distance(int x){
        int distance = x*speed;
        return distance;
    }
}

public class A1093349_0324_1 {
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();

        a1.name = "雪寶";
        a1.height = 1.1;
        a1.weight = 52;
        a1.speed = 100;

        a2.name = "驢子";
        a2.height = 1.5;
        a2.weight = 99;
        a2.speed = 200;

        a3.name = "安那";
        a3.height = 1.7;
        a3.weight = 48;
        a3.speed = 120;

        a4.name = "愛沙";
        a4.height = 1.7;
        a4.weight = 50;
        a4.speed = 120;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input an x:");
        int x = input.nextInt();
        System.out.print("Please input an y(not necessary):");
        double y = input.nextDouble();

        a1.show();
        a2.show();
        a3.show();
        a4.show();

        System.out.println(a1.name+"跑了"+a1.distance(x, y));
        System.out.println(a2.name+"跑了"+a2.distance(x, y));
        System.out.println(a3.name+"跑了"+a3.distance(x, y));
        System.out.println(a4.name+"跑了"+a4.distance(x, y));
    }
}
