public class BlogPost {
    private String authorname;
    private String title;
    private String text;
    private String publicationDate;

    BlogPost(String authorname, String title, String text, String publicationDate) {
        this.authorname = authorname;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public String getAutorname() {
        return authorname;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString(){
        return authorname +", "+ title+", "+text+", "+publicationDate;
    }

}

