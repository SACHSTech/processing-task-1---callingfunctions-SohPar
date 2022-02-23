import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    //land
    background(71, 219, 66);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  //Sky
  fill(135, 206, 235);
  rect(0, 0, 400, 230);

  //House
  fill(255, 87, 51);
  rect(170, 220, 70, 45);
  
  //Roof
  triangle(170, 220, 205, 195, 240, 220);
  fill(255);

  //Windows
  rect(180, 230, 10, 12);
  rect(220, 230, 10, 12);
 
  //Door
  fill(0);
  rect(200, 245, 10, 18);

  //Sun
  fill(250, 255, 51);
  ellipse(0, 0, 150, 150);

  //Clouds
  fill(255, 252, 252);
  

  }
  
  // define other methods down here.
}