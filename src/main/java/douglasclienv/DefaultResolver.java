package douglasclienv;

import jakarta.inject.Singleton;

@Singleton
public class DefaultResolver implements SomeResolver {
    @Override
    public String getDescription() {
        return "Default Resolver";
    }
}
