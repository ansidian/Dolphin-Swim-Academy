@param String activePage

@template.layout(
activePage = activePage,
content = @`
    <main class="container-xxl mt-4">
        <section>
            <!-- breadcrumb -->
            <nav aria-label="breadcrumb" class="mt-3">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item active" aria-current="page">Register</li>
                </ol>
            </nav>

            <form method="post" action="/register/add">
                <!-- main content -->
                <div class="row">
                    <div class="col-12">
                        <div class="row">
                            <!-- left column -->
                            <div class="col-lg-6">
                                <!-- session dropdown -->
                                <div class="mb-3">
                                    <label for="session" class="form-label">Session</label>
                                    <select id="session" name="session" class="form-select" required>
                                        <option value="1">Session 1: June 17 - June 27</option>
                                        <option value="2">Session 2: July 8 - July 18</option>
                                        <option value="3">Session 3: July 22 - August 1</option>
                                        <option value="4">Session 4: August 5 - August 15</option>
                                    </select>
                                </div>

                                <!-- name -->
                                <div class="mb-3">
                                    <label for="name" class="form-label">Name</label>
                                    <input type="text" id="name" name="name" class="form-control" required>
                                </div>

                                <!-- time 1 selection (desktop view) -->
                                <div class="mb-3 d-none d-lg-block">
                                    <fieldset class="fieldset-reset">
                                        <legend class="legend-reset fs-6">Time (1st Choice)</legend>
                                        <div class="segmented-control">
                                            <input type="radio" id="9-10am" name="timeSlot1" value="9-10am">
                                            <label for="9-10am">9-10am</label>

                                            <input type="radio" id="10-11am" name="timeSlot1" value="10-11am">
                                            <label for="10-11am">10-11am</label>

                                            <input type="radio" id="1-2pm" name="timeSlot1" value="1-2pm">
                                            <label for="1-2pm">1-2pm</label>

                                            <input type="radio" id="2-3pm" name="timeSlot1" value="2-3pm">
                                            <label for="2-3pm">2-3pm</label>
                                        </div>
                                    </fieldset>
                                </div>
                            </div>

                            <!-- right column -->
                            <div class="col-lg-6">
                                <!-- level dropdown -->
                                <div class="mb-3">
                                    <label for="level" class="form-label">Level</label>
                                    <select id="level" name="level" class="form-select">
                                        <option value="Starfish">Starfish</option>
                                        <option value="Minnows">Minnows</option>
                                        <option value="Guppies">Guppies</option>
                                        <option value="Dolphins">Dolphins</option>
                                    </select>
                                </div>

                                <!-- birth year -->
                                <div class="mb-3">
                                    <label for="birthYear" class="form-label">Birth Year</label>
                                    <input type="number" id="birthYear" name="birthYear" class="form-control" required>
                                </div>

                                <!-- time 2 (desktop view) -->
                                <div class="mb-3 d-none d-lg-block">
                                    <fieldset class="fieldset-reset">
                                        <legend class="legend-reset fs-6">Time (2nd Choice)</legend>
                                        <div class="segmented-control">
                                            <input type="radio" id="9-10am_2" name="timeSlot2" value="9-10am">
                                            <label for="9-10am_2">9-10am</label>

                                            <input type="radio" id="10-11am_2" name="timeSlot2" value="10-11am">
                                            <label for="10-11am_2">10-11am</label>

                                            <input type="radio" id="1-2pm_2" name="timeSlot2" value="1-2pm">
                                            <label for="1-2pm_2">1-2pm</label>

                                            <input type="radio" id="2-3pm_2" name="timeSlot2" value="2-3pm">
                                            <label for="2-3pm_2">2-3pm</label>
                                        </div>
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- time slots for mobile  -->
                    <div class="col-12 d-lg-none">
                        <!-- time 1 -->
                        <div class="mb-3">
                            <fieldset class="fieldset-reset">
                                <legend class="legend-reset fs-6">Time (1st Choice)</legend>
                                <div class="segmented-control">
                                    <input type="radio" id="9-10am_mobile" name="timeSlot1" value="9-10am">
                                    <label for="9-10am_mobile">9-10am</label>

                                    <input type="radio" id="10-11am_mobile" name="timeSlot1" value="10-11am">
                                    <label for="10-11am_mobile">10-11am</label>

                                    <input type="radio" id="1-2pm_mobile" name="timeSlot1" value="1-2pm">
                                    <label for="1-2pm_mobile">1-2pm</label>

                                    <input type="radio" id="2-3pm_mobile" name="timeSlot1" value="2-3pm">
                                    <label for="2-3pm_mobile">2-3pm</label>
                                </div>
                            </fieldset>
                        </div>

                        <!-- time 2 -->
                        <div class="mb-3">
                            <fieldset class="fieldset-reset">
                                <legend class="legend-reset fs-6">Time (2nd Choice)</legend>
                                <div class="segmented-control">
                                    <input type="radio" id="9-10am_2_mobile" name="timeSlot2" value="9-10am">
                                    <label for="9-10am_2_mobile">9-10am</label>

                                    <input type="radio" id="10-11am_2_mobile" name="timeSlot2" value="10-11am">
                                    <label for="10-11am_2_mobile">10-11am</label>

                                    <input type="radio" id="1-2pm_2_mobile" name="timeSlot2" value="1-2pm">
                                    <label for="1-2pm_2_mobile">1-2pm</label>

                                    <input type="radio" id="2-3pm_2_mobile" name="timeSlot2" value="2-3pm">
                                    <label for="2-3pm_2_mobile">2-3pm</label>
                                </div>
                            </fieldset>
                        </div>
                    </div>

                    <!-- submit -->
                    <div class="col-12">
                        <div class="mb-3">
                            <button type="submit" class="btn btn-primary">Register</button>
                        </div>
                    </div>
                </div>
            </form>
        </section>
    </main>
    <script src="/js/validate-time-slots.js"></script>

`
)