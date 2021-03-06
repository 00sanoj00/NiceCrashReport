# NiceCrashReport
Library Availbale at JitPack.io

[![](https://jitpack.io/v/00sanoj00/NiceCrashReport.svg)](https://jitpack.io/#00sanoj00/NiceCrashReport)

NiceCrashReport is designed to make it easier for you to find out what happened through the download log through the downloader if the app crashes due to an error or some other reason.


![](https://github.com/00sanoj00/NiceCrashReport/blob/master/Screen/ezgif-3-582a2130eb31.gif?raw=true)
## Installation


Add jitpack in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
```
Step 2. Add the dependency

```
	dependencies {
	
	         implementation 'com.github.00sanoj00:NiceCrashReport:1.7'
	}
```

## How to use
Use the `onCreate` Just like <a href="https://github.com/00sanoj00/NiceCrashReport/blob/master/app/src/main/java/com/sanoj/devil/crash/MainActivity.java">MainActivity.java</a>

`NiceCrash.Builder.create().apply();`
```java
import com.sanoj.devil.nicecrashreport.config.NiceCrash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Add NiceCrashReport 
        NiceCrash.Builder.create().apply();

    }
}
```
## Try it
Use `throw new RuntimeException("Boooooom");`

```java
Button crash = findViewById(R.id.crashmemamam);
        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                throw new RuntimeException("Badumathama!");
            }
        });
```
![](https://github.com/00sanoj00/NiceCrashReport/blob/master/Screen/sample.gif?raw=true)


![](https://github.com/00sanoj00/NiceCrashReport/blob/master/Screen/thank-you%20(1).png)

![](https://github.com/00sanoj00/NiceCrashReport/blob/master/Screen/thank-you%20(2).png)<a href="https://github.com/airbnb/lottie-android">Lottie for Android </a>

![](https://github.com/00sanoj00/NiceCrashReport/blob/master/Screen/thank-you%20(2).png)<a href="https://github.com/intuit/sdp">SDP Android </a>

