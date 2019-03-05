public class binarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(5, nums, 0, nums.length));
        System.out.println(search2(5, nums));
    }

    //    递归版本
    public static int search(int key, int[] nums, int low, int high) {

        int mid = (low + high) / 2;

        if (nums[mid] == key) {
            System.out.println(nums[mid] == key);
            return mid;
        } else if (nums[mid] < key) {
            low = mid + 1;
            return search(key, nums, low, high);
        } else if (nums[mid] > key) {
            high = mid - 1;
            return search(key, nums, low, high);
        }
        return -1;
    }

    //    非递归版本
    public static int search2(int key, int[] nums) {
        int low = 0;
        int high = nums.length;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == key) {
                System.out.println(nums[mid] == key);
                return mid;
            } else if (nums[mid] < key) {
                low = mid + 1;
            } else if (nums[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
