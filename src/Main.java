public class Main {
    public static void main(String[] args) {
        int[] box = {1, 2, 3};

        double[] pack = {1.57, 7.654, 9.986};

        int[] rand = new int[]{3, 5, 3, 2, 0};
        System.out.println("Task 2");
        for (int g = 0; g < box.length; g++) {
            System.out.print(box[g]);
            if (g < box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int v = 0; v < pack.length; v++) {
            System.out.print(pack[v]);
            if (v < pack.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int h = 0; h < rand.length; h++) {
            System.out.print(rand[h]);
            if (h < rand.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 3");
        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = pack.length - 1; k >= 0; k--) {
            System.out.print(pack[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int l = rand.length - 1; l >= 0; l--) {
            System.out.print(rand[l]);
            if (l > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        for (int m = 0; m < box.length; m++) {
            if (box[m] % 2 != 0) {
                box[m] += 1;
                System.out.print(box[m]);
            } else {
                System.out.print(box[m]);
            }
            if (m < box.length - 1) {
                System.out.print(", ");
            }
        }
    }
}