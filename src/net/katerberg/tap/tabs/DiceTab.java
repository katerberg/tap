package net.katerberg.tap.tabs;
/*******************************************************************************
 * Copyright (c) 2012 "Mark Katerberg"
 * 
 * 
 * This file is part of TAP.
 * 
 * TAP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
import net.katerberg.tap.R;
import net.katerberg.tap.beans.Die;
import net.katerberg.tap.listeners.DiceListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DiceTab extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_tab);
        createListeners();
    }

	private void createListeners() {
		TextView diceDisplayView = (TextView)this.findViewById(R.id.diceDisplayView);
		if (null == diceDisplayView) { return; }
		
		((Button)this.findViewById(R.id.d4)).setOnClickListener(createRollListener(4, diceDisplayView));
		((Button)this.findViewById(R.id.d6)).setOnClickListener(createRollListener(6, diceDisplayView));
		((Button)this.findViewById(R.id.d8)).setOnClickListener(createRollListener(8, diceDisplayView));
		((Button)this.findViewById(R.id.d10)).setOnClickListener(createRollListener(10, diceDisplayView));
		((Button)this.findViewById(R.id.d12)).setOnClickListener(createRollListener(12, diceDisplayView));
		((Button)this.findViewById(R.id.d20)).setOnClickListener(createRollListener(20, diceDisplayView));
		((Button)this.findViewById(R.id.d100)).setOnClickListener(createRollListener(100, diceDisplayView));
		
	}

	private OnClickListener createRollListener(final Integer dieSize, final TextView outputField) {
		return new DiceListener(new Die(1, dieSize, null), outputField);
	}
}
