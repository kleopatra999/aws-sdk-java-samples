import com.amazonaws.services.sqs.*;
import com.amazonaws.services.sqs.model.*;

public class AmazonSQSGeneratedSamples {
    public void CreateQueue_1() {
        //BEGIN_SAMPLE:AmazonSQS.CreateQueue
        //TITLE:Create an SQS queue
        //DESCRIPTION:The following operation creates an SQS queue named MyQueue.
        AmazonSQS client = new AmazonSQSClient();
        CreateQueueRequest request = new CreateQueueRequest()
                .withQueueName("MyQueue");
        CreateQueueResult response = client.createQueue(request);
        //END_SAMPLE
    }

    public void GetQueueUrl_1() {
        //BEGIN_SAMPLE:AmazonSQS.GetQueueUrl
        //TITLE:Retrieve queue attributes from an SQS queue
        //DESCRIPTION:The following example retrieves the queue ARN.
        AmazonSQS client = new AmazonSQSClient();
        GetQueueUrlRequest request = new GetQueueUrlRequest().withQueueName(
                "MyQueue").withQueueOwnerAWSAccountId("12345678910");
        GetQueueUrlResult response = client.getQueueUrl(request);
        //END_SAMPLE
    }
}
