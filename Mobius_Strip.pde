import java.lang.Math;
import peasy.*;
import java.util.Random;

PeasyCam cam;
PVector pv;
int DIMENSIONS = 32;

void setup() {
  size(1280,720,P3D);
  cam = new PeasyCam(this, 2500);
  cam.pan(-300.0,0);
  cam.rotateX(775.0);
}
void draw() {
  background(0);
  Random rand = new Random();
  for(float theta = 0.0;theta<=2*Math.PI;theta+=.04)
  {
    stroke(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    for(float t = -1.0;t<=1.0;t+=.01)
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
