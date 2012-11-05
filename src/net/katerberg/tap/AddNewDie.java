package net.katerberg.tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddNewDie extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_custom_die);
		
		((Button)this.findViewById(R.id.acceptCustomDie)).setOnClickListener(createAcceptCustomDieListener());
	}

	private OnClickListener createAcceptCustomDieListener() {

		OnClickListener acceptCustomDie = new OnClickListener() {
			
			public void onClick(View v) {
				EditText inputField = (EditText)v.findViewById(R.id.customDieInput);
				String userInput = inputField.getText().toString();
				if(isInputValid(userInput)){
					CustomDie userDie = userInputToCustomDie(userInput);
				}
				
				
			}
			
			
			private CustomDie userInputToCustomDie(String userInput) {
				CustomDie die = new CustomDie();
				String[] dSeparator = userInput.split("d");
				Integer numberOfDice=Integer.parseInt(dSeparator[0]);
				
				String[] mathSeparator = dSeparator[0].split("[+-]");
				Integer typeOfDice = Integer.parseInt(mathSeparator[0]);
				die.setMaxValue(typeOfDice);
//TODO: Finish this				
				die.setNumberOfDice(numberOfDice);
				return die;
			}

			private Boolean isInputValid(String input) {
				Pattern validPattern = Pattern.compile("^[0-9]+d[0-9]+[+\\-]?[0-9]+?$");
				Matcher matcher = validPattern.matcher(input);
				return matcher.matches();
			}
		};
		return null;
	}

}
