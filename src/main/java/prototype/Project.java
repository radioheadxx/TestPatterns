package prototype;

public class Project implements Copyable{
    private int id;
    private String name;
    private String codeSource;

    public Project(int id, String name, String codeSource) {
        this.id = id;
        this.name = name;
        this.codeSource = codeSource;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCodeSource(String codeSource) {
        this.codeSource = codeSource;
    }

    @Override
    public Object copy() {
        Project project = new Project(id, name, codeSource);
        return project;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", codeSource='" + codeSource + '\'' +
                '}';
    }
}
