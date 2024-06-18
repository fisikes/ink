package fisikes;

import com.google.common.collect.Lists;
import fisikes.job.JobDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskRunner implements Runnable {

    // job Definition

    final List<JobDefinition> jobDefinitions = Lists.newArrayList(
            new JobDefinition("a1"),
            new JobDefinition("a2")
    );

    @Override
    public void run() {
        while (true) {

            for (JobDefinition jobDefinition : jobDefinitions) {
                System.out.println(jobDefinition);
            }

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
