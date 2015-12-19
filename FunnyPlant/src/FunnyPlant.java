/**
 * Created by alkarin on 11/25/15.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunnyPlant {
    public static void main(String[] args) {
        System.out.println("Enter how many people need to be fed and how many starting fruits");
        String[] input = new Scanner(System.in).nextLine().split(" ");
        Integer people = Integer.valueOf(input[0]);
        Integer production = Integer.valueOf(input[1]);

        List<Plant> plants = IntStream.rangeClosed(1, production).mapToObj(value -> new Plant()).collect(Collectors.toList());

        while(production < people){
            plants.forEach(Plant::addWeek);
            production = plants.stream().mapToInt(Plant::getFruits).sum();
            IntStream.rangeClosed(1, production).forEach(v -> plants.add(new Plant()));
        }
        System.out.println(plants.stream().mapToInt(Plant::getWeek).max().getAsInt());
    }
}
class Plant{
    private Integer week;
    Plant(){
        week = 1;
    }
    public void addWeek(){
        week++;
    }
    public Integer getWeek(){
        return week;
    }
    public Integer getFruits(){
        return week - 1;
    }
}
