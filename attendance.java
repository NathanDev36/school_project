apply plugin: 'com.android.application'

android {
compileSdkVersion 26

defaultConfig {
applicationId "com.example.androidattendancesystem"
minSdkVersion 14
targetSdkVersion 26
}

buildTypes {
release {
minifyEnabled false
proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.txt'
}
}
}

dependencies {
compile 'com.android.support:support-v4:26.1.0'
}
