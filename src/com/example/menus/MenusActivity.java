package com.example.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenusActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	CreateMenu(menu);
    	return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	return MenuChoice(item);
    }
    
    public void CreateMenu(Menu menu) {
    	MenuItem mnu1 = menu.add(0, 0, 0, "Item 1"); {
    		mnu1.setAlphabeticShortcut('a');
    		mnu1.setIcon(R.drawable.ic_launcher);
    	}
    	
    	MenuItem mnu2 = menu.add(0, 1, 1, "Item 2"); {
    		mnu1.setAlphabeticShortcut('b');
    		mnu1.setIcon(R.drawable.ic_launcher);
    	}
    	
    	MenuItem mnu3 = menu.add(0, 2, 2, "Item 3"); {
    		mnu1.setAlphabeticShortcut('c');
    		mnu1.setIcon(R.drawable.ic_launcher);
    	}
    	
    	MenuItem mnu4 = menu.add(0, 3, 3, "Item 4"); {
    		mnu1.setAlphabeticShortcut('d');
    	}
    	
    	menu.add(0, 4, 4, "Item 5");
    	menu.add(0, 5, 5, "Item 6");
    	menu.add(0, 6, 6, "Item 7");
    }
    
    private boolean MenuChoice(MenuItem item) {
    	switch(item.getItemId()) {
    	case 0: 
    		Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
    		return true;
    	case 1:
    		Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_LONG).show();
    		return true;
    	case 2:
			Toast.makeText(this, "You clicked on Item 3", Toast.LENGTH_LONG).show();
			return true;
    	case 3:
    		Toast.makeText(this, "You clicked on Item 4", Toast.LENGTH_LONG).show();
    		return true;
    	case 4:
    		Toast.makeText(this, "You clicked on Item 5", Toast.LENGTH_LONG).show();
    		return true;
    	case 5:
    		Toast.makeText(this, "You clicked on Item 6", Toast.LENGTH_LONG).show();
    		return true;
    	case 6:
    		Toast.makeText(this, "You clicked on Item 7", Toast.LENGTH_LONG).show();
    		return true;
    	}
    	return false;
    }
}