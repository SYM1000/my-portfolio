/* Gets a string to display on page  */
async function fetch() {

  const textFromResponse = "This is a random string";

  const dateContainer = document.getElementById('string-container');
  dateContainer.innerText = textFromResponse;
}
