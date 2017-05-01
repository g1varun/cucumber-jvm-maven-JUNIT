$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login feature of mercury website.",
  "description": "",
  "id": "test-login-feature-of-mercury-website.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "mercury login test",
  "description": "",
  "id": "test-login-feature-of-mercury-website.;mercury-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user opens application page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters Credentials to LogIn",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginScript.openURL()"
});
formatter.result({
  "duration": 197349089,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\ankugupta\\Downloads\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat com.czeczotka.bdd.steps.Hook.openBrowser(Hook.java:12)\r\n\tat com.czeczotka.bdd.steps.loginScript.openURL(loginScript.java:21)\r\n\tat ✽.Given user launch browser(cucumber/login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginScript.launchapplication()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginScript.login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginScript.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});