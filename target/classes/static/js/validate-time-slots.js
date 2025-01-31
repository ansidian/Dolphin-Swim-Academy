document.addEventListener('DOMContentLoaded', function () {
    const timeSlot1Radios = document.querySelectorAll('input[name="timeSlot1"]');
    const timeSlot2Radios = document.querySelectorAll('input[name="timeSlot2"]');

    // disable corresponding time in the other slot
    function handleTimeSelection(selectedRadio, otherSlotRadios) {
        // first enable all radios in the other slot
        otherSlotRadios.forEach(radio => {
            radio.disabled = false;
            const label = document.querySelector(`label[for="${radio.id}"]`);
            label.classList.remove('text-muted');
        });

        // when a time is selected, disable the same time in the other slot
        if (selectedRadio.checked) {
            const correspondingRadio = Array.from(otherSlotRadios)
                .find(radio => radio.value === selectedRadio.value);

            if (correspondingRadio) {
                correspondingRadio.disabled = true;
                correspondingRadio.checked = false; // Uncheck if it was checked
                const label = document.querySelector(`label[for="${correspondingRadio.id}"]`);
                label.classList.add('text-muted');
            }
        }
    }

    // event listeners for time slot 1
    timeSlot1Radios.forEach(radio => {
        radio.addEventListener('change', function () {
            handleTimeSelection(this, timeSlot2Radios);
        });
    });

    // event listeners for time slot 2
    timeSlot2Radios.forEach(radio => {
        radio.addEventListener('change', function () {
            handleTimeSelection(this, timeSlot1Radios);
        });
    });
});