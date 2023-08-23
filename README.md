# Pennstagram

+ PixelPicture.java, which manages the reading and writing of image data
+ GUI.java, the simple GUI for the program (which you can run to help you test Parts 3 and 4).
+ ColorMap.java, a Map data structure that helps build histograms.
+ ManipulateTest.java, a JUnit test file for the image manipulations.
+ PointQueue.java, a data structure for managing queues of ints (needed only for the Kudos flood fill problem).
+ Pixel.java, which is a point of color in an image. You’ll have to finish a few constructors (Pixel()), getRed(), getGreen(), getBlue(), getComponents(), distance(), toString() and equals().
+ MyPixelTest.java, which contains an example test for Pixel. You will need to add your own tests to ensure your code works the way you want it to.
+ SimpleManipulations.java, a collection of simpler image manipulations. You’ll have to finish rotateCCW(), border(), invertColors(), grayScaleAverage(), scaleColors(), and alphaBlend().
+ AdvancedManipulations.java, a collection of image manipulations requiring pre-processing of the image or consideration of multiple pixels at once in order to paint a single pixel. You’ll have to finish adjustContrast(), reducePalette(), and blur() (and flood() for Kudos!).
+ Effects.java, which implements super-fancy photo effects, based on the basic image manipulations (modified only for Kudos).
+ ImageTest.java, a place to put your own JUnit tests.
