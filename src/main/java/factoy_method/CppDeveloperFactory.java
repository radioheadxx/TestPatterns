package factoy_method;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
