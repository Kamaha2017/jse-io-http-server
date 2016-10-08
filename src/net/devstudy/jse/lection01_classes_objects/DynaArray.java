package net.devstudy.jse.lection01_classes_objects;

import java.util.Arrays;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class DynaArray {
	private int[] array;
	private int size;
	
	public DynaArray() {
		array = new int[10];
	}

	public void add(int element) {
		if (size == array.length) {
			int[] temp = array;
			array = new int[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[size++] = element;
	}

	public int get(int index) {
		return array[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		array = new int[10];
	}

	public int[] toArray() {
		return Arrays.copyOf(array, size);
	}
}
