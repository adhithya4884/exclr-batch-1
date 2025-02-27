class LeaderFinder {
    public void findLeaders(int[] array) {
        int maxFromRight = array[array.length - 1];
        System.out.print(maxFromRight + " "); // The rightmost element is always a leader

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

public class Demo081 {
    public static void main(String[] args) {
        LeaderFinder finder = new LeaderFinder();
        int[] array = {16, 17, 4, 3, 5, 2};

        System.out.println("Leader elements in the array:");
        finder.findLeaders(array);
    }
}
