package sg.edu.nus.iss.pmprs.core.amazon.mq;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.google.gson.Gson;



public class QueueMessageSender {
	
	private String queueId;
	private boolean newQueue;
	public void send(Object obj)
	{
		
		//JsonWriter jw=new JsonWriter(new Writer());
		
		Gson gson = new Gson();
		 
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);
		try {
			System.out.println(json);
			connect(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 private void connect(String args) throws Exception {
	        /*
	         * This credentials provider implementation loads your AWS credentials
	         * from a properties file at the root of your classpath.
	         *
	         * Important: Be sure to fill in your AWS access credentials in the
	         *            AwsCredentials.properties file before you try to run this
	         *            sample.
	         * http://aws.amazon.com/security-credentials
	         */
	        AmazonSQS sqs = new AmazonSQSClient(new ClasspathPropertiesFileCredentialsProvider());
			Region usWest2 = Region.getRegion(Regions.AP_SOUTHEAST_1);
			sqs.setRegion(usWest2);
	  
	  
	        System.out.println("===========================================");
	        System.out.println("Getting Started with Amazon SQS");
	        System.out.println("===========================================\n");

	        try {
	            // Create a queue
//	            System.out.println("Creating a new SQS queue called MyQueue.\n");
//	            CreateQueueRequest createQueueRequest = new CreateQueueRequest(getQueueId().toUpperCase());
//	      
//	            String ww = sqs.createQueue(createQueueRequest).getQueueUrl();
	            
	            // List queues
	           // System.out.println("Listing all queues in your account.\n");
	            for (String queueUrl : sqs.listQueues().getQueueUrls()) {
	               System.out.println("  QueueUrl: " + queueUrl);
	            }
	           // System.out.println();

	            // Send a message
	        	String ww="https://sqs.us-west-2.amazonaws.com/233752213365/CARPARK_QUEUE";
	            System.out.println("Sending a message to MyQueue.\n");
	            SendMessageRequest sr=new SendMessageRequest();
	           sr.setMessageBody(args);
	            sr.setQueueUrl(ww);
	           
	          sqs.sendMessage(sr);
	            
	           
	        } catch (AmazonServiceException ase) {
	            System.out.println("Caught an AmazonServiceException, which means your request made it " +
	                    "to Amazon SQS, but was rejected with an error response for some reason.");
	            System.out.println("Error Message:    " + ase.getMessage());
	            System.out.println("HTTP Status Code: " + ase.getStatusCode());
	            System.out.println("AWS Error Code:   " + ase.getErrorCode());
	            System.out.println("Error Type:       " + ase.getErrorType());
	            System.out.println("Request ID:       " + ase.getRequestId());
	        } catch (AmazonClientException ace) {
	            System.out.println("Caught an AmazonClientException, which means the client encountered " +
	                    "a serious internal problem while trying to communicate with SQS, such as not " +
	                    "being able to access the network.");
	            System.out.println("Error Message: " + ace.getMessage());
	        }
	    }
	public String getQueueId() {
		return queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
	public boolean isNewQueue() {
		return newQueue;
	}
	public void setNewQueue(boolean newQueue) {
		this.newQueue = newQueue;
	}
	 

}
