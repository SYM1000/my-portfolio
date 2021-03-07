/* Gets a string to display on page  */
async function getRandomString() {

  //const textFromResponse = "This is a random string";

  // Send a request to /random-string.
  const responseFromServer = await fetch('/random-string');
    
  // Parse the response as JSON.
  const messages = await responseFromServer.json();

    const randomString = words[Math.floor(Math.random() * messages.length)];
    console.log(randomString);
    alert(randomString);

  const dateContainer = document.getElementById('string-container');
  dateContainer.innerText = randomString;
}
