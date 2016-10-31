import io.dropwizard.setup.Environment;
import resource.BillingResource;

/**
 * Created by sallu on 10/30/2016.
 */
public class Application extends io.dropwizard.Application<ApplicationConfiguration> {

    public static void main(String args[]) throws Exception {
        new Application().run(args);

    }

    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        configureResources(environment);
    }

    private void configureResources(Environment environment){
        environment.jersey().register(BillingResource.class);

    }
}
