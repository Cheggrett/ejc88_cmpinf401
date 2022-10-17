
public class MyRectangle {
	// Declare instance variables here.  See toString() method below for names.
		private int height;
		private int width;
		private int startX;
		private int startY;
		
		public MyRectangle()
		{
			// Default constructor -- initialize all instance variables
			// to 0
			setHeight(0);
			setWidth(0);
			setStartX(0);
			setStartY(0);
		}

		public MyRectangle(int x, int y, int w, int h)
		{
			// Initialize instance variables based on parameters shown.
			// Be careful to get the order correct!
			setStartX(x);
			setStartY(y);
			setWidth(w);
			setHeight(h);
		}

		public int area()
		{
			// Return the area of this Rectangle
			
			int area = this.width * this.height;
			return area;
			
		}

		// I have written this method for you.  Note how a StringBuilder is
		// utilized, since (as we discussed in lecture) it can be modified
		// without having to create a new object each time (unlike a String).
		public String toString()
		{
			StringBuilder S = new StringBuilder();
			S.append("Width: " + width);
			S.append(" Height: " + height);
			S.append(" X: " + startX);
			S.append(" Y: " + startY);
			return S.toString();
		}

		public boolean isInside(int x, int y) {
			boolean inside;
			int Xstart = this.startX;
			int Ystart = this.startY;
			int Xend = this.startX + this.width;
			int Yend = this.startY - this.height;

			if (x > Xend || x < Xstart) {
				if (y > Ystart || y < Yend) {
					inside = true;
				} else {
					inside = false;
				}
			} else {
				inside = false;
			}
				return inside;
			// This is the trickiest of the methods to write. This should
			// return true if point (x,y) is anywhere within the borders of the
			// current MyRectangle (including the borders themselves). Use a
			// pencil and paper to figure out how this can be determined with
			// just a few simple relational operations.
		}

		public void setSize(int w, int h)
		{
			setHeight(h);
			setWidth(w);
			// Update width and height as shown
		}

		public void setPosition(int x, int y)
		{
			setStartX(x);
			setStartY(y);
			// Update startX and startY as shown
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getStartX() {
			return startX;
		}

		public void setStartX(int startX) {
			this.startX = startX;
		}

		public int getStartY() {
			return startY;
		}

		public void setStartY(int startY) {
			this.startY = startY;
		}
}
