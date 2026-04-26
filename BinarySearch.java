public class BinarySearch {

    public static int binSearch (int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int indexMid = low + (high - low) / 2;
            if (arr[indexMid] == target) {
                return indexMid;
            } else if (arr[indexMid] < target) {
                low = indexMid + 1;
            } else {
                high = indexMid - 1;        
            }
            } 
        
        return -1;

    }

}
