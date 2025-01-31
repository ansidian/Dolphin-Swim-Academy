@param String activePage
@param java.util.List<cs3220.hw3.model.Classes> classes
@param Integer session
@param java.util.List<cs3220.hw3.model.Student> allStudents

@template.layout(
activePage = activePage,
content = @`
    <main class="container mt-4">
        <div class="d-flex justify-content-between align-items-center mb-4">
            <div class="col-md-4">
                <select id="sessionSelect" class="form-select"
                        onchange="window.location.href='/classes?session=' + this.value">
                    <option value="1" selected="${session == 1}">Session 1: June 17 - June 27</option>
                    <option value="2" selected="${session == 2}">Session 2: July 8 - July 18</option>
                    <option value="3" selected="${session == 3}">Session 3: July 22 - August 1</option>
                    <option value="4" selected="${session == 4}">Session 4: August 5 - August 15</option>
                </select>
            </div>
            <div>
                <a href="/classes/new" class="btn btn-primary">Create New Class</a>
            </div>
        </div>

        @if(classes.isEmpty())
            <div class="alert alert-danger" role="alert">No classes found for this session.</div>
        @else
            @for(cs3220.hw3.model.Classes cls : classes)
                <div class="card mb-4">
                    <div class="card-header d-flex justify-content-between align-items-center">
                        <h5 class="card-title mb-0">
                            ${cls.getLevel()} - ${cls.getTime()}
                        </h5>
                        <button type="button" class="btn btn-primary btn-sm"
                                data-bs-toggle="modal"
                                data-bs-target="#assignModal${cls.getLevel()}${cls.getTime()}">
                            Assign Student
                        </button>
                    </div>
                    <div class="card-body">
                        @if(cls.getStudents().isEmpty())
                            <div class="alert alert-danger" role="alert">No students enrolled</div>
                        @else
                            <table class="table table-striped">
                                <thead class="table-dark">
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Age</th>
                                </tr>
                                </thead>
                                <tbody>
                                @for(cs3220.hw3.model.Student student : cls.getStudents())
                                    <tr>
                                        <td>${student.getId()}</td>
                                        <td>${student.getName()}</td>
                                        <td>${student.getAge()}</td>
                                    </tr>
                                @endfor
                                </tbody>
                            </table>
                        @endif
                    </div>
                </div>

                <!-- modal  -->
                <div class="modal fade" id="assignModal${cls.getLevel()}${cls.getTime()}" tabindex="-1">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Assign Student to ${cls.getLevel()} - ${cls.getTime()}</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                            </div>
                            <div class="modal-body">
                                <form action="/classes/assign" method="post">
                                    <input type="hidden" name="session" value="${cls.getSession()}">
                                    <input type="hidden" name="level" value="${cls.getLevel()}">
                                    <input type="hidden" name="time" value="${cls.getTime()}">

                                    <div class="mb-3">
                                        <label for="studentId" class="form-label">Select Student</label>
                                        <select name="studentId" class="form-select" required>
                                            <option value="">Choose a student...</option>
                                            @for(cs3220.hw3.model.Student student : allStudents)
                                                @if(student.getAssignedClass() == null || !student.getAssignedClass().getId().equals(cls.getId()))
                                                    <option value="${student.getId()}">
                                                        ${student.getName()}
                                                        @if(student.getAssignedClass() != null)
                                                            (Current: ${student.getLevel()} - ${student.getTimeSlot1()})
                                                        @else
                                                            (Unassigned)
                                                        @endif
                                                    </option>
                                                @endif
                                            @endfor
                                        </select>
                                    </div>

                                    @if(allStudents.stream().allMatch(student ->
            student.getAssignedClass() != null &&
            student.getAssignedClass().getId().equals(cls.getId())))
                                        <div class="alert alert-danger" role="alert">
                                            All students are already assigned to classes.
                                        </div>
                                    @endif

                                    <button type="submit" class="btn btn-primary">Assign</button>
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            @endfor
        @endif
    </main>
`
)