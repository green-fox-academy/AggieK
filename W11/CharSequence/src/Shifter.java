public class Shifter implements CharSequence {

    private int shift;
    private String charsequnce;

    public Shifter(String charsequnce, int shift){
        this.charsequnce = charsequnce;
        this.shift = shift;
    }


    @Override
    public int length() {
        return charsequnce.length();
    }

    @Override
    public char charAt(int index) {
        int z = 0;
        try {
            z = index + shift;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return charsequnce.charAt(z);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return charsequnce.subSequence(start,end);
    }
}
