import java.util.Scanner;

class Animal {
    String name;
    double height;
    int weight;
    int speed;

    public Animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
    }

    public double distance(double x, double y) {
        if (y == 0) {
            return x * speed;
        } else {
            return x * y * speed;
        }
    }

    public double distance(double x) {
        return distance(x, 0);
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal {
    String gender;

    public Human(String name, double height, int weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Gender: " + gender);
    }
}

class Snow extends Human {
    String freezeSkill;

    public Snow(String name, double height, int weight, int speed, String gender, String freezeSkill) {
        super(name, height, weight, speed, gender);
        this.freezeSkill = freezeSkill;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Freeze skill: " + freezeSkill);
    }

    public double distance(double x, double y, boolean hasFreezeSkill) {
        double distance = super.distance(x, y);
        if (hasFreezeSkill) {
            distance *= 2;
        }
        return distance;
    }
}

public class A1093349_0331{
    public static void main(String[] args) {
        Animal.showinfo();
        Scanner scanner = new Scanner(System.in);

        Animal a1 = new Animal("雪寶", 1.1, 52, 100);
        a1.show();
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        double y = scanner.nextDouble();
        double distance = a1.distance(x);
        System.out.println("Distance traveled: " + distance);

        Animal a2 = new Animal("驢子", 1.5, 99, 200);
        a2.show();
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        y = scanner.nextDouble();
        distance = a2.distance(x);
        System.out.println("Distance traveled: " + distance);

        Human a3 = new Human("阿克", 1.9, 80, 150, "Male");
        a3.show();
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        y = scanner.nextDouble();
        distance = a3.distance(x, y);
        System.out.println("Distance traveled: " + distance);

        Human a4 = new Human("漢斯", 1.8, 78, 130, "Male");
        a4.show();
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        y = scanner.nextDouble();
        distance = a4.distance(x, y);
        System.out.println("Distance traveled: " + distance);

        Human a5 = new Human("安那", 1.7, 48, 120, "Female");
        a5.show();
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        y = scanner.nextDouble();
        distance = a5.distance(x, y);
        System.out.println("Distance traveled: " + distance);

        Snow a6 = new Snow("愛沙", 1.7, 50, 120, "Female", "Yes");
        a6.show();
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y (0 if not applicable): ");
        y = scanner.nextDouble();
        distance = a6.distance(x, y, true);
        System.out.println("Distance traveled: " + distance);
    
    }    
}