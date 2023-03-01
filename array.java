public class array {
    public static void main(String[] args) {

        int [] [] arr = new int[3][5]; //многомерные массивы

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();

        }
    }
}
