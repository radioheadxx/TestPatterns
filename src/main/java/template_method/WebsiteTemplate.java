package template_method;

public abstract class WebsiteTemplate {
    void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public abstract  void showPageContent();
}
