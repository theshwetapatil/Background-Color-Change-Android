// RadioExampleActivity.java : Defines the entry point for the android application.
// Android: Radio Button and Compound Button
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package com.radio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class RadioExampleActivity extends Activity implements OnCheckedChangeListener,android.widget.CompoundButton.OnCheckedChangeListener{
	RadioGroup gen,col;
	CheckBox b1,b2,b3,b4,b5;
	String res="";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        col=(RadioGroup)findViewById(R.id.rg1);
        gen=(RadioGroup)findViewById(R.id.rg2);
        col.setOnCheckedChangeListener(this);
        gen.setOnCheckedChangeListener(this);
        
        b1=(CheckBox)findViewById(R.id.cb1);
        b2=(CheckBox)findViewById(R.id.cb2);
        b3=(CheckBox)findViewById(R.id.cb3);
        b4=(CheckBox)findViewById(R.id.cb4);
        b5=(CheckBox)findViewById(R.id.cb5);
        
        b1.setOnCheckedChangeListener(this);
        b2.setOnCheckedChangeListener(this);
        b3.setOnCheckedChangeListener(this);
        b4.setOnCheckedChangeListener(this);
        b5.setOnCheckedChangeListener(this);
    }
    
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		String res="";
		
		switch(group.getId())
		{
			case R.id.rg1:
							switch(checkedId)
							{
								case R.id.c1:
									res="Red";
									break;
								case R.id.c2:
									res="Green";
									break;
								case R.id.c3:
									res="Blue";
									break;
								case R.id.c4:
									res="Yellow";
									break;
							}
							Toast.makeText(getApplicationContext(), "You have chosen "+res+" Color.", 5000).show();
							break;
			
			case R.id.rg2:
							switch(checkedId)
							{
								case R.id.g1:
									res="Male";
									break;
								case R.id.g2:
									res="Female";
									break;
								case R.id.g3:
									res="Undefined";
									break;
							}
							Toast.makeText(getApplicationContext(), "You have chosen "+res+" Gender.", 5000).show();
							break;
		}
	}
	
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(buttonView.getId()==R.id.cb1)
		{
			if(isChecked)
				res=res+" "+"Cricket";
			else
				res.replace("Cricket", "");
		}

		if(buttonView.getId()==R.id.cb2)
		{
			if(isChecked)
				res=res+" "+"Football";
			else
				res.replace("Football", "");
		}

		if(buttonView.getId()==R.id.cb3)
		{
			if(isChecked)
				res=res+" "+"Badminton";
			else
				res.replace("Badminton", "");
		}
				
		if(buttonView.getId()==R.id.cb4)
		{
			if(isChecked)
				res=res+" "+"Hokey";
			else
				res.replace("Hokey", "");
		}
					
		if(buttonView.getId()==R.id.cb5)
		{
			if(isChecked)
				res=res+" "+"Basketball";
			else
				res.replace("Basketball", "");
		}
		Toast.makeText(getApplicationContext(), "You like "+res, 5000).show();
	}
}