public class eight{
    public static void main(String args[]){
        bank arun = new bank("arun",12345);
        System.out.println(arun.getname());
        Reservebankofindia arun2=new Reservebankofindia();
        arun2.close();
    }
}
class bank{
    public String name;
    private int pass;
    public bank(String name,int pass){
        this.name=name;
        this.pass=pass;
    }
    public bank(){}
    public int getname(){
        return pass;
    }
}
class Reservebankofindia extends bank{
    public void close(){
        System.out.println("close");
    }
}