package be.botteman.aws.stepfunctions;


import com.amazonaws.services.stepfunctions.AWSStepFunctions;
import com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder;
import com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest;
import com.amazonaws.services.stepfunctions.model.ListStateMachinesResult;
import com.amazonaws.services.stepfunctions.model.StateMachineListItem;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StepFunctionTest {

    @Test
    public void testCheckStateMachinesAreAvailable() {
        AWSStepFunctions client = AWSStepFunctionsClientBuilder.defaultClient();
        ListStateMachinesRequest request = new ListStateMachinesRequest();
        ListStateMachinesResult listStateMachinesResult = client.listStateMachines(request);
        List<StateMachineListItem> stateMachines = listStateMachinesResult.getStateMachines();
        assertThat(stateMachines).isNotEmpty();
    }
}
