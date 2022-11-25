import java.util.Random;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        
        Stream<Integer> rand = Stream.generate(()->(new Random()).nextInt(81));
        System.out.println("The numbers you should play in the next Kino game is ");
        rand.limit(5).forEach(System.out::println);
    }
}