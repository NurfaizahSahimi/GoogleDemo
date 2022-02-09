# GoogleDemo

## Directory 
[About](#about)

[Library & Setup](#library-and-setup)

[Files & Description](#files-and-description)

[Problem Solving](#problem-solving)

## About ##

This is a solution or demo on how to automate this situation using Java and Selenium:

•	Navigate to www.Google.com
•	Search Dassault System
•	Click on the 2nd search result


## Library and Setup ##

In order to create this automation script, I'll be using these software:

Software           | Version                                                | Description
-------------      | -------------                                          | -------------
Java               | `JRE 17`                                               | Programming language used to write test script
Eclipse            | `eclipse IDE for Java Developers - 2021-09`            | Environment to compile and run script
Selenium           | `selenium-server-3.9.1`                                | Framework for testing web application

## Files and Description ##
<details>
           <summary>Dassault Systeme Demo IV.zip</summary>
           <p>This folder contains the project and all the libraries needed.</p>
         </details>
         
<details>
           <summary>Snapshot Folder</summary>
           <p>This snapshot folder contains the snippet of code, snapshot of the webpage after click on the second link, and also a short screen recording when running the script.</p>
         </details>
         
 <details>
           <summary>README.MD</summary>
           <p>This is a readme file to provide details on this demo folder.</p>
         </details>

## Problem Solving ##

To solve this problem, first I find the element needed for the automation script, and easiest way to locate them is by using xpath since we can get to precise location of the element. After that, I send keys to the text search bar in order to mocking a real person using Google to search for information. Next and lastly, I click on the second link based on the xpath of that second element. Additionally, I capture some screenshot to ensure that my script navigate to a correct page. 
