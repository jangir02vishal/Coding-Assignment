const form = document.getElementById('survey-form');
const popup = document.getElementById('popup');
const popupContent = document.getElementById('popup-content');
const popupResults = document.getElementById('popup-results');
const closePopup = document.getElementById('close-popup');

form.addEventListener('submit', function(e) {
e.preventDefault();

// Gather form data
const firstName = document.getElementById('first-name').value;
const lastName = document.getElementById('last-name').value;
const dob = document.getElementById('dob').value;
const country = document.getElementById('country').value;
const profession = document.getElementById('profession').value;
const email = document.getElementById('email').value;
const mobile = document.getElementById('mobile').value;
const gender = document.querySelector('input[name="gender"]:checked').value;

if (!gender) {
    alert('Please select a gender.');
    return;
}

// Display the results in the popup
popupResults.innerHTML = `
    <p><strong>First Name:</strong> ${firstName}</p>
    <p><strong>Last Name:</strong> ${lastName}</p>
    <p><strong>Date of Birth:</strong> ${dob}</p>
    <p><strong>Country:</strong> ${country}</p>
    <p><strong>Gender:</strong> ${gender}</p>
    <p><strong>Profession:</strong> ${profession}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Mobile Number:</strong> ${mobile}</p>
`;

// Show the popup
popup.style.display = 'block';
});

closePopup.addEventListener('click', function() {
// Close the popup and reset the form
popup.style.display = 'none';
form.reset();
});