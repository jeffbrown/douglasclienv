package douglasclienv;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Singleton
@Requires(env="alpha")
public class AlphaResolver implements SomeResolver {
    @Override
    public String getDescription() {
        return "Alpha Resolver";
    }
}
