#include <jni.h>
#include <string>
#include "tinyxml2.h"
#include <stdlib.h>
#include "SDL.h"


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

int sdl_intro()
{
    //The images
    SDL_Surface* hello = NULL;
    SDL_Surface* screen = NULL;

    //Start SDL
    SDL_Init( SDL_INIT_EVERYTHING );

    //Set up screen
    screen = SDL_SetVideoMode( 640, 480, 32, SDL_SWSURFACE );

    //Load image
    hello = SDL_LoadBMP( "hello.bmp" );

    //Apply image to screen
    SDL_BlitSurface( hello, NULL, screen, NULL );

    //Update Screen
    SDL_Flip( screen );

    //Pause
    SDL_Delay( 2000 );

    //Free the loaded image
    SDL_FreeSurface( hello );

    //Quit SDL
    SDL_Quit();

    return 0;
}


extern "C" JNIEXPORT jstring
JNICALL
Java_com_example_ekin_intro_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject obj/* this */) {
    //std::string hello = "Hello from C++ plus plus";
	std::string hello = toxml();
	sdl_intro();
    return env->NewStringUTF(hello.c_str());
}

