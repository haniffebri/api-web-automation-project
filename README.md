# Automation Testing Project

Di dalam project ini berisi : 
- Web UI testing
- API testing
  
Project ini dibuat untuk menyelesaikan course [QA Engineer Bootcamp JAYJAY](https://jayjay.co/)

## Target
- API User & Tag Controller :point_right: [dummyapi](https://dummyapi.io)
- Web UI :point_right: [Demoblaze](https://www.demoblaze.com/)

## Build Setup 

- Programming Language : Java 
- Test Case BDD Library : Cucumber
- API Automation Library : Rest Assured
- WEB Automation Library : Selenium WebDriver
- Testing Framework : JUnit
- Driver management tool: WebDriverManager

## Struktur Project

- features : package yang berisi file skenario pengujian menggunakan bahasa Gherkin.
- helper : package yang berisi fungsi menjalankan driver web, setup endpoint untuk api testing, dll.
- pages : package yang berisi logic file untuk menjalankan test step dari sebuah skenario pengujian.
- runner : package yang berisi file untuk setup pengujian dan setup report test.
- stepDef : package yang berisi file untuk menghubungkan step dari skenario pengujian ke logika pemrograman nya.

## Instalation 

1. Clone repository
2. Open project di IDE ( Intellij IDEA IDE yang saya pakai )
3. Setting JDK , Gradle distribution menggunakan Gradle Wrapper

## How to run project

Untuk menjalankan testing dapat menggunakan 2 cara yaitu run via terminal dan run class TestRunner pada file TestRunner.java

### Via terminal

API testing

:point_down:

```
./gradlew api
```
Web testing

:point_down:	

```
./gradlew web
```

### Via TestRunner

:point_down:

```
Jalankan class TestRunner di IDE kalian pada file TestRunner.java
```

## Report Testing

### API Report

- Click :point_right: [HTML](https://haniffebri.github.io/api-web-automation-project/api-report.html)

- Click :point_right: [JSON](https://haniffebri.github.io/api-web-automation-project/api-report.json)

### Web Report

- Click :point_right: [HTML](https://haniffebri.github.io/api-web-automation-project/web-report.html)

- Click :point_right: [JSON](https://haniffebri.github.io/api-web-automation-project/web-report.json)

## Author

Hanif Febri Nugroho

Lets Connect :wink: !

:wave:  [LinkedIn](https://www.linkedin.com/in/haniffnu/)

:wave:  [Instagram](https://www.instagram.com/haniffnu_/)
