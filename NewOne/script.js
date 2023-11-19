function login() {
    document.querySelector('.login-container').style.display = 'none';
    document.querySelector('.attendance-container').style.display = 'block';
    document.querySelector('.leave-container').style.display = 'block';
}
function markAttendance() {
    alert("Attendance marked successfully!");
}
function requestLeave() {
    const reason = document.getElementById('reason').value;
    const leaveDate = document.getElementById('leaveDate').value;

    if (reason && leaveDate) {
        alert("Leave requested for " + leaveDate + " due to: " + reason);
    } else {
        alert("Please fill in all the fields.");
    }
}