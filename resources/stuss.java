	public static boolean isAnagram(String first, String second) {

	    int[] array = new int[28];

        for(int index = 0; index < first.length(); index++) {
        	int temp = first.charAt(index) - 97;
        	array[temp] = array[temp]++;

        	temp = second.charAt(index) - 97;
        	array[temp] = array[temp]--;
    	}

    	for(int index = 0; index < array.length; index++) {
        	if(array[index] != 0) {
        		return false;
        	}
    	}

    	return true;
	}