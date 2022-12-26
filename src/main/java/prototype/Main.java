package prototype;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(1, "project_1", "some code......");
        Project project2 = (Project) project.copy();
        System.out.println(project + " " + project.hashCode());
        System.out.println(project2+ " " + project2.hashCode());
    }

}
