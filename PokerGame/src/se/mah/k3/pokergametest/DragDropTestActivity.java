package se.mah.k3.pokergametest;

import se.mah.k3.pokergame.R;
import se.mah.k3.pokergame.R.layout;
import se.mah.k3.pokergame.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class DragDropTestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drag_drop_test);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drag_drop_test, menu);
		return true;
		//Test drag
//		// Sets the tag for drag
//		iv1 = (ImageView) findViewById(R.id.imageView1);
//		iv1.setTag("testDrag");
//
//		    //...
//
//		// Sets a long click listener for the ImageView using an anonymous listener object that
//		// implements the OnLongClickListener interface
//		iv1.setOnLongClickListener(new View.OnLongClickListener() {
//
//		    // Defines the one method for the interface, which is called when the View is long-clicked
//		    public boolean onLongClick(View v) {
//
//		    // Create a new ClipData.
//		    // This is done in two steps to provide clarity. The convenience method
//		    // ClipData.newPlainText() can create a plain text ClipData in one step.
//		    // Create a new ClipData.Item from the ImageView object's tag
//		    ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
//
//		    // Create a new ClipData using the tag as a label, the plain text MIME type, and
//		    // the already-created item. This will create a new ClipDescription object within the
//		    // ClipData, and set its MIME type entry to "text/plain"
//		    ClipData dragData = new ClipData((CharSequence) v.getTag(),new String[] { ClipDescription.MIMETYPE_TEXT_PLAIN },item);
//
//		    // Instantiates the drag shadow builder.
//		    View.DragShadowBuilder myShadow = new MyDragShadowBuilder(iv1);
//
//		    // Starts the drag
//
//		            v.startDrag(dragData,  // the data to be dragged
//		                        myShadow,  // the drag shadow builder
//		                        null,      // no need to use local data
//		                        0          // flags (not currently used, set to 0)
//		            );
//
//		    }
//		}
//		
//		
//		//End test
	}
//	 private static class MyDragShadowBuilder extends View.DragShadowBuilder {
//
//		    // The drag shadow image, defined as a drawable thing
//		    private static Drawable shadow;
//
//		        // Defines the constructor for myDragShadowBuilder
//		        public MyDragShadowBuilder(View v) {
//
//		            // Stores the View parameter passed to myDragShadowBuilder.
//		            super(v);
//
//		            // Creates a draggable image that will fill the Canvas provided by the system.
//		            shadow = new ColorDrawable(Color.LTGRAY);
//		        }
//
//		        // Defines a callback that sends the drag shadow dimensions and touch point back to the
//		        // system.
//		        @Override
//		        public void onProvideShadowMetrics (Point size, Point touch)
//		            // Defines local variables
//		            private int width, height;
//
//		            // Sets the width of the shadow to half the width of the original View
//		            width = getView().getWidth()/2;
//
//		            // Sets the height of the shadow to half the height of the original View
//		            height = getView().getHeight() / 2;
//
//		            // The drag shadow is a ColorDrawable. This sets its dimensions to be the same as the
//		            // Canvas that the system will provide. As a result, the drag shadow will fill the
//		            // Canvas.
//		            shadow.setBounds(0, 0, width, height);
//
//		            // Sets the size parameter's width and height values. These get back to the system
//		            // through the size parameter.
//		            size.set(width, height);
//
//		            // Sets the touch point's position to be in the middle of the drag shadow
//		            touch.set(width / 2, height / 2);
//		        }
//
//		        // Defines a callback that draws the drag shadow in a Canvas that the system constructs
//		        // from the dimensions passed in onProvideShadowMetrics().
//		        @Override
//		        public void onDrawShadow(Canvas canvas) {
//
//		            // Draws the ColorDrawable in the Canvas passed in from the system.
//		            shadow.draw(canvas);
//		        }
//		    }

}

