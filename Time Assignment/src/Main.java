public class Main {
    public static void main(String[] args){
        Time time = new Time(5,59,59);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time);
        System.out.println("New time");
        time.setTime(6, 59,59);
        System.out.println(time.nextSecond());
        System.out.println("Increase One Second");
        System.out.println(time.previousSecond());
        System.out.println("Decrease One Second");
        System.out.println(time);
    }
}
