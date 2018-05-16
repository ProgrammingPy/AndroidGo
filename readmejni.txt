ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ javah -d jni -classpath ../../build/intermediates/classes/debug/
android/ com/     
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ javah -d jni -classpath ../../build/intermediates/classes/debug//
android/ com/     
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ javah -d jni -classpath ../../build/intermediates/classes/debug/ com.example.ekin.samplejni.MainActivity
Error: cannot access android.support.v7.app.AppCompatActivity
  class file for android.support.v7.app.AppCompatActivity not found
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ 
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ javah -d jni -classpath ../../build/intermediates/classes/debug/ com.example.ekin.samplejni.SampleJni
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ ls
AndroidManifest.xml  java  jni  res
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main$ cd jni/
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main/jni$ ls
com_example_ekin_samplejni_SampleJni.h
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main/jni$ ls -al
total 12
drwxr-xr-x 2 ekin ekin 4096 5月  16 17:18 .
drwxr-xr-x 5 ekin ekin 4096 5月  16 16:55 ..
-rw-r--r-- 1 ekin ekin  542 5月  16 17:18 com_example_ekin_samplejni_SampleJni.h
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main/jni$ vim com_example_ekin_samplejni_SampleJni.h 
ekin@ekin-3800:~/work/AndroidGo/SampleJni/app/src/main/jni$ ls
com_example_ekin_samplejni_SampleJni.h

