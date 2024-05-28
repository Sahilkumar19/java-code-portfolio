const socket = new WebSocket('wss://your-deployed-server-url');

const colorPicker = document.getElementById('colorPicker');
const thicknessSlider = document.getElementById('thickness');
const eraserButton = document.getElementById('eraser');
const clearButton = document.getElementById('clear');
const messageInput = document.getElementById('messageInput');
const sendButton = document.getElementById('sendButton');
const messagesContainer = document.getElementById('messages');
const canvas = document.getElementById('drawingCanvas');
const ctx = canvas.getContext('2d');

canvas.width = 800;
canvas.height = 500;

let drawing = false;
let color = colorPicker.value;
let thickness = thicknessSlider.value;
let erasing = false;

function startPosition(e) {
    drawing = true;
    draw(e);
}

function endPosition() {
    drawing = false;
    ctx.beginPath();
}

function draw(e) {
    if (!drawing) return;

    ctx.lineWidth = thickness;
    ctx.lineCap = 'round';
    ctx.strokeStyle = erasing ? '#ffffff' : color;

    ctx.lineTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
    ctx.stroke();
    ctx.beginPath();
    ctx.moveTo(e.clientX - canvas.offsetLeft, e.clientY - canvas.offsetTop);
}

canvas.addEventListener('mousedown', startPosition);
canvas.addEventListener('mouseup', endPosition);
canvas.addEventListener('mousemove', draw);

colorPicker.addEventListener('change', () => {
    color = colorPicker.value;
});

thicknessSlider.addEventListener('change', () => {
    thickness = thicknessSlider.value;
});

eraserButton.addEventListener('click', () => {
    erasing = true;
});

clearButton.addEventListener('click', () => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
});

sendButton.addEventListener('click', sendMessage);
messageInput.addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
        sendMessage();
    }
});

function sendMessage() {
    const message = messageInput.value.trim();
    if (message !== '') {
        socket.send(JSON.stringify({ type: 'chat', message }));
        messageInput.value = '';
    }
}

socket.addEventListener('message', function (event) {
    const message = JSON.parse(event.data);
    if (message.type === 'chat') {
        appendMessage(message);
    }
});

function appendMessage(message) {
    const messageElement = document.createElement('div');
    messageElement.textContent = message.message;
    messagesContainer.appendChild(messageElement);
    messagesContainer.scrollTop = messagesContainer.scrollHeight;
}
