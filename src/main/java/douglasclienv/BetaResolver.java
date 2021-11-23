package douglasclienv;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Singleton
@Requires(env="beta")
public class BetaResolver implements SomeResolver {
    @Override
    public String getDescription() {
        return "Beta Resolver";
    }
}
