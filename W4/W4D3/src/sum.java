public class sum {
    public static void main(String[] args) {
       int z= 3;
       int sum = sumOfTheNumbers (z);
        System.out.println(sum);
    }

    public static int sumOfTheNumbers (int z){
        int sum =(((z+1)/2)*z);
        return sum;
    }
}
