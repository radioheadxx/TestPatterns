package iterator;

public class Main {
    public static void main(String[] args) {
        String [] skills = {"Java", "Spring", "Hibernate"};
        JavaDev javaDev = new JavaDev("rayana", skills);
        Iterator iterator = javaDev.getIterator();
        System.out.println(javaDev.name);
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.nex().toString() + " ");
        }
    }
}
