package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Interview {
	@BeforeClass
	public void MakeResume() {
		System.out.println("Make Resume");
	}

	@BeforeMethod
	public void Searchjobs() {
		System.out.println("Search jobs");
	}

	@Test(priority = 1)
	public void ApplyOnline() {
		System.out.println("Apply Online");
		Assert.fail();
	}

	@Test(priority = 2, dependsOnMethods = "ApplyOnline")
	public void InterviewCall() {
		System.out.println("Interview Call");
	}

	@Test(priority = 3, dependsOnMethods = "InterviewCall")
	public void GetreadyforInterview() {
		System.out.println("Get ready for interview");
	}

	@Test(priority = 4, dependsOnMethods = "GetreadyforInterview")
	public void InterviewTime() {
		System.out.println("Interview Time");
	}

	@AfterMethod
	public void InterviewDone() {
		System.out.println("Interview Done");
	}

	@AfterClass
	public void WorkAccordinglyInterviewDecision() {
		System.out.println("Do accordingly Interview Decision");
	}
}
