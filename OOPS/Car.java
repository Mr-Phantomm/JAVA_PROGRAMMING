public class Car{
    String brand;
    int speed;
    String color;
    Car(String brand,int speed,String color){
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }
    public void accelerate(){
        this.speed+=10;
        System.out.println(Speed());
    }
    public void brake(){
        this.speed-=10;
        System.out.println(Speed());
    }
    public String Speed(){
        return "Current Speed is "+this.speed;
    }
}