function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ') {
            // If a space is encountered, reverse the word and append it to the result.
            reversedSentence = reversedSentence + reverseWord(word) + ' ';
            word = '';
        } else {
            // Build the word character by character.
            word = word + sentence[i];
        }
    }

    // Reverse the last word (no space after it).
    reversedSentence = reversedSentence + reverseWord(word);

    return reversedSentence;
}

function reverseWord(word) {
    let reversedWord = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversedWord = reversedWord + word[i];
    }
    return reversedWord;
}

const inputSentence = prompt("Enter a Sentence:");
const reversedResult = reverseWords(inputSentence);
console.log(reversedResult);