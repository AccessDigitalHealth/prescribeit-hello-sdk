package ca.infoway.prescribeit;

import com.venuiti.prescribeit.core.model.EmrNewRequest;

public class HelloSDK {

	public static void main(String[] args) {
		System.out.println("Hello SDK");
		System.out.println("SDK Bootstrap Test");
		
		EmrNewRequest emrNewRequest = EmrNewRequest.builder().build();
		
		System.out.println("New EMR request: " + emrNewRequest.toString());
	}

}
