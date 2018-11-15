public class SubStrList {
    public static void main(String[] args) {
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
        System.out.println(subStrList("what", searchArr));
        //  should print: `2`


    }
    public static int subStrList(String x, String[] searchArr) {
        for (int i = 0; i < searchArr.length; i++) {
            if (searchArr[i].indexOf(x) >= 0) {
                return i;
            }
        }
        return -1;
    }
}
