package OO.basics;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("ornage", "Ötler1", "blue");
        PostIt postIt2 = new PostIt("red", "Király", "black");
        PostIt postIt3 = new PostIt("yellow", "Megcsinálni a házit", "green");

        BlogPost blogPost1 = new BlogPost("Gipsz Jakab", "Lorem ipsum", "Lorem ipsum dolor sit amet", "2000.05.04,");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10");
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28");

    }

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
}
