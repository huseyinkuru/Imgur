# Imgur
This is a Maven Project done with Java/Selenium. TDD framework is used.
The project has the following parts.

1.setting.properties file kept the following settings to make the project more dynamic. 

url=https://imgur.com
username=casestudy01
password=Tempus01
chromepath=/Applications/chromedriver
firefoxpath =/Applications/geckodriver
imagepath=/Users/huseyinkuru/Documents/Tempus/Pictuåre/apple.jpg
posttitle=case study apple 01

2.Utils.java 
This class is used to read settings from settings.properties. It also used to open close browser. 

3.ImgurLocatios.class
This is used to find WebElements.

4.ImgurActions.class
This is used for actions such as clicking, sending keys etc

5.NewPostTest.java
In this class there are two test cases. Posting an image on ChromeBook and Firefox

6.RandomModeTest.java

In this class there are two test cases which tests random mode on ChromeBook and Firefox

7.SearchTet.java

In this there two test cases which tests Search function on ChromeBook and Firefox. It search the title of the firs image on the first column.

