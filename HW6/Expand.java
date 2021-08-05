/*Name: Yibo Wang
OPUSID: ywan738
UserID#: 2203982
Emory email: yibo.wang@emory.edu
Collaboration Statement: I used the Think @ Java textbook and collaborated with Elizabeth Yusupova, Josh Baisson & Sunny Chung. 
*/

import java.awt.Dimension;
import java.awt.Color;


public class Expand extends Command
{
    private static SizeInputDialog ourDialog = 
        new SizeInputDialog("Resize Scale Input",
                            " scale width by",
                            "scale height by");

    public Expand ()
    {
        super("Resize");
    }


    public void execute (Pixmap target)
    {
        ourDialog.show();
        Dimension scale = ourDialog.getSize();
        Dimension oldSize = target.getSize();
        target.setSize(oldSize.width * scale.width, oldSize.height * scale.height);

	// TODO: fill in enlarged pixmap by copying current colors into empty space
        //       so each takes up scale space in the new pixmap
	
	Pixmap newPixmap = new Pixmap(target);//Creates a new pixmap, which is a copy of the orginal pixmap, that will store the colors from the unexpanded image
	
	//This nested for loop goes through the width & height of the orginal image and gets the color,which I'll call old. 
	
		for(int x = 0; x < oldSize.width;x++){
		//since the image is not expanded, we set the condition (x<oldSize.width)
			for (int y = 0; y < oldSize.height;y++){
			//since the image is not expanded, we set the condition (y<oldSize.height)
				Color old = newPixmap.getColor(x,y); //gets the color

				//This nested for loop refills the expanded target image with the color. 
				
				//The expanded image is filled with the same pixel in a rectangle that is (x*scale.width)+scale.width) by (y*scale.height)+scale.height)
				for (int i = x*scale.width;i<((x*scale.width)+scale.width);i++) {
				//since the image is now expanded by the scale width, we set the condition (i<(x*scale.width)+scale.width))
					for(int j = y*scale.height;j <((y*scale.height)+scale.height);j++) {
					//since the image is now expanded by the scale height, we set the condition (j<(x*scale.height)+scale.height)
						target.setColor(i,j,old); //sets the color
			
					} 

	        
	    		}
			} 
	   	}
    }
}
