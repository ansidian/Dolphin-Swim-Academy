@param String activePage

@template.layout(
activePage = activePage,
content = @`
    <main class="container-xxl mt-4">
        <h2>Create New Class</h2>

        <form method="post" action="/classes/add" class="mt-4">
            <!-- session -->
            <div class="mb-3">
                <label for="session" class="form-label">Session</label>
                <select id="session" name="session" class="form-select" required>
                    <option value="1">Session 1: June 17 - June 27</option>
                    <option value="2">Session 2: July 8 - July 18</option>
                    <option value="3">Session 3: July 22 - August 1</option>
                    <option value="4">Session 4: August 5 - August 15</option>
                </select>
            </div>

            <!-- level -->
            <div class="mb-3">
                <label for="level" class="form-label">Level</label>
                <select id="level" name="level" class="form-select" required>
                    <option value="Starfish">Starfish</option>
                    <option value="Minnows">Minnows</option>
                    <option value="Guppies">Guppies</option>
                    <option value="Dolphins">Dolphins</option>
                </select>
            </div>

            <!-- time -->
            <div class="mb-3">
                <label for="time" class="form-label">Time</label>
                <select id="time" name="time" class="form-select" required>
                    <option value="9-10am">9:00 AM - 10:00 AM</option>
                    <option value="10-11am">10:00 AM - 11:00 AM</option>
                    <option value="1-2pm">1:00 PM - 2:00 PM</option>
                    <option value="2-3pm">2:00 PM - 3:00 PM</option>
                </select>
            </div>

            <button type="submit" class="btn btn-primary">Create Class</button>
            <a href="/classes" class="btn btn-secondary">Cancel</a>
        </form>
    </main>
`
)