const canvas = document.getElementById('drawingCanvas');
const ctx = canvas.getContext('2d');
const colorPicker = document.getElementById('colorPicker');
const thicknessSlider = document.getElementById('thickness');
const eraserButton = document.getElementById('eraser');
const clearButton = document.getElementById('clear');

canvas.width = window.innerWidth * 0.8;
canvas.height = window.innerHeight * 0.8;

let drawing = false;
let color = colorPicker.value;
let thickness = thicknessSlider.value;
let erasing = false;

const socket = new WebSocket('ws://localhost:8080');

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

    socket.send(JSON.stringify({
        type: 'draw',
        x: e.clientX - canvas.offsetLeft,
        y: e.clientY - canvas.offsetTop,
        color: ctx.strokeStyle,
        thickness: ctx.lineWidth,
        erasing: erasing
    }));
}

canvas.addEventListener('mousedown', startPosition);
canvas.addEventListener('mouseup', endPosition);
canvas.addEventListener('mousemove', draw);

colorPicker.addEventListener('input', (e) => color = e.target.value);
thicknessSlider.addEventListener('input', (e) => thickness = e.target.value);
eraserButton.addEventListener('click', () => erasing = !erasing);
clearButton.addEventListener('click', () => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    socket.send(JSON.stringify({ type: 'clear' }));
});

socket.addEventListener('message', (event) => {
    const message = JSON.parse(event.data);

    if (message.type === 'draw') {
        ctx.lineWidth = message.thickness;
        ctx.strokeStyle = message.erasing ? '#ffffff' : message.color;
        ctx.lineTo(message.x, message.y);
        ctx.stroke();
        ctx.beginPath();
        ctx.moveTo(message.x, message.y);
    } else if (message.type === 'clear') {
        ctx.clearRect(0, 0, canvas.width, canvas.height);
    }
});
