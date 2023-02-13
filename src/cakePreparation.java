import java.util.function.Function;

public class cakePreparation {


    public int binarySearch(int n, Function<Integer, Boolean> isTooSweet) { // a function is declared here, with binary sign of less or greater than
        int low = 0;
        int high = n;

        while (low < high) {//while loop used to determine the result of 2(low sugar or high sugar)
            int mid = low + (high - low) / 2; // to get the correct numberOfSpoons

            if (isTooSweet.apply(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

    }

}
