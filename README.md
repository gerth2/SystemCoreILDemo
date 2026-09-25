# System Core Demos 

This repository contains source code for the basic demos of an alpha-release System Core at the fall 2026 Illinois Mentor Town Hall Meetings

# Running the Demos

## Prerequisites

Requires a driver station PC (laptop) with the latest [FIRST Driver Station](https://github.com/wpilibsuite/FirstDriverStation-Public/releases/tag/v2027.0.0-alpha-8) installed.

Print out Apriltag ID's 1 and 2 from [the 2026 PDF](https://firstfrc.blob.core.windows.net/frc2026/FieldAssets/2026-apriltag-images-user-guide.pdf). Secure the papers to a flat, rigid surface (like a clipboard).

Plug in a USB camera to the 3rd (outermost) USB3 port.

## Setup

Power on the SystemCore, and wait for it to boot up. 

Connect to the SystemCore's wifi network.

Launch the FIRST Driver station.

 Open a web browser and navigate to [systemcore.local](http://systemcore.local).

 Select `Elastic` on the hompeage to open the dashboard application.

 ## Running

 Several basic demonstrations are available via different Autonomous `OpModes`.

Select the desired `OpMode` in the driver station, and enable. Functionality will not work unless the robot is enabled.

 ### `Blink`

This mode simply blinks an indicator in the `Elastic` dashboard. It will blink when enabled, and remain steady when not.

 ### `YawDetector`

 This mode uses the onboard IMU to detect when the SystemCore has been rotated more than ~30 deg left or right.

 Please the SystemCore flat on a table, and enable the op mode. Rotate it by hand left and right - after 30 degrees of rotation from the starting point, an indicator should light up on the dashboard.

 The dashboard also has a readout of the measured angle (in radians) - you can see the response speed and smoothness.

 ### `AprilTagDetector`

 This mode uses the onboard Limelight camera processing logic to detect the presesnce of apriltags.

 Only tags 1 and 2 are recognized. Only one is detected at a time.

 A dashboard indicator should light up when the corresponding apriltag is seen.
