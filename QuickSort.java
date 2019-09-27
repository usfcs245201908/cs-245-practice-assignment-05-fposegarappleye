class QuickSort implements SortingAlgorithm {

  //@Override
  public void sort(int [] a) {
    qs(a, 0, a.length-1);
  }

  void qs(int[] a, int left, int right) {
    if(left < right) {
      int p = partition(a, left, right);

      // Quicksort before and after partition, respectively
      qs(a, left, p-1); // Before
      qs(a, p+1, right); // After
    }
  }



  int partition(int[] a, int left, int right) {
    int pivot = a[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
      if (a[j] < pivot) {
        i++;

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
    int temp = a[i+1];
    a[i+1] = a[right];
    a[right] = temp;

    return i + 1;
  }
/*
    int pivot = a[left];
    while(left < right) {
      while(a[left] < pivot) left++;
      while(a[right] > pivot) right++;
      swap(a, right, left);
    }
    return left;
  }*/

    /*
    if(left < right) {
      int pivot = a[right];
      int i = (left - 1);
      for (int j = left ; j < right ; j++) {
        if(a[j] <= pivot) {
          i++;
          swap(a, i, j);
        }
      }
      swap(a, a[i+1], a[i+2]);
      return i+1;
    }
    return left;
  }*/

      /*int i = left + 1;
      int j = right;
      while(i < j) {
        while( i < right && a[i] < a[pivot] ) {
          ++i;
        }
        while( j > i && a[j]  > a[pivot] ) {
          --j;
        }
        swap(a, j, pivot);
        return j;
      }
    }
    return left;
  }*/


  void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

}
