package fisikes.job;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class JobDefinition {

    private String cronExpression;
}
