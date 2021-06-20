package in.devstream.cicd.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class InspectTaskApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(InspectTaskApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("Number of Args: " + args.getOptionNames().size());

        args.getOptionNames().forEach(optionName -> {
            log.info(optionName + "=" + args.getOptionValues(optionName));
        });

        new InspectTask(args).run();
    }
}
