/* autogenerated by Processing revision 1292 on 2023-04-21 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.lang.Math;
import peasy.*;
import java.util.Random;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Mobius_Strip extends PApplet {

PeasyCam cam;
PVector pv;
int DIMENSIONS = 32;

public void setup() {
  /* size commented out by preprocessor */;
  cam = new PeasyCam(this, 2500);
  cam.pan(-300.0f,0);
  cam.rotateX(775.0f);
}
public void draw() {
  background(0);
  Random rand = new Random();
  for(float theta = 0.0f;theta<=2*Math.PI;theta+=.04f)
  {
    stroke(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    for(float t = -1.0f;t<=1.0f;t+=.01f)
    {
      float x = (float)(Math.cos(theta)*(3+t*Math.cos(theta/2)))*10;
      float y = (float)(Math.sin(theta)*(3+t*Math.cos(theta/2)))*10;
      float z = (float)(t*Math.sin(theta/2))*10;
      float newX = map(x,0,DIMENSIONS,-400,400);
      float newY = map(y,0,DIMENSIONS,-400,400);
      float newZ = map(z,0,DIMENSIONS,-400,400);
      
     
      point(newX,newY,newZ);
      
    }
  }
}


  public void settings() { size(1280, 720, P3D); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Mobius_Strip" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}