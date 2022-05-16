package imagemanipulator;

import imagemanipulator_macros.Clahe;
import imagemanipulator_macros.GaussianBlur;
import imagemanipulator_macros.RandomCropping;
import imagemanipulator_macros.RichardsonLucy;
import imagemanipulator_macros.RollingBall;

public class ImageManipulator {
	public ImageManipulator() {
		// First image enhancement filter
		//RandomCropping rc = new RandomCropping(144,144,24,false);
		//rc.execute();
		// Add second image enhancement filter on top
		//GaussianBlur gb = new GaussianBlur(3,3,false);
		//gb.execute();
		// Add third image enhancement filter on top
		//RollingBall rb = new RollingBall(70.5f,true,true,false);
		//rb.execute();
		RichardsonLucy r = new RichardsonLucy(3,false);
		r.execute();
	}

}
