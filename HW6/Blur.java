/*Name: Yibo Wang
OPUSID: ywan738
UserID#: 2203982
Emory email: yibo.wang@emory.edu
Collaboration Statement: I used the Think @ Java textbook, collaborated with Jacob Shuster & Sunny Chung, 
and referenced these Piazza questions: https://piazza.com/class/idsvsq42pe42a?cid=385 & https://piazza.com/class/idsvsq42pe42a?cid=390 
& https://piazza.com/class/idsvsq42pe42a?cid=353. 
*/

import java.awt.Color;
import java.awt.Dimension;


public class Blur extends Command
{
    private static SizeInputDialog ourDialog = 
        new SizeInputDialog("Choose Neighborhood Size",
                            "       width",
                            "      height");
 

    public Blur ()
    {
        super("Blur");
    }


    public void execute (Pixmap target)
    {
        ourDialog.show();
        Dimension neighborhood = ourDialog.getSize();
        Dimension bounds = target.getSize();

        // TODO: blur target pixmap by averaging each color 
        //       with its neighbors
	
	
	int redAverage = 0;
	int greenAverage = 0;
	int blueAverage = 0; 
	//These initialized variables will later be used to store the average red, green & blue values. 

	int squared = neighborhood.width * neighborhood.height; //This gets the area of the neighborhood square. 
	 
	Pixmap newPixmap = new Pixmap(target); //Creates a new copy of the pixmap that we can use to get colors

		for(int x = neighborhood.width/2; x < (bounds.width-neighborhood.width/2); x++) {
		 				
			for(int y = neighborhood.height/2; y < (bounds.height-neighborhood.height/2);y++){
				//This nested for loop gets the dimensions of the picture that will be blurred.
				//The dimensions of the picure that can be blurred are based on subtracting the picture's width and height by half of the neighborhood width and height.
								
				for(int a = (x-neighborhood.width/2); a < x+(neighborhood.width/2)+1;a++){
						
					for(int b = (y-(neighborhood.height/2)); b < y+(neighborhood.height/2)+1;b++){
						//This second nested for loop gets the dimensions of the neighborhood whose colors need to be added up. 
						//The dimensions of neighorhood is based on subtracting x by half of the neighborhood's width and adding x to half of the neighborhood's width.

						Color currentColor = newPixmap.getColor(a,b); //gets the current color 
						
						redAverage += currentColor.getRed(); //Adds up the total number for the red,green & blue values
						 
						greenAverage += currentColor.getGreen();
						
						blueAverage += currentColor.getBlue();
					
																						
					}
			
	    		}
	    		redAverage = redAverage/squared; //Divides the total red, green, & blue averages by the area of the neighborhood square. 
				
				greenAverage = greenAverage/squared; 
				
				blueAverage = blueAverage/squared;
				
				Color averageColor = new Color(redAverage, greenAverage, blueAverage); 
				target.setColor(x, y, averageColor); //Sets the orginal pixmap to the blurred color
				
				redAverage = 0; //resets the red, green, blue color averages for the next pixel
				
				greenAverage = 0;
				
				blueAverage = 0;
				
			}
		}
		
    }
}
