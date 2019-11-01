# stepView with Animation
Cara instalasi


    dependencies {
        ...
        ...
        implementation 'com.github.vickyKDV:stepView:1.0'
    }


    allprojects {
    repositories {
        ...
        ...
        maven { url "https://jitpack.io" }
    }
    }

cara menggunakan pada xml

    <com.vickykdv.stepviewanimation.stepViewAnimation
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:step_1_desc="Test 1"
        app:step_2_desc="Test 2"
        app:step_3_desc="Test 3"
        app:step_4_desc="Test 4"
        app:showstep_1="false"
        />
        


 Thanx for : https://github.com/airbnb/lottie-android
