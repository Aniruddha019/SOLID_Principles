package dependencyInversion.refactored;

import lombok.Getter;

@Getter
public class NotARobotAuthorizer extends Authorizer {

	private boolean isAuthorized = false;

	public void areYouARobot(String name) {
		System.out.println("Are you a robot? " + name + " Naaah...");
		if (!name.equals("R2-D2")) {
			isAuthorized = true;
		}
	}
}
