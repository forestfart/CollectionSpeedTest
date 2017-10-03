package com.collectionsspeedtest.speedtest;

import java.util.*;

public class SpeedtestApplication {

	public static void main(String[] args) {

		LinkedListOperations linkedListOperations = new LinkedListOperations();
		linkedListOperations.run();
		HashMapOperations hashMapOperations = new HashMapOperations();
		hashMapOperations.run();
	}
}
