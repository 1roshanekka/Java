//Your first Java Applet
//An applet to print Hello World

import java.applet.*;
import java.awt.*;

	public class HelloWorld extends Applet
	{
		public void paint (Graphics g)
		{
			g.drawString("Hello World !", 150, 150);
		}
	}
//This is deprecated since Java 9, and removed in Java 11.
//Due to browsers not supporting it because of server side execution security concerns.
//No body trusts programs that just start running on their own without being safely sandboxed.