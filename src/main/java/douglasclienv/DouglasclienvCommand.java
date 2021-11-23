package douglasclienv;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.List;

@Command(name = "douglasclienv", description = "...",
        mixinStandardHelpOptions = true)
public class DouglasclienvCommand implements Runnable {

    @Inject
    List<SomeResolver> resolvers;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DouglasclienvCommand.class, args);
    }

    public void run() {
        System.out.println("Resolvers:");
        resolvers.stream().forEach(someResolver -> System.out.println("\t"+someResolver.getDescription()));
    }
}
