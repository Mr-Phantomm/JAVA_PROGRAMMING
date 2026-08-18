public class Test {
    public static void main(String[] args) {
        CustomHashMap<Integer,Integer> map = new CustomHashMap<>();
        map.put(2,1);
        map.put(1,2);
        System.out.println(map.get(2));
        System.out.println(map.get(1));
    }
}
