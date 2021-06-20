package in.devstream.cicd.task;

import in.devstream.cicd.task.core.PipelineTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;

@Slf4j
public class InspectTask extends PipelineTask {

    private ApplicationArguments input;

    public InspectTask(ApplicationArguments args) {
        this.input = args;
    }

    @Override
    public void execute() {

        log.info("executing the inspect task");
    }

    @Override
    public void onInit() {
        log.info("overriding on init!");
    }

    @Override
    public void onFinalize() {
        log.info("overriding on finalize");
    }
}
