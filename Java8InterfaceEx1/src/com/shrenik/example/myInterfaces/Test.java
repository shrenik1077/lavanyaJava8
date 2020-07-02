package com.shrenik.example.myInterfaces;

import java.util.Collections;
import java.util.List;

public class Test implements StudentInterface {

	@Override
	public int getMinimumValueFromList(List<Integer> numbersList) {
		return Collections.min(numbersList);
	}

	// default methods optionally override only if you implement one interface
}
