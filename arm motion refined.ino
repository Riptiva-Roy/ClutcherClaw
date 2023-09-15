#include <SoftwareSerial.h>
#include <Servo.h>

Servo S1;
Servo S2;
Servo S3;
Servo SG;

SoftwareSerial bluetooth(12, 13);

void zeroset() {
  S1.write(90);
  S2.write(90);
  S3.write(40);
  SG.write(0);
  delay(1000);
}

void setup() {
  S1.attach(9);
  S2.attach(10);
  S3.attach(11);
  SG.attach(6);

  zeroset();
  delay(1000);

  Serial.begin(9600);
  bluetooth.begin(9600);
}

void loop() {
  if (bluetooth.available() >= 2) {
    S1.detach();
    S2.detach();
    S3.detach();
    SG.detach();

    unsigned int bit1 = bluetooth.read();
    unsigned int bit2 = bluetooth.read();
    unsigned int bits = (bit2 * 256) + bit1;
    Serial.println(bits);

    int servo = bits;
    Servo reattach;

    if (bits >= 1000 && bits < 1180) {
      S1.attach(9);
      servo = map(servo, 1000, 1180, 0, 180);
      reattach = S1;
    }

    if (bits >= 2000 && bits < 2180) {
      S2.attach(10);
      servo = map(servo, 2000, 2180, 0, 180);
      reattach = S2;
    }

    if (bits >= 3000 && bits < 3180) {
      S3.attach(11);
      servo = map(servo, 3000, 3180, 0, 180);
      reattach = S3;
    }

    if (bits >= 4000 && bits < 4180) {
      SG.attach(6);
      servo = map(servo, 4000, 4180, 0, 180);
      reattach = SG;
    }

    reattach.write(servo);
  }

  if (bluetooth.available() > 0) {
    char command = bluetooth.read();

    switch (command) {
      case 'F':
        moveArmForward();
        break;

      case 'B':
        moveArmBackward();
        break;

      case 'L':
        rotateArmLeft();
        break;

      case 'R':
        rotateArmRight();
        break;

      case 'G':
        toggleGripper();
        break;

      case 'C':
        calibrateArm();
        break;

      case 'Z':
        zeroset();
        break;

      // Add more commands as needed

      default:
        // Handle unknown commands or do nothing
        break;
    }
  }
}

void moveArmForward() {
  // Code to move the arm forward (e.g., lift arm)
  // Replace with actual servo movements
  // Example: S1.write(XXX); S2.write(XXX); S3.write(XXX); SG.write(XXX);
}

void moveArmBackward() {
  // Code to move the arm backward (e.g., lower arm)
  // Replace with actual servo movements
}

void rotateArmLeft() {
  // Code to move the arm left (e.g., rotate arm left)
  // Replace with actual servo movements
}

void rotateArmRight() {
  // Code to move the arm right (e.g., rotate arm right)
  // Replace with actual servo movements
}

bool gripperClosed = false;

void toggleGripper() {
  if (gripperClosed) {
    // Code to open the gripper
    // Replace with actual servo movements to open gripper
    gripperClosed = false;
  } else {
    // Code to close the gripper
    // Replace with actual servo movements to close gripper
    gripperClosed = true;
  }
}

void calibrateArm() {
  // Code to calibrate the arm to a predefined starting position
  // Customize this position to match your robot's initial state
  S1.write(90);
  S2.write(90);
  S3.write(40);
  SG.write(0);
  delay(1000);
}
