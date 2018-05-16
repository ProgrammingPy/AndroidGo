#include <jni.h>
#include <string>
#include "tinyxml2.h"
#include <stdlib.h>



using namespace std;
using namespace tinyxml2;


//
std::string toxml()
{
    const char* declaration ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
    XMLDocument doc;
    doc.Parse(declaration);

    XMLElement* root = doc.NewElement("config");
    doc.InsertEndChild(root);

    XMLElement *element = doc.NewElement("name");
    XMLText *text = doc.NewText("sandy");
    element->InsertEndChild(text);
    root->InsertEndChild(element);

    element = doc.NewElement("age");
    text = doc.NewText("18");
    element->InsertEndChild(text);
    root->InsertEndChild(element);

    XMLPrinter printer;
    doc.Print(&printer);
    std::string str(printer.CStr(), strlen(printer.CStr()));
	return str;
}


extern "C" JNIEXPORT jstring
JNICALL
Java_com_example_ekin_intro_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject obj/* this */) {
    //std::string hello = "Hello from C++ plus plus";
	std::string hello = toxml();
    return env->NewStringUTF(hello.c_str());
}

