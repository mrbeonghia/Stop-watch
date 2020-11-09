import java.time.LocalTime;
public class Watch {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start,end);
        System.out.println("Time: "+stopWatch.getElapsedTime());
    }
}
