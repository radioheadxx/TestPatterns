package iterator;

public class JavaDev implements Collection{
    String name;
    String [] skills;

    public JavaDev(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillsIterator();
    }

    private class SkillsIterator implements Iterator{
        int index=0;

        @Override
        public boolean hasNext() {
            if(skills.length>index) {
                return true;
            }
            return false;
        }

        @Override
        public Object nex() {
            return skills[index++];
        }
    }
}
