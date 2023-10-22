function sortArrayDescending(arr) {
    const n = arr.length;
  
  //sorting array in descending order
    for (let i = 0; i < n - 1; i++) {
      for (let j = 0; j < n - 1 - i; j++) {
        // Compare adjacent elements and swap them if they are in the wrong order
        if (arr[j] < arr[j + 1]) {
          // Swap arr[j] and arr[j + 1]
          const temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
  const input = prompt("Enter an array of numbers separated by commas:");
  const inputArray = input.split(",").map(Number);
  
  sortArrayDescending(inputArray);
  
  console.log("Array sorted in descending order:", inputArray);