<div align="center">

<img src="./graphics/best-practices-java.jpeg" alt="testing-good" width="400"/>

<br />
<!-- badges: start -->

[![E2E Tests – Examples](https://img.shields.io/github/workflow/status/c3ccl3ston/automation-best-practices-java/E2E%20Tests%20%E2%80%93%20Examples?label=E2E%20Tests%20%E2%80%93%20Examples&logo=saucelabs&logoColor=red&style=for-the-badge)](https://github.com/c3ccl3ston/automation-best-practices-java/actions/workflows/e2e_test_examples.yaml)
[![E2E Tests – Solutions](https://img.shields.io/github/workflow/status/c3ccl3ston/automation-best-practices-java/E2E%20Tests%20%E2%80%93%20Solutions?label=E2E%20Tests%20%E2%80%93%20Solutions&logo=saucelabs&logoColor=red&style=for-the-badge)](https://github.com/c3ccl3ston/automation-best-practices-java/actions/workflows/e2e_test_solutions.yaml)

[![#testing4good](https://img.shields.io/twitter/url?color=blue&label=%23testing4good&logo=twitter&style=for-the-badge&url=https%3A%2F%2Ftwitter.com%2Fhashtag%2FTesting4Good)](https://twitter.com/hashtag/Testing4Good)

<!-- badges: end -->
</div>


### Testing for Good serves 2 purposes:

1. To pay it forward to the testing world and help us all upskill 🚀
2. For us all to help a cause greater than ourselves 🌍

### [About Black Girls CODE](https://www.blackgirlscode.com/about-us/)

We build pathways for young women of color to embrace the current tech marketplace as builders and creators by 
introducing them to skills in computer programming and technology.

Radical action is needed if we are to close the opportunity gap for Black women and girls. We lead a global movement to 
establish equal representation in the tech sector. Black Girls CODE is devoted to showing the world that Black girls can
code and do so much more. Together, we are creating stronger economies and more equitable societies—ultimately realizing
the true potential of democracy through diversity and inclusion.

👉 While the event is free, Sauce Labs encourages all attendees to 
[donate to Black Girls Code](https://www.gofundme.com/f/testing-for-good-workshop-black-girls-code). Sauce Labs Office 
of Inclusion & Sustainability will match donations up to $2500.

## You will learn to:

In this automation best practices workshop you will learn the latest and greatest tools and techniques to drastically 
improve your testing!

We will focus on a holistic approach of risk mitigation by doing:

- Functional web testing
  - Create a framework for doing comprehensive web testing
  - Use industry-standard best practices
  - Create functional browser tests using Selenium
- Many other things in between
  - Accessibility testing
  - Run in massive parallel (100s of tests in < 5 min)
  - Automatically get robust test reports which includes logs + videos

## Technologies you will use:

1. Sauce Labs
2. Selenium
3. GitHub Actions
4. Java
5. Maven

## Table Of Contents

- Introduction to workshop
- Setup
  - [Gitpod setup](#gitpod-setup)
  - [Local setup](#local-environment-setup)
  - [Setting data center](#setting-data-center)
- [E2E browser tests](./workshop/docs/E2E-TESTS.MD)
- [Atomic tests](./workshop/docs/ATOMIC-TESTS.MD)
- [Accessibility tests](./workshop/docs/ACCESSIBILITY-TESTS.MD)
- [Parallelization](./workshop/docs/PARALLEL.MD)
- [Conclusions](./workshop/docs/CONCLUSIONS.MD)

## Requirements

**This is NOT a beginners course. You will not learn Java testing fundamentals here. However, you will learn a number 
of amazing skills, techniques, and tools to help you test web applications**

- At least 1 year of Java programming
- Deep understanding of Selenium WebDriver
- Deep understanding of OOP
- Java 8 installed
- Java IDE installed
- [Git](https://git-scm.com/downloads)
- [Maven installed](https://maven.apache.org/install.html)
- Free [Sauce account](https://www.saucelabs.com/sign-up)

## Your Instructor: Chris Eccleston

<img src="./graphics/chris.jpg" alt="Chris Eccleston profile photo" width="200"/>

### Facts about me:

- 🏢 Solutions Architect at Sauce Labs
- 😄 Pronouns: he/him
- 🏠 Home automation enthusiast
- 📫 Links:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/chris-eccleston-42119541/)
[![Twitter](https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/chriseccleston)
[![Github](https://img.shields.io/badge/Github-100000?style=for-the-badge&logo=github&logoColor=white)](https://www.github.com/c3ccl3ston)

## Setup

### Sign up for account

[![Sauce Labs](https://img.shields.io/badge/SauceLabs-AC1414?style=for-the-badge&logo=saucelabs&logoColor=white)](https://saucelabs.com/sign-up)

### Get your username and api key

- Save your Sauce Labs Username and Access Key by going to the [Sauce Labs user settings page](https://app.saucelabs.com/user-settings)

### Gitpod setup

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io#https://github.com/c3ccl3ston/automation-best-practices-java)

> ℹ️ Gitpod lets you run an entire Dev environment from a browser! You can use this approach if you don't 
> know how to set up a local Java environment.

1. Once the Gitpod.io URL is loaded, you will need to sign in with the GitHub account you created earlier
2. Once the development environment is loaded, you should see 'Ready to test!' in the Terminal window in the lower 
portion of the window, run the following commands in that Terminal to set your `SAUCE_USERNAME` and `SAUCE_ACCESS_KEY`:

> ℹ️ You can get your Sauce Labs Username and Access Key by going to the [Sauce Labs user settings page](https://app.saucelabs.com/user-settings)

```bash
eval $(gp env -e SAUCE_USERNAME=<sauce_username>)
eval $(gp env -e SAUCE_ACCESS_KEY=<sauce_access_key>)
```

> Replace <sauce_username> and <sauce_access_key> with your credentials

Once you have run those 2 commands, you can run the following commands to test your environment variables:

```bash
echo $SAUCE_USERNAME
echo $SAUCE_ACCESS_KEY
```

Run sanity tests

```bash
mvn test -Dtest=E2ETests -X
```

  <details>
    <summary>
      <strong>Click here</strong> to see an example console output.
    </summary>

        Results :

        Tests run: 4, Failures: 0, Errors: 0, Skipped: 3

        [INFO] ------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------
        [INFO] Total time:  12.410 s
        [INFO] Finished at: 2022-07-11T10:06:10-04:00
        [INFO] ------------------------------------------

  </details>

---

### Local environment setup

Fork then clone the repo

1. Sign up for a free [GitHub account](https://github.com/)
2. [Fork this repository](https://docs.github.com/en/get-started/quickstart/fork-a-repo)

   - Make sure you are logged into GitHub
   - Click the Fork in the upper right of the GitHub.

3. Clone your fork of the repository to your machine. Must have [Git installed](https://git-scm.com/downloads)

```bash
git clone URL_OF_YOUR_FORK
```

Setup environment variables on your system

[![Mac/Linux](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=apple&logoColor=white)](https://docs.saucelabs.com/basics/environment-variables/#setting-up-environment-variables-on-macos-and-linux-systems)
</br>
[![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)](https://docs.saucelabs.com/basics/environment-variables/#setting-up-environment-variables-on-windows-systems)

Navigate to the directory of where you cloned your repo

```bash
cd YOUR_FORK_DIR/automation-best-practices/workshop
```

Run sanity tests

```java
mvn test -Dtest=E2ETests -X
```

  <details>
    <summary>
      <strong>Click here</strong> to see an example console output.
    </summary>

      Results :

      Tests run: 4, Failures: 0, Errors: 0, Skipped: 3

      [INFO] ------------------------------------------
      [INFO] BUILD SUCCESS
      [INFO] ------------------------------------------
      [INFO] Total time:  12.410 s
      [INFO] Finished at: 2022-07-11T10:06:10-04:00
      [INFO] ------------------------------------------

  </details>

### ✅ 👏 Environment setup is complete if tests passed

## Setting data center

By default, the data center selected for our exercises is `US_WEST`. If you would like to switch to another data 
center (i.e. `EU_CENTRAL`), please update the [E2ETests](workshop/src/test/java/com/saucedemo/exercises/E2ETests.java) with the appropriate data center.

## Stay to the end and win a prize!

Stay to the end and 2 lucky people can win a snazzy Backpack!

<img src="./graphics/large_Sauce_Bkpk_2021.png" alt="me" width="200" />

## Key

💡 this is a tip

🏋️‍ this is an exercise for you to do

❓ this is a question for us to think and talk about. Try not to scroll beyond this question before we discuss
