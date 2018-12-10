public class Gnirts implements CharSequence {

    private String text;

    public Gnirts(String text) {
        this.text = text;
    }


    @Override
    public int length() {
        char[] chars = text.toCharArray();
        return chars.length;
    }

    @Override
    public char charAt(int index) {
        char[] chars = text.toCharArray();
        return chars[chars.length - 1 - index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] chars = text.toCharArray();
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += chars[chars.length - 1 - i];
        }
        return subString;
    }
}
