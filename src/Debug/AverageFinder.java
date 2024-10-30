package Debug;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v1:");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
        double addSum = 4.5;
        double add = avg + addSum;
        System.out.println("The add is: " + add);

    }
    private static double findAverage(String[] input){
        double result = 0;
        for(String s : input){
            result += Integer.parseInt(s);

        }
        return result/input.length;
    }
}
