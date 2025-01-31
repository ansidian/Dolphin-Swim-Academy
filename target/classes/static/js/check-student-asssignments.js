// wait for DOM
document.addEventListener('DOMContentLoaded', function () {
    const studentRows = document.querySelectorAll('table tbody tr');

    studentRows.forEach(row => {
        const studentId = row.cells[0].textContent;
        const nameCell = row.cells[1];

        // API call to check if student is assigned
        fetch(`/api/students/${studentId}/assigned`)
            .then(response => response.json())
            .then(data => {
                if (data.assigned) {
                    // assigned
                    nameCell.classList.add('text-success');
                } else {
                    // unassigned
                    nameCell.classList.add('text-danger');
                }
            })
            .catch(error => {
                console.error('Error checking student assignment:', error);
            });
    });
});