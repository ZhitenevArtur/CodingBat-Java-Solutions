//Given an array of ints, return true if 6 appears as either the first or last element in the 
//array. The array will be length 1 or more.
public boolean firstLast6(int[] nums) {
  return (nums[0]==6 || nums[nums.length-1]==6);
}

//Given an array of ints, return true if the array is length 1 or more, and the first element 
//and the last element are equal.
public boolean sameFirstLast(int[] nums) {
  return (nums.length>0 && nums[0]==nums[nums.length-1]);
}

//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

//Given 2 arrays of ints, a and b, return true if they have the same first element or they 
//have the same last element. Both arrays will be length 1 or more.
public boolean commonEnd(int[] a, int[] b) {
  return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
}

//Given an array of ints length 3, return the sum of all the elements.
public int sum3(int[] nums) {
  int out=0;
  for(int i =0;i< nums.length;i++){
    out+=nums[i];
  }
  return out;
}

//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 
//3} yields {2, 3, 1}.
public int[] rotateLeft3(int[] nums) {
  int temp;
  for(int i =2;i>0;i--){
    temp = nums[0];
    nums[0] = nums[i];
    nums[i] = temp;
  }
  return nums;
}

//Given an array of ints length 3, return a new array with the elements in reverse order, 
//so {1, 2, 3} becomes {3, 2, 1}.
public int[] reverse3(int[] nums) {
  int temp;
  temp = nums[0];
  nums[0] = nums[2];
  nums[2] = temp;
  return nums;
}

//Given an array of ints length 3, figure out which is larger, the first or last element in the 
//array, and set all the other elements to be that value. Return the changed array.
public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0],nums[2]);
  for(int i =0;i<nums.length;i++){
    nums[i] = max;
  }
  return nums;
}

//Given an array of ints, return the sum of the first 2 elements in the array. If the array 
//length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
public int sum2(int[] nums) {
  int sum = 0;
  for(int i =0;i<nums.length;i++){
    sum+=nums[i];
    if(i>0) break;
  }
  return sum;
}

//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their 
//middle elements.
public int[] middleWay(int[] a, int[] b) {
  int[] mid = new int[2];
  mid[0] = a[1];
  mid[1] = b[1];
  return mid;
}

//Given an array of ints, return a new array length 2 containing the first and last elements 
//from the original array. The original array will be length 1 or more.
public int[] makeEnds(int[] nums) {
  int[] out = new int[2];
  out[0]=nums[0];
  out[1]=nums[nums.length-1];
  return out;
}

//Given an int array length 2, return true if it contains a 2 or a 3.
public boolean has23(int[] nums) {
  for(int i =0;i<nums.length;i++){
    if(nums[i]==2 || nums[i]==3) return true;
  }
  return false;
}

//Given an int array length 2, return true if it does not contain a 2 or 3.
public boolean no23(int[] nums) {
  for(int i =0;i<nums.length;i++){
    if(nums[i]==2 || nums[i]==3) return false;
  }
  return true;
}

//Given an int array, return a new array with double the length where its last element is the 
//same as the original array, and all the other elements are 0. The original array will be 
//length 1 or more. Note: by default, a new int array contains all 0's.
public int[] makeLast(int[] nums) {
  int[] out = new int[nums.length*2];
  out[out.length-1] = nums[nums.length-1];
  return out;
}

//Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be 
//length 0, 1, or 2.
public boolean double23(int[] nums) {
  if(nums.length==2){
    if(nums[0]==2 && nums[1]==2) return true;
    else if(nums[0]==3 && nums[1]==3) return true;
  }
  return false;
}

//Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 
//3 element to 0. Return the changed array.
public int[] fix23(int[] nums) {
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==2 && nums[i+1]==3) nums[i+1]=0;
  }
  return nums;
}

//Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as 
//their first element.
public int start1(int[] a, int[] b) {
  int out=0;
  if (a.length!=0 && a[0]==1) out++;
  if (b.length!=0 && b[0]==1) out++;
  return out;
}

//Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each 
//array. Return the array which has the largest sum. In event of a tie, return a.
public int[] biggerTwo(int[] a, int[] b) {
  int aSum=0;
  int bSum=0;
  aSum=a[0]+a[1];
  bSum=b[0]+b[1];
  if(bSum>aSum) return b;
  else return a;
}

//Given an array of ints of even length, return a new array length 2 containing the middle 
//two elements from the original array. The original array will be length 2 or more.
public int[] makeMiddle(int[] nums) {
  int[] mid = new int[2];
  mid[0]=nums[(nums.length/2)-1];
  mid[1]=nums[nums.length/2];
  return mid;
}

//Given 2 int arrays, each length 2, return a new array length 4 containing all their 
//elements.
public int[] plusTwo(int[] a, int[] b) {
  int[] all = new int[a.length+b.length];
  int i=0;
  for(i = 0;i<a.length;i++) all[i]=a[i];
  for(int k=0;k<b.length;k++) all[k+i]=b[k];
  return all;
}

//Given an array of ints, swap the first and last elements in the array. Return the modified 
//array. The array length will be at least 1.
public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1]=temp;
  return nums;
}

//Given an array of ints of odd length, return a new array length 3 containing the elements 
//from the middle of the array. The array length will be at least 3.
public int[] midThree(int[] nums) {
  int[] mid = new int[3];
  mid[0]=nums[(nums.length/2)-1];
  mid[1]=nums[nums.length/2];
  mid[2]=nums[(nums.length/2)+1];
  return mid;
}

//Given an array of ints of odd length, look at the first, last, and middle values in the array 
//and return the largest. The array length will be a least 1.
public int maxTriple(int[] nums) {
  int max=0;
  if(nums[0] > max)max=nums[0];
  if(nums[nums.length-1] > max) max = nums[nums.length-1];
  if(nums[nums.length/2] > max) max = nums[nums.length/2];
  return max;
}

//Given an int array of any length, return a new array of its first 2 elements. If the array is 
//smaller than length 2, use whatever elements are present.
public int[] frontPiece(int[] nums) {
  if(nums.length<3) return nums;
  int[] first = new int[2];
  for(int i =0;i<2;i++) first[i]=nums[i];
  return first;
}

//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if 
//the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
public boolean unlucky1(int[] nums) {
  if(nums.length<2) return false;
  for(int i =0;i<2;i++){
    if(nums[i]==1 && nums[i+1]==3) return true;
  }
  for(int i = nums.length-2;i<nums.length-1;i++){
    if(nums[i]==1 && nums[i+1]==3) return true;
  }
  return false;
}

//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the 
//elements from a followed by the elements from b. The arrays may be any length, including 
//0, but there will be 2 or more elements available between the 2 arrays.
public int[] make2(int[] a, int[] b) {
  int[] front = new int[2];
  int count=0;
  for(int i =0;i<a.length;i++){
    if(count<2) {
      front[i]=a[i];
      count++;
    }
  }
  for(int i = 0;i<b.length;i++){
    if(count<2) {
      front[count]=b[i];
      count++;
    }
  }
  return front;
}

//Given 2 int arrays, a and b, of any length, return a new array with the first element of 
//each array. If either array is length 0, ignore that array.
public int[] front11(int[] a, int[] b) {
  int[] first;
  if(a.length==0 && b.length==0) first = new int[0];
  else if(a.length==0 || b.length==0) first = new int[1];
  else first = new int[2];
  
  if(a.length!=0) {
    first[0]=a[0];
    if(b.length!=0) first[1]=b[0];
  }
  else if(b.length!=0) first[0]=b[0];
  return first;
}
