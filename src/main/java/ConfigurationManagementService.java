import org.cfg4j.provider.ConfigurationProvider;
import org.cfg4j.provider.ConfigurationProviderBuilder;
import org.cfg4j.source.ConfigurationSource;
import org.cfg4j.source.context.environment.ImmutableEnvironment;
import org.cfg4j.source.context.filesprovider.ConfigFilesProvider;
import org.cfg4j.source.git.GitConfigurationSourceBuilder;
import org.cfg4j.source.reload.strategy.PeriodicalReloadStrategy;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class ConfigurationManagementService {

    private final String environment = "dev";
    private final String repositoryPath = "gitPath";

    private ConfigFilesProvider defaultConfigProvider() {
        return () -> Paths.get("application.properties");
    }

    public ConfigurationSource configurationSource() {
        return new GitConfigurationSourceBuilder()
                .withRepositoryURI(repositoryPath)
                .withConfigFilesProvider(defaultConfigProvider())
                .build();
    }

    public ConfigurationProvider configurationProvider() {
        return new ConfigurationProviderBuilder()
                .withConfigurationSource(configurationSource())
                .withEnvironment(new ImmutableEnvironment(environment))
                .withReloadStrategy(new PeriodicalReloadStrategy(5, TimeUnit.MINUTES))
                .build();
    }
}
