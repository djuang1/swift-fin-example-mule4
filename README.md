# Convert SWIFT MT (ISO 15022) to JSON using MuleSoft

## Overview
This is an example Mule 4.x application showing how to convert a SWIFT MT message to JSON. It leverages the open source [Prowide Core](https://dev.prowidesoftware.com/latest/open-source/core/) library to handle the transformation in the Java component

## Setup
1. Download and import project into Anypoint Studio
2. Open the `mule-properties.yaml` file in `src/main/resources`
3. Modify the `file.resources` property to reflect your Workspace project directory

## Run
Once you complete the setup, run the project. The flow will run every minute and pick up the file from the `src/main/resources/in` folder. Once it completes processing the file, it will move it to `src/main/resources/processed`. A JSON file will be generated and placed into the `src/main/resources/out` folder.

 
