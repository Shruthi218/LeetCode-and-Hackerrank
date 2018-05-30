class PythagoreanTriplet 
{ 
	
	static boolean isTriplet(int arr[], int n)
	{// Square array elements
		for (int i=0; i<n; i++)
			arr[i] = arr[i]*arr[i];

		
		Arrays.sort(arr);

		
		for (int i = n-1; i >= 2; i--)
		{
			// To find the other two elements, start two index
			// variables from two corners of the array and move
			// them toward each other
			int l = 0; // index of the first element in arr[0..i-1]
			int r = n-2; // index of the last element in arr[0..i-1]
			while (l < r)
			{
				// A triplet found
				if (arr[l] + arr[r] == arr[i])
					return true;

				// Else either move 'l' or 'r'
				if (arr[l] + arr[r] < arr[i])
				l++;
				else
				r--;
			}
		}

		// If we reach here, then no triplet found
		return false;
	}
	
