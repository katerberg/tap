/*******************************************************************************
 * Copyright (c) 2012 "Mark Katerberg"
 * 
 * 
 * This file is part of Katerproject.
 * 
 * Katerproject is free software: you can redistribute it and/or modify
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
package net.katerberg.hello;

import java.util.Random;

import android.test.AndroidTestCase;

public class InputTest extends AndroidTestCase{
	
	Input test;

	public void setup(){
		test = new Input();
	}
	
	public void testGetText_Does() {
		setup();
		String testString = new Random().toString();
		
		test.setText(testString);
		
		assertEquals(testString, test.getText());
	}
	
	public void testGetId_Does() {
		setup();
		String testString = new Random().toString();
		
		test.setId(testString);
		
		assertEquals(testString, test.getId());
	}
}
