package factoy_method;

public class JavaDeveloperFactory implements DeveloperFactory
{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
