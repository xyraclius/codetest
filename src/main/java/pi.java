public class pi {
    public static void main(String[] args) {
        int[] array = {1, 4, -1, 3, 2};
        int result = solution(array);
        System.out.println(result);
    }

    private static int solution(int A, int B) {
        String a = String.valueOf(A);
        String b = String.valueOf(B);
        if (b.contains(a))
            return 2;
        else
            return -1;
    }

    private static int solution(int[] A) {
        int[] anotherArray = new int[A.length - 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) {
                anotherArray[i++] = A[i];
            }
        }
        return anotherArray.length;
    }
}