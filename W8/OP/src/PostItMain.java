public class PostItMain {

    public static void main(String[] args) {
    PostIt myPostIt01 = new PostIt("orange","idea1", "blue");
    PostIt myPostIt02 = new PostIt("pink","Awesome", "black");
    PostIt myPostIt03 = new PostIt("yellow","Superb!", "green");

    //System.out.println(myPostIt01.getBackgroundColor()+ ", " + myPostIt01.getText()+ ", "+myPostIt01.getTextColor());
    //System.out.println(myPostIt02.getBackgroundColor()+ ", " + myPostIt02.getText()+ ", "+myPostIt02.getTextColor());
    //System.out.println(myPostIt03.getBackgroundColor()+ ", " + myPostIt03.getText()+ ", "+myPostIt03.getTextColor());

     System.out.println(myPostIt01);
     System.out.println(myPostIt02);
     System.out.println(myPostIt03);
    }
}

