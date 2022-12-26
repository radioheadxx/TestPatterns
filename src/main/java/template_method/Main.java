package template_method;

public class Main {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate = new NewsPage();
        WebsiteTemplate websiteTemplate2 = new WelcomePage();
        websiteTemplate2.showPage();
        System.out.println("---------------------------------------------");
        websiteTemplate.showPage();
    }
}
